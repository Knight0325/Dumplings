package com.zhiyou100.dumplings.controller;

import com.zhiyou100.dumplings.common.Constants;
import com.zhiyou100.dumplings.common.Result;
import com.zhiyou100.dumplings.common.ResultGenerator;
import com.zhiyou100.dumplings.entity.Dumplings;
import com.zhiyou100.dumplings.service.IDumplingsService;
import com.zhiyou100.dumplings.service.impl.DumplingsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Controller
@RequestMapping("/dumplings")
public class DumplingsController {
    @Resource
    private IDumplingsService dumplingsService;
    @RequestMapping("show")
    public String show(Model model){
        model.addAttribute("msg","理智消费");
        model.addAttribute("dumplings",dumplingsService.queryAll());
        System.out.println(dumplingsService.queryAll());
        return "good";
    }

    @RequestMapping("add")
    @ResponseBody
    public Result add(@RequestBody Dumplings dumplings){
        System.out.println(dumplings.getBrandId());
        if(dumplings==null){
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"参数列表错误");
        }
        if(dumplingsService.add(dumplings)>0){
            return ResultGenerator.genSuccessResult();
        }else{
            return ResultGenerator.genFailResult("添加失败！");
        }
    }
}
