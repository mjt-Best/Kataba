package com.mjt.vo;

import com.mjt.core.type.RType;
import lombok.Data;

/**
 * projectName: Kataba
 *
 * @author: 马江涛
 * time:2020/10/19  17:45
 * desription:统一结果返回格式   整个系统的返回格式
 */
@Data
public class R<T> {
    private int code;//返回码
    private String msg;//返回码的信息说明
    private T data;//返回的数据

    public static <T> R setR(int c, String m, T obj) {
        R r = new R();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }
    //成功
    public static <T> R ok(T t){
        return setR(RType.成功.getVal(),"ok",t);
    }
    //失败
    public static R fail(){
        return setR(RType.失败.getVal(),"fail",null);
    }

}