package com.example.godofjava;

import java.sql.SQLOutput;

public class ReferenceStaticVariable {
    static String name; // hangeul, Nara
    // String name;     // hangeul, hangeul

    public ReferenceStaticVariable() {
    }

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }

    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Hangeul");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Nara");
        System.out.println(reference1.name);

    }


}

