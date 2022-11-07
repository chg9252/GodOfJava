package com.example.godofjava;

public class StaticBlock {
    static int data=1;
    // int data=1; 만약 static이 없다면 컴파일 오류발생!

    public StaticBlock() {
        System.out.println("여긴 staticBlock Constructor.");
    }

    static {
        System.out.println("*** First static block ***");
        data=3;
    }

    static {
        System.out.println("*** second static block ***");
        data=5;
    }

    public static int getData(){
        return data;
    }

}
