package day6;

public class iPhone extends Mobile {
    void call() {
        System.out.println("Face time calling..");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.call();
        iphone.tourch();
    }
}
