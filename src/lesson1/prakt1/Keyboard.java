package lesson1.prakt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        try{
        first = sc.nextInt();
        second = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Должно быть целое число");
        }
        Arifm calculator = new Arifm(op, first, second);
        int calc = calculator.sum();

        System.out.println(calc);
    }
}
