package com.zhiyou100.dumplings.controller;


import com.zhiyou100.dumplings.common.Result;
import com.zhiyou100.dumplings.common.ResultGenerator;
import com.zhiyou100.dumplings.entity.Tastes;
import com.zhiyou100.dumplings.service.ITastesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
@RestController
@RequestMapping("/tastes")
public class TastesController {
    @Resource
    private ITastesService tastesService;
    @RequestMapping("show")
    public Result show(){
        List<Tastes> list = tastesService.queryAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
