package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class ControllerTest {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public AjaxResult test(){
        return AjaxResult.me().setMsg("路过").setSuccess(true).setObject("打酱油");
    }
}
