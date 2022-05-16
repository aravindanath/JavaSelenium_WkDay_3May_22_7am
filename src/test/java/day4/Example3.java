package day4;


import day5.ExamapleAccessModifier;
// child/base/sub class extends parent/super
public class Example3 extends ExamapleAccessModifier {
    public static void main(String[] args) {

        Example3 ex = new Example3();
        ex.publicMethod();
        ex.protectedMethod();

    }
}
