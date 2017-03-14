
public class CarFactory extends Factory implements ICarFactory {
    private String model;
    private String collor;
    private double cost;

    public CarFactory(String name, String addres, String model, String collor, double cost) {
        super(name, addres);
        this.model = model;
        this.collor = collor;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CarFactory that = (CarFactory) o;

        if (Double.compare(that.cost, cost) != 0) return false;
        if (!model.equals(that.model)) return false;
        return collor.equals(that.collor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + model.hashCode();
        result = 31 * result + collor.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "model='" + model + '\'' +
                ", collor='" + collor + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public double getMaxCostFactory(CarFactory[] carsF) {
        return 0;
    }

    @Override
    public double getArgCostFactory(CarFactory[] carsF) {
        return 0;
    }
}
