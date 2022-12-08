package act8;

public class MethodVarargs {
    //== 임의 개수의 매개변수 넘겨주기 ==//

    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();

        varargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        varargs.calculateNumbers(1,2,3,4,6,7);
    }

    public void calculateNumbersWithArray(int[] numbers) {}

    public void calculateNumbers(int...numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = "+total);
    // 1. 이와 같은 방법은 하나의 메소드에서 한번만 사용 가능.
    // 2. 여러 매개변수가 있다면 마지막에 선언을 해야함.
    }


}
