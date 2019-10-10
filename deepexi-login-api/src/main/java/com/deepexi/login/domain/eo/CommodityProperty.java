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
* @desc commodity_property
* @author admin
*/
//@ApiModel(description = "商品中心的基础属性表")
public class CommodityProperty{

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
// @ApiModelProperty(value = "父id")
    @TableField(value = "`parent_id`")
    private Integer  parentId;
// @ApiModelProperty(value = "路径  1/10/100")
    @TableField(value = "`path`")
    private String path;
// @ApiModelProperty(value = "属性code")
    @TableField(value = "`property_code`")
    private String propertyCode;
// @ApiModelProperty(value = "属性名称")
    @TableField(value = "`property_name`")
    private String propertyName;
// @ApiModelProperty(value = "属性描述")
    @TableField(value = "`property_desc`")
    private String propertyDesc;
// @ApiModelProperty(value = "输入方式，1：多选，2：输入")
    @TableField(value = "`input_type`")
    private Boolean inputType;
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

    public void setParentId(Integer  parentId){
    this.parentId = parentId;
    }

    public Integer  getParentId(){
    return this.parentId;
    }

    public void setPath(String path){
    this.path = path;
    }

    public String getPath(){
    return this.path;
    }

    public void setPropertyCode(String propertyCode){
    this.propertyCode = propertyCode;
    }

    public String getPropertyCode(){
    return this.propertyCode;
    }

    public void setPropertyName(String propertyName){
    this.propertyName = propertyName;
    }

    public String getPropertyName(){
    return this.propertyName;
    }

    public void setPropertyDesc(String propertyDesc){
    this.propertyDesc = propertyDesc;
    }

    public String getPropertyDesc(){
    return this.propertyDesc;
    }

    public void setInputType(Boolean inputType){
    this.inputType = inputType;
    }

    public Boolean getInputType(){
    return this.inputType;
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

