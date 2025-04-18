package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
    @Value("1")
    private int data1;
    @Value("1.1")
    private double data2;
    @Value("kim")
    private String data3;

    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

    public String getData3() {
        return data3;
    }
}
