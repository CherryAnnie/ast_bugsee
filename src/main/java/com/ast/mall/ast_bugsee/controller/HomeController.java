package com.ast.mall.ast_bugsee.controller;

import com.ast.mall.ast_bugsee.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ast_mall on 2018/3/6.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        Msg msg = new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
        return "index";
    }
}
