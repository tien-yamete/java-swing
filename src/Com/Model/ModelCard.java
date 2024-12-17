package Com.Model;

import javax.swing.Icon;

public class ModelCard {
    String title;
    double values;
    Icon icon;

    public ModelCard() {
    }

    public ModelCard(String title, double values, Icon icon) {
        this.title = title;
        this.values = values;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
}
