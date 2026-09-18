package tsutsu.rattrapageprog2.entity;

public class Clothes {
    private int id;
    protected String name;
    protected Double price;
    protected Type type;
    protected Material material;

    public Clothes(String name, Type type, Material material, Double price) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.material = material;
    }

    public Clothes(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
