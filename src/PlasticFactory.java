
public class PlasticFactory extends Factory {
    private String type;

    public PlasticFactory(String name, String addres, String type) {
        super(name, addres);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlasticFactory that = (PlasticFactory) o;

        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public String toString() {
        return "PlasticFactory{" +
                "type='" + type + '\'' +
                '}';
    }
}
