package com.deepexi.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.login.domain.eo.CommodityCategoryPropertyGroupRelationship;
import com.deepexi.login.service.CommodityCategoryPropertyGroupRelationshipService;
import com.deepexi.login.mapper.CommodityCategoryPropertyGroupRelationshipMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class CommodityCategoryPropertyGroupRelationshipServiceImpl implements CommodityCategoryPropertyGroupRelationshipService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommodityCategoryPropertyGroupRelationshipMapper commodityCategoryPropertyGroupRelationshipMapper;

    @Override
    public PageBean<CommodityCategoryPropertyGroupRelationship> findPage(CommodityCategoryPropertyGroupRelationship eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<CommodityCategoryPropertyGroupRelationship> pages =  commodityCategoryPropertyGroupRelationshipMapper.findList(eo);
        return new PageBean<CommodityCategoryPropertyGroupRelationship>(pages);
    }

    @Override
    public List<CommodityCategoryPropertyGroupRelationship> findAll(CommodityCategoryPropertyGroupRelationship eo) {
        List<CommodityCategoryPropertyGroupRelationship> list = commodityCategoryPropertyGroupRelationshipMapper.findList(eo);
        return list;
    }
    @Override
    public CommodityCategoryPropertyGroupRelationship detail(Integer  pk) {
        CommodityCategoryPropertyGroupRelationship eo = commodityCategoryPropertyGroupRelationshipMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,CommodityCategoryPropertyGroupRelationship eo) {
        CommodityCategoryPropertyGroupRelationship old = commodityCategoryPropertyGroupRelationshipMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = commodityCategoryPropertyGroupRelationshipMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(CommodityCategoryPropertyGroupRelationship eo) {
        int result = commodityCategoryPropertyGroupRelationshipMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = commodityCategoryPropertyGroupRelationshipMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = commodityCategoryPropertyGroupRelationshipMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}