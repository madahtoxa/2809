public class Train extends Transport {

    private int cost;
    private String time;
    private String station;
    private String lastStation;
    private int railwayСarriage;

    public Train(String brand, String model, int yearOut, String country, String color,
                 int speedMax, int cost, String time, String station, String lastStation, int railwayСarriage) {
        super(brand, model, yearOut, country, color, speedMax);
        this.cost = cost;
        this.time = time;
        this.station = station;
        this.lastStation = lastStation;
        this.railwayСarriage = railwayСarriage;
    }

    @Override
    protected void refill(Boolean gasoline, Boolean disel, Boolean elec) {

    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOut=" + super.getYearOut() +'\'' +
                ", country='" + super.getCountry() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", speedMax=" + super.getSpeedMax() + '\'' +
                ", yearOut=" + super.getYearOut() + '\'' +
                "cost=" + cost + '\'' +
                ", time='" + time + '\'' +
                ", firstStation='" + station + '\'' +
                ", lastStation='" + lastStation + '\'' +
                ", railwayСarriage=" + railwayСarriage +
                '}';
    }
}
