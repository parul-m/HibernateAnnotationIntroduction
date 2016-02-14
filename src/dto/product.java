package dto;
import javax.persistence.*;

@Entity
@Table(name="Product")
public class product {
    @Id
    @Column(name = "ProductId")
    int id;
    @Column(name = "ProductName")
    String name;
    @Column(name = "ProductPrice")
    float price;

    public product() {}
    
    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
