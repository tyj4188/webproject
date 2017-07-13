/* 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 
 * 项目名：	com.join.test
 * 文件名：	TestController
 * 模块说明：	
 * 修改历史：
 * 2017/7/13 - Tyj - 创建。
 */

package com.join.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tyj
 * @date 2017/7/13
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "/index.jsp";
    }

    @RequestMapping("/hw")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }
}
