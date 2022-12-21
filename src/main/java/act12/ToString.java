package act12;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);

        /*
        출력 결과
        act12.ToString@17c68925
        act12.ToString@17c68925
        문자랑 obj 더하기!!act12.ToString@17c68925


        String 을 제외한 참조 자료형에 더하기 연산을 수행하면
        자동으로 toString() 메소드가 호출되고
        객체의 위치에는 String 값이 놓이게 된다.
        때문에 String 과 object 가 더해질 수 있었다~!

        현재 패키지의 이름과 클래스 이름 @
        hashCode() 메소드에서는 int 타입을 리턴해준다.
        그 값을 toHexString() 이라는 메소드를 써서 16진수로 변환한다. (Integer 라는 클래스에서 제공)
        */

    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("문자랑 obj 더하기!!"+obj);
    }


    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("this 메소드에서 더하기!" + this);
    }

    public String toString(){
        return "리턴 ToString class 닷!!";
    }

}
