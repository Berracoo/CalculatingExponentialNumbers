import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int numOne = num.nextInt();
        System.out.println();
        System.out.print("Please enter the second number : ");
        int numTwo = num.nextInt();
        System.out.println();


        int result = 1;
        for (int i = 1; i <= numTwo; i++) {
            result *= numOne;
            // or you could do this one => int result = 0; instead of 1
            // result = Math.pow(numOne,i);

        }
        System.out.println(result);
    }
}