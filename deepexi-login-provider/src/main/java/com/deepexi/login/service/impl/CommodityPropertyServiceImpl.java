package com.deepexi.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.login.domain.eo.CommodityProperty;
import com.deepexi.login.service.CommodityPropertyService;
import com.deepexi.login.mapper.CommodityPropertyMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class CommodityPropertyServiceImpl implements CommodityPropertyService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CommodityPropertyMapper commodityPropertyMapper;

    @Override
    public PageBean<CommodityProperty> findPage(CommodityProperty eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<CommodityProperty> pages =  commodityPropertyMapper.findList(eo);
        return new PageBean<CommodityProperty>(pages);
    }

    @Override
    public List<CommodityProperty> findAll(CommodityProperty eo) {
        List<CommodityProperty> list = commodityPropertyMapper.findList(eo);
        return list;
    }
    @Override
    public CommodityProperty detail(Integer  pk) {
        CommodityProperty eo = commodityPropertyMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,CommodityProperty eo) {
        CommodityProperty old = commodityPropertyMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = commodityPropertyMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(CommodityProperty eo) {
        int result = commodityPropertyMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = commodityPropertyMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = commodityPropertyMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}