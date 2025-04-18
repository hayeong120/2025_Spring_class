package kr.hs.study;


import kr.hs.study.beans.Animal;
import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("config.xml");

        Cat cat = ctx.getBean("cat", Cat.class);
        cat.prData();

        System.out.println("-------------------------------------------");

        Dog dog = ctx.getBean("dog", Dog.class);
        dog.prData();

        ctx.close();
    }
}