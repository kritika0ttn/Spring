package Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Spring_Lossly {
@Autowired
    Candy1 candy;

// constructor injection is taking place
    public Spring_Lossly(Candy1 candy){
        this.candy=candy;
        this.candy.candy_Type();
    }

}

interface Candy1{
    void candy_Type();
}

@Component
class Sour_Bites implements Candy1{
    public void candy_Type(){
        System.out.println("this is sourBites candy");

    }
}

@Component
@Primary
// using primary to resolve ambiguity during autowiring
class AlmondChoco implements Candy1{
    public void candy_Type(){
        System.out.println("this is choco almond candy");

    }
}

@Component
class GummyBear implements Candy1{
    public void candy_Type(){
        System.out.println("this is gummyBear candy");

    }
}

@SpringBootApplication
class Call{
    public static void main(String[] args) {

        //Spring Bean from application context and displaying the outcome
        ApplicationContext context= SpringApplication.run(Call.class,args);

        Spring_Lossly spl =context.getBean(Spring_Lossly.class);

    }
}