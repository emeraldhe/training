package com.deepexi.login.service;

import com.deepexi.login.domain.eo.CommodityProperty;
import com.deepexi.login.domain.dto.CommodityPropertyDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * commodity_property
 */
public interface CommodityPropertyService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<CommodityProperty> findPage(CommodityProperty eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<CommodityProperty> findAll(CommodityProperty eo);

    /**
      获取详情
    * @return
    */
    CommodityProperty detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,CommodityProperty eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(CommodityProperty eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(Integer  pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(Integer ...pk);
}