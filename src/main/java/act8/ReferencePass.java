package act8;

import java.lang.reflect.Member;

public class ReferencePass {

    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        // reference.callPassByValue();

        reference.callPassByReference();

        // int a , String b 기존값이 변하지 않는다.
        // 근데 String 은 기본자료형이 아닌데?
    }

    public void callPassByValue(){
        int a= 18;
        String b = "문자열 B";
        // b="z"  는   b= new String("z")  이것과 같은 말이다.

        System.out.println("passByValue' 진입 전!");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        System.out.println("=========================================");

        passByValue(a, b);

        System.out.println("=========================================");

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public void passByValue(int a, String b) {

        a= 20;
        b= "나는 passByValue 의 문자열";

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public void callPassByReference(){
        MemberDTO member = new MemberDTO("한글한글");

        System.out.println("=========================================");
        System.out.println("before PassByReference");
        System.out.println("member.name= " + member.name);
        System.out.println("=========================================");

        passByReference(member);

        System.out.println("=========================================");
        System.out.println("after PassByReference");
        System.out.println("member.name= " + member.name);
        System.out.println("=========================================");

    }

    public void passByReference(MemberDTO member) {
        member.name = "방글방글";

        System.out.println("=========================================");
        System.out.println("in passByReference");
        System.out.println("member.name= " + member.name);
        System.out.println("=========================================");
    }
}
