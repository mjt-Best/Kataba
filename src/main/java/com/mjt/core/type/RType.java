package com.mjt.core.type;

/**
 * projectName:Kataba
 *
 * @author:马江涛
 * @Time: 2020/10/19  17:13
 * description:枚举类型    标记结果值
 */
public enum RType {
    成功(1),失败(2),登陆失败(3);
    private int val;

    public int getVal() {
        return val;
    }

    private RType(int v) {
        this.val = v;
    }
}
