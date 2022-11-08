package com.example.godofjava;

// 임의개수의 매개변수를 넘겨줄수 있는 방법!
public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();

        /*
        // 이렇게 하면 매개변수로 넘겨줄때 계산할 숫자들을 모두 배열로 만든후 넘겨주어야 하는 단점 발생.
        varargs.calculateNumbersWithArray(new int[]{1,2,4,5,6,7});
        */

        varargs.calculateNumbers(1,2,3,4,5,6,7);

    }

    public void calculateNumbersWithArray(int[] numbers) {}

    public void calculateNumbers(int... numbers) {
        int total=0;
        for (int number : numbers) {
            total+=number;
        }
        System.out.println("Total = " + total);
    }

    // 정리
    // calculateNumbers()와 같은 방법은 하나의 메소드에서 한번만 사용가능하다.
    // ...numbers 선언 뒤에는 메소드의 선언을 닫는 소괄호가 와야한다.
    // 아래와 같이 사용하면 컴파일 오류 발생!!!
    // public void arbitrary(int...numbers, String message){}

}
