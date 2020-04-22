
public class CalculatorDriver {
    public static void main(String[]args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 5));
        System.out.println(calc.subtract(2.1, 5));
        System.out.println(calc.multiply(2, 5.4));
        System.out.println(calc.divide(5, 2));
        System.out.println(calc.modulus(5, 2));
        System.out.println(calc.square(5));
        System.out.println(calc.power(4, 3));
        System.out.println(calc.root(69));
    }

}