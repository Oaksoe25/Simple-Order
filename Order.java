class Order<T, P extends Number> {
    private T id;
    private P price;
    private String type;

    public Order(T id, P price, String type) {
        this.id = id;
        this.price = price;
        this.type = type;
    }

    public T getId() {
        return id;
    }

    public P getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + ", Type: " + type + ", Price: " + price;
    }
}