package lesson13_classes_methods.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person sasha = new Person("Саша", 26);
//        if (sasha.getAge() >= 18) {                   ////// убираем в метод !
//            System.out.println("Иди в бар");
//        } else {
//            System.out.println("Иди в школу");
//        }
        if (sasha.isAdult()) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sasha);
    }
}
