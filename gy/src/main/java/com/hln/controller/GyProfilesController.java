package com.hln.controller;

import com.alibaba.fastjson2.JSONArray;
import com.hln.pojo.GyProfiles;
import com.hln.pojo.bo.PageBo;
import com.hln.service.GyProfilesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * (GyProfiles)表控制层
 *
 * @author makejava
 * @since 2024-05-29 18:32:00
 */
@RestController
@RequestMapping("/qyProfiles")
@Api(value = "果园信息板块",tags = {"果园信息板块"})
public class GyProfilesController {
    /**
     * 服务对象
     */
    @Autowired
    private GyProfilesService gyProfilesService;

    /**
     * 分页查询
     *
     * @param gyProfiles  筛选条件
     * @return 查询结果
     */
    @PostMapping("/queryByPageTo")
    @ApiOperation("分页查询")
    public String queryByPage(@RequestBody PageBo gyProfiles) {
        return JSONArray.toJSONString(ResponseEntity.ok(this.gyProfilesService.queryByPage(gyProfiles)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("/queryById/{id}")
    @ApiOperation("根据id查询")
    public String queryById(@PathVariable("id") Long id) {
        return JSONArray.toJSONString(ResponseEntity.ok(this.gyProfilesService.queryById(id)));
    }

    /**
     * 新增数据
     *
     * @param gyProfiles 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    @ApiOperation("添加")
    public String add(@RequestBody GyProfiles gyProfiles) {
        return JSONArray.toJSONString(ResponseEntity.ok(this.gyProfilesService.insert(gyProfiles)));
    }

    /**
     * 编辑数据
     *
     * @param gyProfiles 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    @ApiOperation("修改")
    public String edit(@RequestBody GyProfiles gyProfiles) {
        return JSONArray.toJSONString(ResponseEntity.ok(this.gyProfilesService.update(gyProfiles)));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    @ApiOperation("删除")
    public String deleteById(@RequestParam("id") Long id) {
        return JSONArray.toJSONString(ResponseEntity.ok(this.gyProfilesService.deleteById(id)));
    }

}

