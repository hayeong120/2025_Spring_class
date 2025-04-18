//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //HelloWorldEn 객체 hello1 만들고 hi 출력
        HelloWorldKr hello1 = new HelloWorldKr();
        callMethod(hello1);
    }
    public static void callMethod(HelloWorldKr h1) {
        h1.sayHello();
    }
}