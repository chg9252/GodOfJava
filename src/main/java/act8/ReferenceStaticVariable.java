package act8;

public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable(){}
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
        // jungmi라고 나올듯.?
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("hangeul");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("jungmi");
        System.out.println(reference1.name);

    }
}

