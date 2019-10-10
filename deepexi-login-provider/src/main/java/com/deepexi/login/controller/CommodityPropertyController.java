package com.deepexi.login.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.login.service.CommodityPropertyService;
import com.deepexi.login.domain.eo.CommodityProperty;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/商品中心的基础属性表", description = "$desc")
@RestController
@RequestMapping("/api/v1/commodityPropertys")
public class  CommodityPropertyController {

    @Autowired
    private CommodityPropertyService commodityPropertyService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(CommodityProperty eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(commodityPropertyService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(CommodityProperty eo) {
        return new Payload(commodityPropertyService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(commodityPropertyService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改CommodityProperty")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody CommodityProperty eo) {
     eo.setId(pk);
     return new Payload(commodityPropertyService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建CommodityProperty", notes = "创建CommodityProperty")
    public Payload create(@RequestBody CommodityProperty eo) {
        return new Payload(commodityPropertyService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除CommodityProperty", notes = "根据id删除CommodityProperty")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(commodityPropertyService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除CommodityProperty", notes = "根据id批量删除CommodityProperty")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(commodityPropertyService.delete(ids));
    }

}