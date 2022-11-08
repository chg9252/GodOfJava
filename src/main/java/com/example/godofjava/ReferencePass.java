package com.example.godofjava;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByValue();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        passByValue(a, b);


    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("hangeul");
        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);

        passByReference(member);

        System.out.println("after passByReference");
        System.out.println("member.name = " + member.name);

    }

    public void passByReference(MemberDTO member) {
        member.name = "Nara";
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);
    }
    /*
    정리
    모든 기본자료형은 Pass by value
    참조 자료형은 값이 아닌 참조가 전달되는 Pass By Reference 이다.

    */

}
