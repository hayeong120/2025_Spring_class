package kr.hs.study.beans;

public class TestBean {
    private int data1;
    private double data2;
    private String data3;

    public TestBean(String data3) {
        System.out.println("String 값 받는 생성자");
        this.data1 = 3;
        this.data2 = 3.3;
        this.data3 = data3;
    }

    public TestBean(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void prData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
    }
}
