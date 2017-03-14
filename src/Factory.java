
public abstract class Factory {
    private String name;
    private String addres;

    public Factory(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Factory factory = (Factory) o;

        if (!name.equals(factory.name)) return false;
        return addres.equals(factory.addres);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + addres.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
