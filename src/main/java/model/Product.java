package model;

public class Product {
    private long id;
    private String name;
    private Integer price;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {return id;}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
