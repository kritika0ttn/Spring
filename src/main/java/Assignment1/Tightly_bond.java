package Assignment1;

class Exm{
    int area;
    public Exm(int a,int b){
        this.area=a*b;

    }
}
public class Tightly_bond {
    public static void main(String[] args) {
        Exm e = new Exm(6,4);
        System.out.println(e.area);
    }
}
