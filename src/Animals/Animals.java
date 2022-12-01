package Animals;

import java.util.Objects;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(Integer.parseInt(String.valueOf(age)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "некорректное значение";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    void eat() {
        System.out.println("Я кушаю");
    }

    public void sleep() {
        System.out.println("Я сплю");
    }

    void go() {
        System.out.println("Я перемещаюсь");
    }

    @Override
    public String toString() {
        return getClass() + ", имя: " + getName() + ", возраст: " + getAge() + " лет";
    }
}