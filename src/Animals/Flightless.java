package Animals;

import java.util.Objects;

public class Flightless extends Birds {
    private final String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (movementType == null || movementType.isBlank()) {
            this.movementType = "некорректное значение";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless animals = (Flightless) o;
        return Objects.equals(getName(), animals.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения: " + getMovementType();
    }
}