package Com.View.Swing;

import Com.Swing.Scrollbar.ScrollBarCustom;
import com.raven.table.TableCustom;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;

public class Table extends TableCustom{

    public Table() {
    }
    
    public void addTableStyle(JScrollPane scroll){
        scroll .getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        
        JPanel panel = new JPanel();
        
        panel.setBackground(new Color(136, 136, 136));
        
        setForeground(new Color(214, 214, 214));
        setSelectionForeground(new Color(214, 214, 214));
        setSelectionBackground(new Color(50, 50, 50));
        getTableHeader().setDefaultRenderer(new TableHeaderCustom());
        setRowHeight(40);
        setShowHorizontalLines(true);
        setGridColor(new Color(50, 50, 50));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component com =  super.prepareRenderer(renderer, row, column);       
        if(!isCellSelected(row, column)){
            com.setBackground(new Color(60,60,60));
        }
        return com;
    }
    
    
}
