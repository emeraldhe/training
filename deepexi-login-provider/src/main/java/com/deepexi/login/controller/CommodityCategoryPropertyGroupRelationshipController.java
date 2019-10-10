package com.deepexi.login.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.login.service.CommodityCategoryPropertyGroupRelationshipService;
import com.deepexi.login.domain.eo.CommodityCategoryPropertyGroupRelationship;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/商品中心的属性分组与属性的关联关系表", description = "$desc")
@RestController
@RequestMapping("/api/v1/commodityCategoryPropertyGroupRelationships")
public class  CommodityCategoryPropertyGroupRelationshipController {

    @Autowired
    private CommodityCategoryPropertyGroupRelationshipService commodityCategoryPropertyGroupRelationshipService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(CommodityCategoryPropertyGroupRelationship eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(CommodityCategoryPropertyGroupRelationship eo) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改CommodityCategoryPropertyGroupRelationship")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody CommodityCategoryPropertyGroupRelationship eo) {
     eo.setId(pk);
     return new Payload(commodityCategoryPropertyGroupRelationshipService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建CommodityCategoryPropertyGroupRelationship", notes = "创建CommodityCategoryPropertyGroupRelationship")
    public Payload create(@RequestBody CommodityCategoryPropertyGroupRelationship eo) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除CommodityCategoryPropertyGroupRelationship", notes = "根据id删除CommodityCategoryPropertyGroupRelationship")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除CommodityCategoryPropertyGroupRelationship", notes = "根据id批量删除CommodityCategoryPropertyGroupRelationship")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(commodityCategoryPropertyGroupRelationshipService.delete(ids));
    }

}