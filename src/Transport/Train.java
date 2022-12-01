package Transport;

import Transport.Transport;

public class Train extends Transport {
    private double tripPrice;
    private Integer travelTime;
    private String departureStationName;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String country, String color, int maxSpeed,
                 double tripPrice, Integer travelTime, String departureStationName, String endingStation,
                 int numberOfWagons) {
        super(brand, model, productionYear, country, color, maxSpeed);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStationName(departureStationName);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice <= 0) {
            System.out.println("бесплатно");
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        if (travelTime == null || travelTime == 0) {
            this.travelTime = 1;
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName.isBlank() || departureStationName.isEmpty()) {
            this.departureStationName = "не указана";
        } else {
            this.departureStationName = departureStationName;
        }
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isBlank() || endingStation.isEmpty()) {
            this.endingStation = "не указана";
        } else {
            this.endingStation = endingStation;
        }

    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 1;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("Можно заправить дизелем на заправке");
    }

    public String toString() {
        return "Поезд " + super.toString() + ", цена поездки " + tripPrice + " руб." +
                ", время поездки " + travelTime + " ч." + ", станция отбытия: " + departureStationName +
                ", конечная остановка: " + endingStation + ", количество вагонов: " + numberOfWagons;
    }
}