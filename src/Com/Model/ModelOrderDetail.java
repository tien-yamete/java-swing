package Com.Model;

public class ModelOrderDetail {
    private int orderID;
    private ModelProductDetail productDetail;
    private int quantity;
    private double price;

    public ModelOrderDetail() {
    }

    public ModelOrderDetail(int orderID, ModelProductDetail productDetail, int quantity, double price) {
        this.orderID = orderID;
        this.productDetail = productDetail;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ModelProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ModelProductDetail productDetail) {
        this.productDetail = productDetail;
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


    

    
    
}
