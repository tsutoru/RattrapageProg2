package tsutsu.rattrapageprog2.entity;

public class TopClothes extends  Clothes {
    private Sleeves sleeves;

    public TopClothes(String name, Type type, Material material, Sleeves sleeves) {
        super(name, type, material);
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
