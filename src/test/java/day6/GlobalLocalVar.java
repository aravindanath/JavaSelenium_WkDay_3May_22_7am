package day6;

public class GlobalLocalVar {


    final String city = "Bangalore"; // Global Var // instance Var

    public static void main(String[] args) {

        GlobalLocalVar gv = new GlobalLocalVar();
        gv.admission("Software testing","Arvind");
        gv.hostelReg("Raj");
    }

    public void admission(String course,String name){
        String uninersity = "BU"; // local var
        System.out.println("Course "+ course);
        System.out.println("Name "+ name);
        System.out.println("City "+ city);
        System.out.println("University "+ uninersity);
    }

    public void hostelReg(String name){
        System.out.println("Name "+ name);
      //  city = "Pune";
        System.out.println("City "+ city);

    }

}
