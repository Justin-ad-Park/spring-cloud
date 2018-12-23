package justin.ad.services.boot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CounterServiceHandler {

    /*
    @Before("execution(* *..*Controller.*(..))")
    public void startLog(JoinPoint jp) {
        log.debug("[AOP Test]Before method : " + jp.getSignature());
    }
    */

    private final CounterService counterService;

    @Autowired
    public CounterServiceHandler(CounterService counterService) {
        this.counterService = counterService;
    }

    /**
     *
     * Test URL : http://localhost:8080/aoptest
     * @param jp
     */
    @Before("@annotation(justin.ad.services.boot.aspect.annotation.CountOn)")
    public void countService(JoinPoint jp) {
        Object targetObject = jp.getTarget();
        log.debug("[AOP Object info : " + targetObject.getClass().getName());

        Object thisObject = jp.getThis();
        log.debug("[AOP getThis info : " + thisObject.getClass().getName());

        Signature signature = jp.getSignature();
        log.debug("[AOP Signature info : " + signature.getDeclaringTypeName());


        this.counterService.increment(signature.toShortString());

//        Object[] args = jp.getArgs();
//
//        for (Object arg : args) {
//            if (arg instanceof HttpServletResponse) {
//                HttpServletResponse response = (HttpServletResponse) arg;
//
//                response.setHeader("Cache-Control", "no-cache");
//                response.addHeader("Cache-Control","no-store");
//                response.setHeader("Pragma","no-cache");
//                response.setDateHeader("Expires",1L);
//
//                return;
//            }
//        }
    }

}
