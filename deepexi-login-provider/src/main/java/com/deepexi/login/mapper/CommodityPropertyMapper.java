package com.deepexi.login.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.login.domain.eo.CommodityProperty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  CommodityPropertyMapper extends BaseMapper<CommodityProperty> {

    List<CommodityProperty> findList(@Param("eo")  CommodityProperty eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}