package com.deepexi.login.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.login.domain.eo.CommodityCategoryPropertyGroupRelationship;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  CommodityCategoryPropertyGroupRelationshipMapper extends BaseMapper<CommodityCategoryPropertyGroupRelationship> {

    List<CommodityCategoryPropertyGroupRelationship> findList(@Param("eo")  CommodityCategoryPropertyGroupRelationship eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}