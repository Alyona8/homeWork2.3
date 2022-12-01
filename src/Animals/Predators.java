package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    public final String typeOFood;

    public Predators(String name, Integer age, String livingEnvironment, Integer travelSpeed, String typeOFood) {
        super(name, age, livingEnvironment, travelSpeed);
        if (typeOFood == null || typeOFood.isBlank()) {
            this.typeOFood = "Некорректное значение";
        } else {
            this.typeOFood = typeOFood;
        }
    }

    public String getTypeOFood() {
        return typeOFood;
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators animals = (Predators) o;
        return Objects.equals(getName(), animals.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", класс Хищники " + ", тип пищи: " + typeOFood;
    }
}