package Animals;

public class Mammals extends Animals {
    private final String livingEnvironment;
    private final Integer travelSpeed;

    public Mammals(String name, Integer age, String livingEnvironment, Integer travelSpeed) {
        super(name, age);
        if (livingEnvironment == null) {
            this.livingEnvironment = "Некорректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (travelSpeed <= 0 || travelSpeed == null) {
            this.travelSpeed = 1;
        } else {
            this.travelSpeed = travelSpeed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Integer getTravelSpeed() {
        return travelSpeed;
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    @Override
    public String toString() {
        return super.toString() + ", среда проживания: " + getLivingEnvironment() +
                ", скорость перемещения " + getTravelSpeed() + " км/ч";
    }
}