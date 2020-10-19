package com.mjt.util;

/**
 * projectName: Kataba
 *
 * @author: 马江涛
 * time:2020/10/19  17:39
 * desription:字符串验证是否为空
 */
public class StrUtil {
    /**校验是否为空
     *
     * @return true 非空  false为空*/
    private static boolean ckeckNoEmpty(String... strs){
        boolean r = true;
        for (String s : strs) {
            if (s == null || s.length() == 0){
                r = false;
                break;
            }
        }

        return r;
    }
}