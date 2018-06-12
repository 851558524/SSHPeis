package com.szxs.dao.impl;

import com.szxs.dao.ItemtypesDao;
import com.szxs.entity.Itemtypes;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemtypesDaoImpl extends HibernateDaoSupport implements ItemtypesDao {

    public List<Itemtypes> queryItemtypes() {
        return this.currentSession().createCriteria(Itemtypes.class).list();
    }

}
