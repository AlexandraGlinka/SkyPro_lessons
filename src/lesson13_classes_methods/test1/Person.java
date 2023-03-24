package lesson13_classes_methods.test1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

//    public void setAge(int age) {
//        if (age < 0) {
//            throw new IllegalArgumentException("Возраст не может быть отрицательным");
//        } else if (age < this.age) {
//            throw new IllegalArgumentException("Новый возраст меньше текущего");
//        }
//        this.age = age;
//    }

    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Инкремент не может быть отрицательным");
        }
        this.age = age + increment;
    }

//    public boolean isAdult() {
//        return getAge() > 18;
//    в классе должны быть описаны: конструктор, геттеры и сеттеры, остальное выносим в отдельный класс!!!!
        // this можно не использовать, т.к. обращаемся к методу в рамках нашего класса
        // область видимости
//    }

    public String toString() {
        return "Имя - " + this.name + ". Возраст - " + this.age;
    }
}
