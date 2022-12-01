package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    public final String typeOFood;

    public Herbivores(String name, Integer age, String livingEnvironment, Integer travelSpeed, String typeOFood) {
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

    public void graze() {
        System.out.println("Я пасусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores animals = (Herbivores) o;
        return Objects.equals(getName(), animals.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", класс Травоядные " + ", тип пищи: " + typeOFood;
    }
}