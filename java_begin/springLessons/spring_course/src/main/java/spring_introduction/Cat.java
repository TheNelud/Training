package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
//@Component
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("May-may");
    }
}
