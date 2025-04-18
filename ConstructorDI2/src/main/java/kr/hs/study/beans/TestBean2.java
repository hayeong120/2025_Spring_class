package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data1;
    private DataBean2 data2;

    public TestBean2(DataBean2 data1, DataBean2 data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void prData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
    }
}
