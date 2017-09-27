package top.aiprogram.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/27.
 */
@Component
@Aspect     //声明切面
public class UserAspect {
//    @Pointcut(value = "execution(* top.aiprogram.service.*.*(..))")
//    public void pointCut () {}
//
//    //advice 我要干的事情 什么时干
//
////  前置通知
//    @Before(value = "pointCut()")           //可以写成上面的全路径
//    public void doBefore(JoinPoint joinPoint) {         //连接点
//        String name = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        System.out.println(name + " " + args.toString());
//    }
////  后置通知
//    @After(value = "pointCut()")
//    public void doafter(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        System.out.println(name + " " + args.toString());
//    }
//
//
//    @AfterReturning(value = "pointCut()",returning = "result")
//    public void afterReturning (JoinPoint joinPoint, Object result) {
//        System.out.println(result);
//    }
//
//    //  环绕通知
//    @Around(value = "pointCut()")
//    public void around (ProceedingJoinPoint proceedingJoinPoint) {
//        try {
//            proceedingJoinPoint.proceed();      //会阻塞方法的运行
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//    }
}
