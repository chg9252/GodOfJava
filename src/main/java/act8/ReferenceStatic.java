package act8;

public class ReferenceStatic {
    String name = "Han"; // static 이 붙어있지 않아서 static 변수가 아니라 인스턴스 변수인것!

    public static void main(String[] args) {
    //  ReferenceStatic reference = new ReferenceStatic();
        ReferenceStatic.staticMethod();
        // 왜 생성자를 안만들어줘도 되는것이지?
    }

    public static void staticMethod(){
        System.out.println("나는야 스테틱메소드다!!");
    }

    public static void staticMethodCallVariable(){
       // System.out.println(name); // static 메소드는 클래스 변수만 사용할 수 있다는 단점이 있다
    }
}
