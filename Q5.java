package Programming_Tutorial;

public class Q5 {
    public int add(int a, int b){
        return a + b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int squareRoot(int a){
        return a * a;
    }
    public static void main(String[] args) {
        Q5 number1 = new Q5();

        int multi1 = number1.multiply(3,4);
        int multi2 = number1.multiply(5,7);
        int sum = number1.add(multi1, multi2);
        int square1 = number1.squareRoot(sum);

        System.out.println("Q1 answer : " + square1);

        int sum2 = number1.add(4,7);
        int square2 = number1.squareRoot(sum2);
        int sum3 = number1.add(8,3);
        int square3 = number1.squareRoot(sum3);
        int sum4 = number1.add(square2, square3);
        System.out.println("Q2 answer : " + sum4);
    }
}
