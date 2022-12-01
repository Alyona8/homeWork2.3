package Transport;

import Transport.Transport;

import java.security.Key;
import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               int productionYear,
               String country,
               String color,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String typeOfBody,
               String regNumber,
               int seatsCount,
               boolean summerTyres,
               Key key,
               Insurance insurance) {
        super(brand, model, productionYear, country, color, maxSpeed);
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (typeOfBody == null) {
            this.typeOfBody = "Седан";
        } else {
            this.typeOfBody = typeOfBody;
        }
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        if (seatsCount == 0) {
            this.seatsCount = 5;
        } else {
            this.seatsCount = seatsCount;
        }
        this.summerTyres = summerTyres;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000D, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    @Override
    public void refill() {
        System.out.println("Можно заправить бензином, дизелем на заправке или зарядить на электро-парковке");
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() +
                ", объем двигателя " + getEngineVolume() +
                ", коробка передач: " + getTransmission() +
                ", тип кузова: " + getTypeOfBody() +
                ", регистрационный номер: " + getRegNumber() +
                ", количество мест: " + getSeatsCount() +
                ", " + (isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                ", " + ((getKey().isWithoutKeyAccess()) ? "беcключевой доступ" : "ключевой доступ") +
                ", " + ((getKey().isRemoteRunEngine()) ? "удалённый запуск" : "обычный запуск") +
                ", номер страховки: " + getInsurance().getNumber() +
                ", стоимость страховки: " + getInsurance().getCost() +
                ", срок действия страховки: " + getInsurance().getExpireDate();

    }
}