package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* aop.UniLibrary.* (..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}


    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing log #404");
    }




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}

//    @Pointcut("execution(* aop.UniLibrary.add*())")
//    private void allAddtMethodsFromUniLibrary(){}


//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }

//    @Before("allAddtMethodsFromUniLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: writing Log #3");
//    }

//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggigAdvice(){
//        System.out.println("beforeGetAndReturnLoggigAdvice: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethod(){}


//    @Before("allGetMethod()")
//    @Before("execution(public void getBook(aop.Book))")
//    @Before("execution(public void getBook(String))")
//    @Before("execution(public void *(..))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void aop.UniLibrary.getBook())")
//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice(){
//        System.err.println("beforeGetBookAdvice: trying to get a book/magazine");
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: protected security get book/magazine");
//    }
//    @Before("execution(public void returnBook())")
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.err.println("beforeGetBookAdvice: trying to return a book");
//    }
}
