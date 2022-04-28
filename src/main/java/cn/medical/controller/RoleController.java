package cn.medical.controller;

import cn.medical.pojo.Role;
import cn.medical.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/{role_id}")
    public Role getRoleByRoleId(@PathVariable int role_id){
        return roleService.getRoleByRoleId(role_id);
    }


    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg","hello!");
        return "test";
    }
}
