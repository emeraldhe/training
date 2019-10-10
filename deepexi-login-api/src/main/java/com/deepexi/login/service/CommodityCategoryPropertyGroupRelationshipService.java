package com.deepexi.login.service;

import com.deepexi.login.domain.eo.CommodityCategoryPropertyGroupRelationship;
import com.deepexi.login.domain.dto.CommodityCategoryPropertyGroupRelationshipDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * commodity_category_property_group_relationship
 */
public interface CommodityCategoryPropertyGroupRelationshipService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<CommodityCategoryPropertyGroupRelationship> findPage(CommodityCategoryPropertyGroupRelationship eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<CommodityCategoryPropertyGroupRelationship> findAll(CommodityCategoryPropertyGroupRelationship eo);

    /**
      获取详情
    * @return
    */
    CommodityCategoryPropertyGroupRelationship detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,CommodityCategoryPropertyGroupRelationship eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(CommodityCategoryPropertyGroupRelationship eo);

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