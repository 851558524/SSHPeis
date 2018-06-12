package com.szxs.dao;

import com.szxs.entity.Itemtypes;

import java.util.List;

public interface ItemtypesDao {
    /**
     * 查询所有项目类型
     * @return
     */
    List<Itemtypes> queryItemtypes();
}
