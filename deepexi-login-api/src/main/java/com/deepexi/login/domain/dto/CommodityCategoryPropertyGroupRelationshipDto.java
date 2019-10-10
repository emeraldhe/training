package com.deepexi.login.domain.dto;

import com.deepexi.login.domain.eo.CommodityCategoryPropertyGroupRelationship;
import java.util.Collection;
import java.util.List;

/**
* @desc commodity_category_property_group_relationship
* @author admin
*/
public class CommodityCategoryPropertyGroupRelationshipDto extends CommodityCategoryPropertyGroupRelationship{

public CommodityCategoryPropertyGroupRelationshipDto(){};

public CommodityCategoryPropertyGroupRelationshipDto(CommodityCategoryPropertyGroupRelationship eo) {
    this.setId(eo.getId());
    this.setTenantId(eo.getTenantId());
    this.setAppId(eo.getAppId());
    this.setPropertyGroupId(eo.getPropertyGroupId());
    this.setPropertyId(eo.getPropertyId());
    this.setIsRequired(eo.getIsRequired());
    this.setPropertyTypes(eo.getPropertyTypes());
    this.setVersion(eo.getVersion());
    this.setRemark(eo.getRemark());
    this.setIsDeleted(eo.getIsDeleted());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedTime(eo.getCreatedTime());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedTime(eo.getUpdatedTime());
}
}

