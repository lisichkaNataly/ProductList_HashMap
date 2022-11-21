import java.util.Objects;

public class Product {
    String name;
    private int price;

    private boolean isBuy;


    public Product(String name, int price) {
        if (name== null || name.isEmpty() || name.isBlank() || price <= 0)
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void buy() {
        isBuy = true;
    }

    public boolean isBuy() {
        return isBuy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("%s, Цена: %s",
                this.name, this.price);
    }
}
