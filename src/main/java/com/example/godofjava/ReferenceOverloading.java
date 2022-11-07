package com.example.godofjava;

public class ReferenceOverloading {

    // 오버로딩을쓰는 이유.
    // 같은 역활을 하는 메소드는 같은 메소드이름을 가져야한다.
    // ex) System.out.println() 처럼 String 을 사용하든. int를 사용하든
    // System.out.printlnString(), System.out.printlnInt()로 쓰지 않는것처럼.

    public static void main(String[] args) {
        ReferenceOverloading reference = new ReferenceOverloading();

    }

    public void print(int data) {

    }
    public void print(String data){

    }
    public void print(int intData, String stringData){

    }
    public void print(String stringData, int intData){

    }
}
