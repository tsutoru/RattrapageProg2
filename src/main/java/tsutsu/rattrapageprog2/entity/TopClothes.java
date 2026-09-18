package tsutsu.rattrapageprog2.entity;

public class TopClothes extends  Clothes {
    private Sleeves sleeves;

    public TopClothes(String name, Size size, Material material, Double price, Sleeves sleeves) {
        super(name, size, material, price);
        this.sleeves = sleeves;
    }

    public TopClothes(){

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
