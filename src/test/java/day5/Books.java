package day5;

public class Books {

// THis is a constructor
    public Books() {
        System.out.println("I am a constructor");
    }

    // this is a constructor over loading.
    public Books(String author) {

        System.out.println("Author "+ author);
    }

    public static void main(String[] args) {
        new Books("Arvind");
        new Books();

    }
}
