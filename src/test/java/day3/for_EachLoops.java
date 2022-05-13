package day3;

public class for_EachLoops {

    public static void main(String[] args) {

        /**
        for(data_type var : array_name/collection_name){
        //statements
         }
         *
         *
         */
        //                    0        1     2       3
        String  [] std =  {"Arvind","Raj","Kumar","uday"};

//        System.out.println(std[]);

        for(String str :std){
            if(str.equals("Raj")){
                System.out.println("FOund");
            }else{
                System.out.println("not match");
            }

        }

        System.out.println("***************");

        for(int i=0;i<std.length;i++){
            System.out.println(std[i]);
        }

    }
}
