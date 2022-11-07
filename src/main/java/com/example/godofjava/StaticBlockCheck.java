package com.example.godofjava;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();

        /* 실행결과 */

        /*
        > Task :StaticBlockCheck.main()
        Creating block1
        *** First static block ***
        *** second static block ***
        여긴 staticBlock Constructor.
        Created block1
        -----------------------------------------
        Creating block2
        여긴 staticBlock Constructor.
        Created block2
        */

        // 정리
        //두개의 스테틱 블럭을 만들었으나. 스테틱 블록은 한번씩만 호출되었다.
        //그리고 생성자가 호출되기전에 static 블록들이 호출되는 것 을 확인했다.
        //static 블록은 클래스를 초기화할 때 꼭 수행되어야 하는 작업이 있을 경우 유용하게 사용가능.


    }

    public void makeStaticBlockObject() {
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("-----------------------------------------");

        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }


    public void makeStaticBlockObjectWithData() {
        System.out.println("StaticBlock data = " + StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("-----------------------------------------");

        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("StaticBlock data = " + StaticBlock.getData());

    }

}
