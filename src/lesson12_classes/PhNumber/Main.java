package lesson12_classes.PhNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер телефона - ");
        String phoneNumber = sc.nextLine();

        System.out.println(NumberUtility.removeSymbols(phoneNumber));
        System.out.println(NumberUtility.validateCountry(phoneNumber));
    }
}
