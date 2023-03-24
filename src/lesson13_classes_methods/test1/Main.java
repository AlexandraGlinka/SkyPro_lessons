package lesson13_classes_methods.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sasha = new Person("Саша", 26);
//        if (sasha.getAge() >= 18) {                   ////// убираем в метод !
//            System.out.println("Иди в бар");
//        } else {
//            System.out.println("Иди в школу");
//        }
        if (personService.isAdult(sasha)) {
            //isAdult(sasha)
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sasha);
        sasha.increaseAge(1);
        System.out.println(sasha);
    }
}
