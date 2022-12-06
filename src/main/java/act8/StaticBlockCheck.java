package act8;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        // check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject(){
        System.out.println("블록만들기! 1번");
        StaticBlock block1 = new StaticBlock(); // 생성자를 먼저 타는게 아니라 스테틱 블록이 먼저 만들어지네?? 스테틱 블록의 개수에 상관없이 호출을 기준으로 전부다 실행되는건가>
        System.out.println("블록만들기! 1번");

        System.out.println("=========================================");

        System.out.println("블록만들기! 2번");
        StaticBlock block2 = new StaticBlock(); //  여기서는 스테틱블록이 아예 실행을 안함.
        System.out.println("블록만들기! 2번");
    }

    /*
    이와 같은 static 블록은 클래스를 초기화할 때 꼭 수행되어야 하는 작업이 있을 경우 유용하게 사용될 수 있다.
    스테틱 블럭 안에서는 static 한 것들만 사용가능하다.
    */

    public void makeStaticBlockObjectWithData(){
        System.out.println("StaticBlockData = "+StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("StaticBlockData = "+StaticBlock.getData());
    }

    /*
     data 가 출력되기전에 static 블록 생성.
     getData() 와 같이 static 으로 선언된 메서드도 호출할 수 있다.
    */



}
