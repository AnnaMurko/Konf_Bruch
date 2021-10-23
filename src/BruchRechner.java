//Dient nur zu Testzwecken
public class BruchRechner {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(5,7);
        Bruch b2 = new Bruch(5,8);
        Bruch b3 = new Bruch(2,1);
        b1.multiplicate(b2);
        b1.multiplicate(b2,b3);
     //   System.out.println(b1.getDenominator() + " " + b1.getNumerator());
    }
}
