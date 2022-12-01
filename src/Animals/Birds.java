package Animals;

public class Birds extends Animals {
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
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
    public String toString() {
        return super.toString() + ", среда проживания: " + getLivingEnvironment();
    }
}