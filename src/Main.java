import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import top.aiprogram.controller.UserController;
import top.aiprogram.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.aiprogram.entity.UserFather;
import top.aiprogram.service.UserService;

/**
 * Created by Administrator on 2017/9/26.
 */
public class Main {
    public static  void main (String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("./top/aiprogram/resource/application-context.xml");
        User user = context.getBean(User.class);            //class名称,application-context里没有设置bean名称也能用
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getList());
        System.out.println("++++++++++++++++++++++++++++");
        UserFather userFather = (UserFather) context.getBean("userFather"); //context设置里bean的名称
        System.out.println(userFather.getFatherName());


        //注解方式 MVC
//        @Service 业务层
//        @Component 公共组件
//        @Controller 控制用户请求 SpringMVC
//        AOP aspect orient programing 统一组织代码 拦截某些方法执行前后 做一些操作
        UserController userController = context.getBean(UserController.class);
        UserService userService = userController.getUserService();
        userService.say();


    }
}
