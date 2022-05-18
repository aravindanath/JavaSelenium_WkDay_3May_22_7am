package day6;
// sub class/ child class ---> parent class / super class / base class
public class Dog extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fur();
        dog.tail();
        dog.bark();
        dog.vaccinations();
    }
    public void bark(){
        System.out.println("dog barks");
    }
}
