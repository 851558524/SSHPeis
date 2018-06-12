package com.szxs.dao.impl;

import com.szxs.dao.PeitemsDao;
import com.szxs.entity.Itemtypes;
import com.szxs.entity.Peitems;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeitemsDaoImpl extends HibernateDaoSupport implements PeitemsDao {

    public List<Peitems> queryPeitemsByTypeid(Itemtypes itemtypes) {
        Criteria criteria = this.currentSession().createCriteria(Peitems.class);
        //类型有没有选择,没有选择就不加条件
        if(itemtypes != null && itemtypes.getTypeid() > 0){
            criteria.add(Restrictions.eq("itemtypes.typeid",itemtypes.getTypeid()));
        }
        return criteria.list();
    }

    public Peitems queryPeitemsById(int itemid) {
        return (Peitems)this.currentSession().load(Peitems.class,itemid);
    }

    public void updatePeitems(Peitems p) {
        this.currentSession().update(p);
    }
}
