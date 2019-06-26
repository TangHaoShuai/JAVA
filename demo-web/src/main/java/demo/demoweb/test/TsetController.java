package demo.demoweb.test;


import demo.demodao.Demo;
import demo.demoservice.TsetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TsetController {
    @ResponseBody
    @RequestMapping("mzz")
   public String testCon(){
       TsetService tsetService =new TsetService();
       String A=tsetService.A1();
        Demo demo =new Demo();
        String B=demo.A2();
       return A+B+Demo.A3();
   }

}
