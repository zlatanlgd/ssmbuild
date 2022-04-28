package cn.medical.controller;

import cn.medical.pojo.User;
import cn.medical.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FastJsonController {

    @Autowired
    UserService userService;

    @RequestMapping("j1")
    @ResponseBody
    public String json1(){
//        User user = userService.selectUserByUsername("ssss");
        String str = JSON.toJSONString(userService.selectUserByUsername("lyk"));
        return  str;
    }
}
