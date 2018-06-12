package com.szxs.entity;

/**
 * 类型
 */
public class Itemtypes {
    private int typeid;
    private String typename;

    public Itemtypes() {
    }

    public Itemtypes(int typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
