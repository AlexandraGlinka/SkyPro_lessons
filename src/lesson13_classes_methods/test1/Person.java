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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return getAge() > 18;
        // this можно не использовать, т.к. обращаемся к методу в рамках нашего класса
        // область видимости
    }

    public String toString() {
        return "Имя - " + this.name + ". Возраст - " + this.age;
    }
}
