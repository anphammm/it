package org.example.code;

public class Sub_infor extends Infor{
    @Override
    public void method() {
//        super.a => ko truy cap dc
//        super.b => truy cap dc => vi chung goi
   super.c = 3; // truycap dc
        super.d =4; // truycap dc
    }
}
