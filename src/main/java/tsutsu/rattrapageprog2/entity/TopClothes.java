package tsutsu.rattrapageprog2.entity;

public class TopClothes extends  Clothes {
    private Sleeves sleeves;

    public TopClothes(String name, Type type, Material material,Double price, Sleeves sleeves) {
        super(name, type, material, price);
        this.sleeves = sleeves;
    }

    public TopClothes(Sleeves sleeves) {
        this.sleeves = sleeves;
    }

    public Sleeves getSleeves() {
        return sleeves;
    }

    public void setSleeves(Sleeves sleeves) {
        this.sleeves = sleeves;
    }
}
