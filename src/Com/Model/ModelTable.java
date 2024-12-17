package Com.Model;

public class ModelTable {
    private String tableID;
    private String tableName;
    private String status;

    public ModelTable(String tableID, String tableName, String status) {
        this.tableID = tableID;
        this.tableName = tableName;
        this.status = status;
    }

    public ModelTable() {
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
