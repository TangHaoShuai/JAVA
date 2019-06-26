package demo.demoservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tser2 {

    @RequestMapping("mzz2")
    public String kkk(){
        return "mzz";
    }

}
