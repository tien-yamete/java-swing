package Com.Model;

public class ModelSale {
    private int saleID;
    private String nameSale;
    private String description;
    private String dayStart;
    private String dayEnd;
    private String saleType;
    private double discount;
    private String status;

    public ModelSale() {
    }

    public ModelSale(int saleID, String nameSale, String description, String dayStart, String dayEnd, String saleType, double discount, String status) {
        this.saleID = saleID;
        this.nameSale = nameSale;
        this.description = description;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.saleType = saleType;
        this.discount = discount;
        this.status = status;
    }

    public ModelSale(String nameSale, String description, String dayStart, String dayEnd, String saleType, double discount, String status) {
        this.nameSale = nameSale;
        this.description = description;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.saleType = saleType;
        this.discount = discount;
        this.status = status;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    
    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public String getNameSale() {
        return nameSale;
    }

    public void setNameSale(String nameSale) {
        this.nameSale = nameSale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
