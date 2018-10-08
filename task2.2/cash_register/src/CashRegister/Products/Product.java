package CashRegister.Products;

public abstract class Product {
    protected String name;
    protected float price;
    protected  int count;
    protected ProductState state;

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public ProductState getState() {
        return state;
    }
}
