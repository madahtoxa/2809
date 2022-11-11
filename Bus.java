public class Bus extends Train{
    public Bus(String brand, String model, int yearOut, String country, String color, int speedMax, int cost, String time, String station, String lastStation, int railwayСarriage) {
        super(brand, model, yearOut, country, color, speedMax, cost, time, station, lastStation, railwayСarriage);

    }
    @Override
    public String toString() {
        return "Bus {" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOut=" + super.getYearOut() +'\'' +
                ", country='" + super.getCountry() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", speedMax=" + super.getSpeedMax() + '\'' +
                ", yearOut=" + super.getYearOut() + '\'' +
                '}';
    }
}
