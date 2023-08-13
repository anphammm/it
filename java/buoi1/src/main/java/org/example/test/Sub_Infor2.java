package org.example.test;

import org.example.code.Infor;

public class Sub_Infor2 extends Infor {
    public Infor infor;


    public void method() {
//        super.b => ko truy cap dc
        super.c =3;// => truy cap dc
    }
}
