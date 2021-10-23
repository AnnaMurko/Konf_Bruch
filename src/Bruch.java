public class Bruch {
    private int numerator;
    private int denominator;

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return (double) numerator / (double) denominator;
    }

    public String print() {
        return String.format("%d / %d", numerator, denominator);
    }

    public Bruch multiplicate(Bruch b2) {
        int newDenominator = b2.getDenominator() * denominator;
        int newNumerator = b2.getNumerator() * numerator;
        return new Bruch(newNumerator, newDenominator);
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
     return multiplicate(b2.multiplicate(b3));
    }
}
