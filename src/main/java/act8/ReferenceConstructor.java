package act8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();

    }

    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Han");
        MemberDTO dto3 = new MemberDTO("Han","01052419252");
        MemberDTO dto4 = new MemberDTO("Han","01052419252","chg0252@gmail.com");
    }
}
