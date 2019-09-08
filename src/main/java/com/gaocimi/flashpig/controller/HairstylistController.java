package com.gaocimi.flashpig.controller;

import com.gaocimi.flashpig.entity.Hairstylist;
import com.gaocimi.flashpig.entity.HairstylistExample;
import com.gaocimi.flashpig.result.ResponseResult;
import com.gaocimi.flashpig.service.IHairstylistService;
import com.gaocimi.flashpig.utils.CustomDatePropertyEditor;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.beans.PropertyEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author liyutg
 * @date 2019/6/12 2:14
 * @description
 */
@RestController
@ResponseResult
@Api(value = "管理端发型师服务",description = "管理员操作发型师相关业务")
public class HairstylistController {
    @Autowired
    IHairstylistService hairstylistService;

    @ApiOperation(value = "添加发型师",notes = "m1")
    @PostMapping("/hairstylist")
    @ResponseStatus(HttpStatus.CREATED)
    public int addHairstylist(@Validated Hairstylist hairstylists) {
        return hairstylistService.insertSelective(hairstylists);
    }

    @ApiOperation(value = "删除发型师",notes = "m1")
    @DeleteMapping("/hairstylist/{hairstylistId}")
    public int deleteHairstylist(@NotBlank @PathVariable("hairstylistId") Integer hairstylistId) {
        return hairstylistService.deleteByPrimaryKey(hairstylistId);
    }

    @ApiOperation(value = "修改发型师",notes = "m1")
    @PutMapping("/hairstylist")
    public int updateHairstylist(@Validated Hairstylist hairstylists) {
        return hairstylistService.updateByPrimaryKeySelective(hairstylists);
    }


    @ApiOperation(value = "获取单个发型师信息",notes = "m1",produces = "application/json")
    @GetMapping("/hairstylist/{hairstylistId}")
    public Hairstylist getOne( @PathVariable("hairstylistId") Integer hairstylistId) {
        return hairstylistService.selectByPrimaryKey(hairstylistId);
    }

    @ApiOperation(value = "获取所有发型师列表",notes = "m1",produces = "application/json")
    @GetMapping("/hairstylists")
    public Page<Hairstylist> getPage(@RequestParam(name="pageNum",defaultValue="1") int pageNum,
                                 @RequestParam(name="pageSize",defaultValue="10") int pageSize,
                                 @RequestParam(name="orderBy",defaultValue="id desc") String orderBy
    ) {
        Page<Hairstylist> page = PageHelper.startPage(pageNum, pageSize, orderBy);
        HairstylistExample example=new HairstylistExample();
        hairstylistService.selectByExample(example);
        return page;
    }
    

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        // CustomDatePropertyEditor 为自定义日期编辑器
        PropertyEditor dateEditor = new CustomDatePropertyEditor(dateFormat , true , null);
        binder.registerCustomEditor(Date.class, dateEditor);
    }
}
