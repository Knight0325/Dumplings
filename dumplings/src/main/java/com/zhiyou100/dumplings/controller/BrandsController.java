package com.zhiyou100.dumplings.controller;


import com.zhiyou100.dumplings.common.Result;
import com.zhiyou100.dumplings.common.ResultGenerator;
import com.zhiyou100.dumplings.entity.Brands;
import com.zhiyou100.dumplings.service.IBrandsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
@RequestMapping("/brands")
public class BrandsController {
    @Resource
    private IBrandsService brandsService;
    @RequestMapping("/show")
    public Result show(HttpServletRequest req, HttpServletResponse rsp) throws UnsupportedEncodingException {
        System.out.println("所有品牌：");
        req.setCharacterEncoding("utf-8");
        rsp.setCharacterEncoding("utf-8");
        List<Brands> list = brandsService.queryAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
