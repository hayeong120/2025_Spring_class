package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("testBean1", TestBean1.class);
        System.out.println("obj1 : " + obj1);

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2 : " + obj2);

        ctx.close();
    }
}