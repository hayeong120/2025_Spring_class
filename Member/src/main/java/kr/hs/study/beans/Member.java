package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("m1")
public class Member {
    @Value("kim")
    private String name;
    @Value("nickKim")
    private String nickName;
    @Value("seoul")
    private String addr;
    @Autowired
    private Hobby hobby;

    public String getName() {
        return name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public String getAddr() {
        return addr;
    }

    public String getNickName() {
        return nickName;
    }
}
