package com.deepexi.login.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc commodity_category_property_group_relationship
* @author admin
*/
//@ApiModel(description = "商品中心的属性分组与属性的关联关系表")
public class CommodityCategoryPropertyGroupRelationship{

// @ApiModelProperty(value = "主键")
    @TableId
    @TableField(value = "`id`")
    private Integer  id;
// @ApiModelProperty(value = "租户id")
    @TableField(value = "`tenant_id`")
    private Integer  tenantId;
// @ApiModelProperty(value = "应用id")
    @TableField(value = "`app_id`")
    private Integer  appId;
// @ApiModelProperty(value = "属性分组ID")
    @TableField(value = "`property_group_id`")
    private Integer  propertyGroupId;
// @ApiModelProperty(value = "属性ID")
    @TableField(value = "`property_id`")
    private Integer  propertyId;
// @ApiModelProperty(value = "属性是否必填，1：必填，0：非必填")
    @TableField(value = "`is_required`")
    private Boolean isRequired;
// @ApiModelProperty(value = "属性类型，1：关键属性，2：销售属性，3：非关键属性")
    @TableField(value = "`property_types`")
    private String propertyTypes;
// @ApiModelProperty(value = "版本号，乐观锁")
    @TableField(value = "`version`")
    private Integer  version;
// @ApiModelProperty(value = "备注")
    @TableField(value = "`remark`")
    private String remark;
// @ApiModelProperty(value = "删除标记")
    @TableField(value = "`is_deleted`")
    private Boolean isDeleted;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`created_time`")
    private Date createdTime;
// @ApiModelProperty(value = "最后更新人")
    @TableField(value = "`updated_by`")
    private String updatedBy;
// @ApiModelProperty(value = "最后更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`updated_time`")
    private Date updatedTime;

    public void setId(Integer  id){
    this.id = id;
    }

    public Integer  getId(){
    return this.id;
    }

    public void setTenantId(Integer  tenantId){
    this.tenantId = tenantId;
    }

    public Integer  getTenantId(){
    return this.tenantId;
    }

    public void setAppId(Integer  appId){
    this.appId = appId;
    }

    public Integer  getAppId(){
    return this.appId;
    }

    public void setPropertyGroupId(Integer  propertyGroupId){
    this.propertyGroupId = propertyGroupId;
    }

    public Integer  getPropertyGroupId(){
    return this.propertyGroupId;
    }

    public void setPropertyId(Integer  propertyId){
    this.propertyId = propertyId;
    }

    public Integer  getPropertyId(){
    return this.propertyId;
    }

    public void setIsRequired(Boolean isRequired){
    this.isRequired = isRequired;
    }

    public Boolean getIsRequired(){
    return this.isRequired;
    }

    public void setPropertyTypes(String propertyTypes){
    this.propertyTypes = propertyTypes;
    }

    public String getPropertyTypes(){
    return this.propertyTypes;
    }

    public void setVersion(Integer  version){
    this.version = version;
    }

    public Integer  getVersion(){
    return this.version;
    }

    public void setRemark(String remark){
    this.remark = remark;
    }

    public String getRemark(){
    return this.remark;
    }

    public void setIsDeleted(Boolean isDeleted){
    this.isDeleted = isDeleted;
    }

    public Boolean getIsDeleted(){
    return this.isDeleted;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setCreatedTime(Date createdTime){
    this.createdTime = createdTime;
    }

    public Date getCreatedTime(){
    return this.createdTime;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setUpdatedTime(Date updatedTime){
    this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime(){
    return this.updatedTime;
    }


}

