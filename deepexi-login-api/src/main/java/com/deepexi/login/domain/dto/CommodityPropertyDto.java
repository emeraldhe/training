package com.deepexi.login.domain.dto;

import com.deepexi.login.domain.eo.CommodityProperty;
import java.util.Collection;
import java.util.List;

/**
* @desc commodity_property
* @author admin
*/
public class CommodityPropertyDto extends CommodityProperty{

public CommodityPropertyDto(){};

public CommodityPropertyDto(CommodityProperty eo) {
    this.setId(eo.getId());
    this.setTenantId(eo.getTenantId());
    this.setAppId(eo.getAppId());
    this.setParentId(eo.getParentId());
    this.setPath(eo.getPath());
    this.setPropertyCode(eo.getPropertyCode());
    this.setPropertyName(eo.getPropertyName());
    this.setPropertyDesc(eo.getPropertyDesc());
    this.setInputType(eo.getInputType());
    this.setVersion(eo.getVersion());
    this.setRemark(eo.getRemark());
    this.setIsDeleted(eo.getIsDeleted());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedTime(eo.getCreatedTime());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedTime(eo.getUpdatedTime());
}
}

