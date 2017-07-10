package top.devhub.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Adam.Zhang on 2017/7/10.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        //RequestCont
        return "index";
    }

    @RequestMapping("/index2/{id}")
    @ResponseBody
    public String index2(@PathVariable("id")String id){
        return id;
    }

}
