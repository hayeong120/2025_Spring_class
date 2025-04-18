package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        Member member = ctx.getBean("m1", Member.class);
        System.out.println("name : " + member.getName());
        System.out.println("nickname : " + member.getNickName());
        System.out.println("addr : " + member.getAddr());
        System.out.println("hobby : " + member.getHobby().getHobby_name());

        ctx.close();
    }
}