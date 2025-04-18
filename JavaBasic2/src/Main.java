//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HelloWorld hello1 = new HelloWorldEn();
        callMethod(hello1);
    }
    public static void callMethod(HelloWorld h1) {
        h1.sayHello();
    }
}