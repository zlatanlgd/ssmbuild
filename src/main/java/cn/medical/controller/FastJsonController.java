package cn.medical.controller;

import cn.medical.pojo.User;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FastJsonController {

    @RequestMapping("j1")
    @ResponseBody
    public String json1(){
        User user = new User("lrc",1,"man");

        String str = JSON.toJSONString(user);
        return str;
    }
}
