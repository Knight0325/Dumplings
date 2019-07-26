package com.zhiyou100.dumplings.controller;


import com.zhiyou100.dumplings.entity.Dumplings;
import com.zhiyou100.dumplings.service.IDumplingsService;
import com.zhiyou100.dumplings.service.IOrderdumsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Knight
 * @since 2019-06-28
 */
@RestController
@RequestMapping("/orderdums")
public class OrderdumsController {
    @Resource
    private IOrderdumsService orderdumsService;
    @Resource
    private IDumplingsService dumplingsService;
    @RequestMapping("edit")
    public String edit(Integer id){
        Dumplings dumpling = dumplingsService.getById(id);
        return "edit";
    }
}
