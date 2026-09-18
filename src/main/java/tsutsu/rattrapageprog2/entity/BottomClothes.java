package tsutsu.rattrapageprog2.entity;

public class BottomClothes extends Clothes {
    private int taille;

    public BottomClothes(String name, Type type, Material material,Double price, int taille) {
        super(name, type, material, price);
        this.taille = taille;
    }

    public BottomClothes(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
