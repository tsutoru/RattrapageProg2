package tsutsu.rattrapageprog2.entity;

public class Clothes {
    protected String name;
    protected Type type;
    protected Material material;

    public Clothes(String name, Type type, Material material){
        this.name = name;
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
