
public class Calculator {
    public double add(double x, double y){
        return x + y;
        
    }
    public double subtract(double x, double y){
        return x - y;
        
    }
    public double multiply(double x, double y){
        return x*y;
        
    }
    public double divide(double x, double y){
        return x / y;
        
    }
    public int modulus(int x, int y){
        return x % y;
        
    }
    public double square(double x){
        return x * x;
        
    }
    public double power(double x, double y){
        return Math.pow(x, y);
    }
    public double root(double x){
        //return (Math.sqrt(x));
        double f = 1;
        for(double i = 0; i < 10; i++){
            f = 0.5*(f + x/f);
        }
        return f;
    }

}