package Animals;

import java.util.Objects;

public class Flying extends Birds {
    private final String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
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

    public void fly() {
        System.out.println("Я летаю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying animals = (Flying) o;
        return Objects.equals(getName(), animals.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения: " + getMovementType();
    }
}