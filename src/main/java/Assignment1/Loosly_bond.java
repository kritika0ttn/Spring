package Assignment1;

public class Loosly_bond {
    Candy candy;
    public Loosly_bond(Candy candy){
        this.candy=candy;
        this.candy.candy_Type();
    }

}

interface Candy{
    void candy_Type();
}

class SourBites implements Candy{
     public void candy_Type(){
    System.out.println("this is sourBites candy");

    }
}class Almond_choco implements Candy{
    public void candy_Type(){
    System.out.println("this is choco almond candy");

    }
}class Gummy_bear implements Candy{
    public void candy_Type(){
    System.out.println("this is gummyBear candy");

    }
}

class Main{
    public static void main(String[] args) {

        Loosly_bond lb= new Loosly_bond(new Gummy_bear());
        Loosly_bond lb1= new Loosly_bond(new Almond_choco());
        Loosly_bond lb2= new Loosly_bond(new SourBites());
    }
}