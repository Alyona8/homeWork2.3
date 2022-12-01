package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String country, String color, int maxSpeed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 1;
        }
    }

    public abstract void refill();

    public String toString() {
        return getBrand() +
                ", модель " + getModel() +
                ", год выпуска " + getProductionYear() +
                ", страна производства " + getCountry() +
                ", цвет " + getColor() +
                ", максимальная скорость передвижения " + getMaxSpeed() + " км/ч";
    }
}