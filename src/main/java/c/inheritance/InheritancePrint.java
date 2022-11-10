package c.inheritance;

public class InheritancePrint {
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();
    }


    /*
    정리
    자식클래스의 생성자가 호출되면, 자동으로 부모클래스의 매개변수가 없는 생성자가 실행된다.
    자식 클래스에서는 부모클래스의 있는 public, protected, 선언된 모든 인스턴스 및 클래스 변수와 메소드를 사용할 수 있다.
    */

}
