package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palt")
public class ControllerTest {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public AjaxResult test(){
        return AjaxResult.me().setMsg("路过").setSuccess(true).setObj("打酱油");
    }
}
