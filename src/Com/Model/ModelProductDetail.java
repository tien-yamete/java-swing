package Com.Model;

public class ModelProductDetail {
    private String productDetailId;
    private ModelProduct product;
    private String entryDate;
    private int quantity;
    private double price;
    private String description;

    public ModelProductDetail() {
    }

    public ModelProductDetail(String productDetailId, ModelProduct product, String entryDate, int quantity, double price, String description) {
        this.productDetailId = productDetailId;
        this.product = product;
        this.entryDate = entryDate;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public String getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(String productDetailId) {
        this.productDetailId = productDetailId;
    }

    public ModelProduct getProduct() {
        return product;
    }

    public void setProduct(ModelProduct product) {
        this.product = product;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
