package top.devhub.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.devhub.website.util.TimeUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Adam.Zhang on 2017/7/10.
 */
@Controller
@RequestMapping("/convert")
public class ConvertController {

    @RequestMapping("/unix")
    public String unix(Model model) {
        Date now = new Date();
        model.addAttribute("currentUnix", String.valueOf(now.getTime()));
        model.addAttribute("currentBJ", TimeUtil.formatDate(now));

        return "convert/unix";
    }

}
