class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public double add(double a,int b){
        return a+b;
    }
}






public class Calculator {
    public static void main(String[] args) {
        Calc cal = new Calc();

        System.out.println("Sum: " + cal.add(10,20));
    }
}
