package act8;

public class StaticBlock {
    // 어떤 클래스의 객체가 생성되면서 딱 한 번만 불려야한다면?

    static int data = 1;

    public StaticBlock(){
        System.out.println("스테틱블록 생성자다.");
    }

    static {
        System.out.println("==========첫번째 스테틱 블록!!==============");
        data = 3;
        // System.out.println("=========================================");
    }

    static {
        System.out.println("==========두번째 스테틱 블록!!==============");
        data = 6;
        // System.out.println("=========================================");
    }

    public static int getData(){
        return data;
    }

}
