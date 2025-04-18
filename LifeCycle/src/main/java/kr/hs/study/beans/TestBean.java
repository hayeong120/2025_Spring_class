package kr.hs.study.beans;

public class TestBean {
    public TestBean() {
        System.out.println("TestBean의 기본생성자");
    }
    public void initMethod() {
        System.out.println("TestBean의 initMethod");
    }
    public void destroyMethod() {
        System.out.println("TestBean의 destroyMethod");
    }
}
