public class Main {
    public static void main(String[] args) {
        Train t1 = new Train("Ласточка", "модель B-901", 2011, "Россия", "",
                301, 3500, "", "отходит от Белорусского вокзала",
                "ледует до станции Минск-Пассажирский", 11);

        Train t2 = new Train("Ленинград", "модель D-125", 2019, "Россия", "",
                270, 1700, "", "отходит от Ленинградского вокзала",
                "ледует до станции МЛенинград-Пассажирский", 8);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println();
        Bus b1 = new Bus("Toyota","x1",2020,"Russia","Red",
                100,1000,"1 час","Москва","Питер",22);

        Bus b2 = new Bus("Mers","z2",2011,"Russia","Blue",
                100,1000,"1 час","Москва","Питер",22);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}