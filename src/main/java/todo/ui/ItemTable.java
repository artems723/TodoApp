package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.TableModel;

@Component
public class ItemTable extends JTable {

    @Override
    @Autowired
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
    }
}
