public class problema01 {
    public static void main(String[] args) {
        ComputeMethods compute = new ComputeMethods();

        double degreesF = 100.0;
        double celsius = compute.fToC(degreesF);
        System.out.println("A temperatura em Celsius é de: " + celsius);

        int a = 1;
        int b = 2;
        double hypotenuse = compute.hypotenuse(a, b);
        System.out.println("A hipotenusa do triangulo é de: " + hypotenuse);

        int rollValue = compute.roll();
        System.out.println("A soma dos dados é de:  " + rollValue);
    }
}

class ComputeMethods {
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5 / 9;
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}