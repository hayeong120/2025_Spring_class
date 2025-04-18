//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static void memberUse1() {
        // 강한 결합으로 객체 생성
        Member member1 = new Member();
    }
    public static void memberUse2(Member m) {
        // 약한 결합으로 객체 생성
        Member member2 = m;
    }
}

class Member {
    String name;
    String nickName;

    private Member() {
    }
}