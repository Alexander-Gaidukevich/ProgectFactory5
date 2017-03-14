
public class FurnitureFactory extends Factory{
    private String nameFurniture;
    private String typeWood;

    public FurnitureFactory(String name, String addres, String nameFurniture, String typeWood) {
        super(name, addres);
        this.nameFurniture = nameFurniture;
        this.typeWood = typeWood;
    }

    public String getNameFurniture() {
        return nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = nameFurniture;
    }

    public String getTypeWood() {
        return typeWood;
    }

    public void setTypeWood(String typeWood) {
        this.typeWood = typeWood;
    }
}
