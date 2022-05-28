package day6;

public class Android extends Mobile{

    void call() {
        System.out.println("Android call");
    }

    public static void main(String[] args) {
        Android android = new Android();
        android.tourch();
        android.call();
    }
}
