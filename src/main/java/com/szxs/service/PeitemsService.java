package com.szxs.service;

import com.szxs.entity.Itemtypes;
import com.szxs.entity.Peitems;

import java.util.List;

public interface PeitemsService {
    /**
     * 根据类型ID查询所有的检查项目
     * @param itemtypes
     * @return
     */
    List<Peitems> queryPeitemsByTypeid(Itemtypes itemtypes);

    /**
     * 根据ID查询检查项目
     * @param itemid
     * @return
     */
    Peitems queryPeitemsById(int itemid);

    /**
     * 修改检查项目
     * @param p
     */
    boolean updatePeitems(Peitems p);

    /**
     * 查询所有项目类型
     * @return
     */
    List<Itemtypes> queryItemtypes();
}
