package act8;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading overloading = new ReferenceOverloading();

        overloading.print("test");

    }

    public void print(int data){}
    public void print(String data){}
    public void print(int intData, String stringData){}
    public void print(String stringData, int intData){}


    /*
    메소드의 이름은 같으니 매개변수를 다르게 사용하는것을 Overloading 이라고 한다.
    메소드 오버로딩은
    “같은 역할을 하는 메소드는 같은 메소드 이름을 가져야 한다.”는 모토로 사용하는 것이다.
    */
}
