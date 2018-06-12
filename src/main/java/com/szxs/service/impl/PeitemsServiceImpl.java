package com.szxs.service.impl;

import com.szxs.dao.ItemtypesDao;
import com.szxs.dao.PeitemsDao;
import com.szxs.entity.Itemtypes;
import com.szxs.entity.Peitems;
import com.szxs.service.PeitemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeitemsServiceImpl implements PeitemsService {
    @Resource
    private PeitemsDao peitemsDao;
    @Resource
    private ItemtypesDao itemtypesDao;

    public List<Peitems> queryPeitemsByTypeid(Itemtypes itemtypes) {
        return peitemsDao.queryPeitemsByTypeid(itemtypes);
    }

    public Peitems queryPeitemsById(int itemid) {
        return peitemsDao.queryPeitemsById(itemid);
    }

    public boolean updatePeitems(Peitems p) {
        try {
            peitemsDao.updatePeitems(p);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public List<Itemtypes> queryItemtypes() {
        return itemtypesDao.queryItemtypes();
    }
}
