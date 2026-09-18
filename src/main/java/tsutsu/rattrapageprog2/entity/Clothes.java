package tsutsu.rattrapageprog2.entity;

public class Clothes {
    protected String name;
    protected Double price;
    protected Size size;
    protected Material material;

    public Clothes(, String name, Size size, Material material, Double price) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.material = material;
    }

    public Clothes(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
