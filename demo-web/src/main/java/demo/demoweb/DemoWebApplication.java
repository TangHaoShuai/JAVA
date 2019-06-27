package demo.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*直接让启动类继承SpringBootServletInitializer，并覆盖configure()方法：*/
public class DemoWebApplication extends SpringBootServletInitializer {

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder  builder){
   /*// 注意这里要指向原先用main方法执行的DemoWebApplication启动类 */
    return builder.sources(DemoWebApplication.class);
}

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

/*@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(DemoWebApplication.class);
}
    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }*/
}
