package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        /**ApplicationContext представляет собой Spring Conteiner.
         * Поэтому для получения бина (Spring Bean(или просто bean) - это обьект , который создается и управляется Spring Conteiner)
         * из Sproing Container нам нужно создать ApllicationContext*/
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
