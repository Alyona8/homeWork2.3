import Animals.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2015, "Россия", "жёлтый", 180,
                1.7, null, null, null, 0, true,
                null, null);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия",
                "чёрный", 250, 3.0, null, null, null,
                0, false, null, null);

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 250,
                3.0, null, null, null, 0, true,
                null, null);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея",
                "красный", 190, 2.4, null, null, null, 0,
                false, null, null);

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый",
                200, 1.6, null, null, null, 0, false,
                null, null);

        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        granta.refill();

        System.out.print("\n");

        Train martin = new Train("Ласточка", "B-901", 2011, "Россия", null,
                301, 3500, null, "Белорусский вокзал",
                "Станция Минск-Пассажирский", 11);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null,
                270, 1700, 0, "Ленинградский вокзал",
                "Станция Ленинград-Пассажирский", 8);

        System.out.println(martin);
        System.out.println(leningrad);
        martin.refill();

        System.out.print("\n");

        Bus daewoo = new Bus("Daewoo", "BC212MA", 2015, "Южная Корея", "белый", 86);
        Bus mercedes = new Bus("Mercedes", "Benz Conecto", 2017, "Германия", "синий", 155);
        Bus nefaz = new Bus("НЕФАЗ", "5299-32", 2019, "Россия", "красный", 110);

        System.out.println(daewoo);
        System.out.println(mercedes);
        System.out.println(nefaz);
        daewoo.refill();

        System.out.print("\n");

        Herbivores gazelle = new Herbivores("Газель", 1, "Суша", 60, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 5, "Суша", 45, "трава");
        Herbivores horse = new Herbivores("Лошадь", 7, "Суша", 70, "трава");
        Predators hyena = new Predators("Гиена", 8, "Суша", 50, "мясо");
        Predators tiger = new Predators("Тигр", 5, "Суша", 65, "мясо");
        Predators bear = new Predators("Медведь", 9, "Суша", 80, "мясо");
        Amphibians frog = new Amphibians("Лягушка", 2, "Вода");
        Amphibians snake = new Amphibians("Уж пресноводный", 7, "Вода");
        Flightless peacock = new Flightless("Павлин", 5, "Суша", "ходьба");
        Flightless penguin = new Flightless("Пингвин", 7, "Суша", "ходьба");
        Flightless dodo = new Flightless("Птица Додо", 5, "Суша", "ходьба");
        Flying gull = new Flying("Чайка", 4, "Небо и суша", "полёт");
        Flying albatross = new Flying("Альбатрос", 8, "Небо и суша", "полёт");
        Flying falcon = new Flying("Сокол", 6, "Небо и суша", "полёт");
        Herbivores gazelle2 = new Herbivores("Газель", 5, "Суша", 55, "трава");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(gazelle.equals(gazelle2));
        giraffe.walk();
    }
}