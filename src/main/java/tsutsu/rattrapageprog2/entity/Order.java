package tsutsu.rattrapageprog2.entity;

import org.w3c.dom.Text;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Timestamp date;
    private Text description;
    private List<Clothes> clothes = new ArrayList<Clothes>();
    private Client client;

    public Order(int id, List<Clothes> clothes, Text description, Timestamp date, Client client) {
        this.id = id;
        this.clothes = clothes;
        this.description = description;
        this.date = date;
        this.client = client;
    }

    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalAmount(){
        double total = 0;
        for (Clothes clothe : clothes){
            total += clothe.getPrice();
        }
        return total;
    }
}
