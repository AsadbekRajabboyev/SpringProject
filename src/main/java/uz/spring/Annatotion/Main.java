package uz.spring.Annatotion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarShop carShop = context.getBean("carShop", CarShop.class);
        carShop.getInfo();

        System.out.println(carShop.getName());
        System.out.println(carShop.getPrice());

        context.close();
    }
}
