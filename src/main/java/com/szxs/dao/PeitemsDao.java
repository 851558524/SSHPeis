package com.szxs.dao;

import com.szxs.entity.Itemtypes;
import com.szxs.entity.Peitems;

import java.util.List;

public interface PeitemsDao {
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
    void updatePeitems(Peitems p);
}
