package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.User;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        System.out.println(user);
        if (user != null && !StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())){
            if (user.getUsername().equals("admin") && user.getPassword().equals("admin")){
                return AjaxResult.me().setMsg("登录成功！");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败！");
    }
}
