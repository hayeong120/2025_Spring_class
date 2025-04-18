package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. config.xml 파일을 로딩해서 객체를 생성하고 보관한다.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        //2. 객체를 가지고 와서 주소값 출력
//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1: " + obj1);
//
//        TestBean obj2 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj2: " + obj2);

//        TestBean obj3 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj3: " + obj3);
//
//        TestBean obj4 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj4: " + obj4);


        ctx.close();
    }
}