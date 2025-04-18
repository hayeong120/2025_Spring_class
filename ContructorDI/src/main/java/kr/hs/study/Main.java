package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // TestBean1의 객체 생성하고 data1, data2, data3 출력
        ClassPathXmlApplicationContext ctx =
               new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();
        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        obj2.prData();
        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        obj3.prData();

        ctx.close();
    }
}