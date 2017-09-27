package top.aiprogram.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2017/9/27.
 */
public class Logger {
    public void doLog(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
