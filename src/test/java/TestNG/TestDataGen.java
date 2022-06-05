package TestNG;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class TestDataGen {


    @Test
    public void data(){

        Faker faker = new Faker(new Locale("ru"));
        String fn =faker.name().fullName();
        System.out.println(fn);
    }

}
