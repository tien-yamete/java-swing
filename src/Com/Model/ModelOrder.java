package Com.Model;

public class ModelOrder {
    private int orderId;
    private int employeeID;
    private String tableID; 
    private int customerID;
    private String createdDate;
    private double price;
    private String status;

    public ModelOrder() {
    }

    public ModelOrder(int orderId, int employeeID, String tableID, int customerID, String createdDate, double price, String status) {
        this.orderId = orderId;
        this.employeeID = employeeID;
        this.tableID = tableID;
        this.customerID = customerID;
        this.createdDate = createdDate;
        this.price = price;
        this.status = status;
    }

    public ModelOrder(int employeeID, String tableID, int customerID, String createdDate, double price, String status) {
        this.employeeID = employeeID;
        this.tableID = tableID;
        this.customerID = customerID;
        this.createdDate = createdDate;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
