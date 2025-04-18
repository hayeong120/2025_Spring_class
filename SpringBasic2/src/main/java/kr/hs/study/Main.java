package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. xml 파일을 읽고 객체를 생성하고 보관한다.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1 : " + obj1);

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        System.out.println("obj2 : " + obj2);

//        TestBean obj3 = ctx.getBean("t3", TestBean.class);
//        System.out.println("obj3 : " + obj3);

        ctx.close();
    }
}