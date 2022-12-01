package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null) {
            this.livingEnvironment = "некорректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt() {
        System.out.println("Я охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians animals = (Amphibians) o;
        return Objects.equals(getName(), animals.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", среда проживания: " + getLivingEnvironment();
    }
}