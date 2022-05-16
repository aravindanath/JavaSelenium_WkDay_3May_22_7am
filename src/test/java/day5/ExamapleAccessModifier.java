package day5;

public class ExamapleAccessModifier {

    public void publicMethod(){
        System.out.println("Public method");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }


    protected void protectedMethod(){
        System.out.println("protected method");
    }

      void defaultMethod(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {

        ExamapleAccessModifier em = new ExamapleAccessModifier();
        em.defaultMethod();
        em.privateMethod();
        em.publicMethod();
        em.protectedMethod();

    }
}
