package day6;

public class ExampleEncapsulation {

    public static void main(String[] args) {
        BnkTxn bt = new BnkTxn();
        bt.setAmt(1243);
        bt.setCardNumber(312413414313l);
        bt.setCvv(221);
        bt.setName("Arvind");

        System.out.println(bt.getAmt());
        System.out.println(bt.getCardNumber());
        System.out.println(bt.getName());
        System.out.println(bt.getCvv());
        System.out.println("**********");
        bt.setAmt(23423);
        bt.setCardNumber(2345342452435l);
        bt.setCvv(644);
        bt.setName("Sanjeev");

        System.out.println(bt.getAmt());
        System.out.println(bt.getCardNumber());
        System.out.println(bt.getName());
        System.out.println(bt.getCvv());
    }

}
