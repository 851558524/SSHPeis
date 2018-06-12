package com.szxs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.szxs.entity.Itemtypes;
import com.szxs.entity.Peitems;
import com.szxs.service.PeitemsService;
import oracle.jdbc.driver.OracleDriver;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PeitemsAction extends ActionSupport{
    @Resource
    private PeitemsService peitemsService;
    private List<Itemtypes> itemtypesList;
    private List<Peitems> peitemsList;
    private Itemtypes itemtypes;
    private int itemid;
    private Peitems peitems;

    /**
     * 显示首页
     * @return
     */
    public String showIndex(){
        itemtypesList = peitemsService.queryItemtypes();
        peitemsList = peitemsService.queryPeitemsByTypeid(itemtypes);
        itemtypesList.add(0,new Itemtypes(0,"--请选择--"));

        return SUCCESS;
    }

    /**
     * 显示单个检查项目
     * @return
     */
    public String showPeitems(){
        itemtypesList = peitemsService.queryItemtypes();
        peitems = peitemsService.queryPeitemsById(itemid);
        return SUCCESS;
    }

    /**
     * 修改体检项目
     * @return
     */
    public String updatePeitems(){
        peitemsService.updatePeitems(peitems);
        return SUCCESS;

    }




    public PeitemsService getPeitemsService() {
        return peitemsService;
    }

    public void setPeitemsService(PeitemsService peitemsService) {
        this.peitemsService = peitemsService;
    }

    public List<Itemtypes> getItemtypesList() {
        return itemtypesList;
    }

    public void setItemtypesList(List<Itemtypes> itemtypesList) {
        this.itemtypesList = itemtypesList;
    }

    public List<Peitems> getPeitemsList() {
        return peitemsList;
    }

    public void setPeitemsList(List<Peitems> peitemsList) {
        this.peitemsList = peitemsList;
    }

    public Itemtypes getItemtypes() {
        return itemtypes;
    }

    public void setItemtypes(Itemtypes itemtypes) {
        this.itemtypes = itemtypes;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public Peitems getPeitems() {
        return peitems;
    }

    public void setPeitems(Peitems peitems) {
        this.peitems = peitems;
    }
}
