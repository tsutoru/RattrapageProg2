package tsutsu.rattrapageprog2.entity;

public class BottomClothes extends Clothes {
    private int taille;

    public BottomClothes(String name, Size size, Material material, Double price, int taille) {
        super(name, size, material, price);
        this.taille = taille;
    }

    public BottomClothes () {

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
