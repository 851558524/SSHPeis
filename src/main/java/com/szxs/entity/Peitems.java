package com.szxs.entity;

/**
 * 检查项目
 */
public class Peitems {
    private int itemid ;
    private String itemname ;
    private Integer necessary = 0 ;
    private String ref ;
    private float price ;
    private String info;
    private Itemtypes itemtypes;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Itemtypes getItemtypes() {
        return itemtypes;
    }

    public void setItemtypes(Itemtypes itemtypes) {
        this.itemtypes = itemtypes;
    }
}
