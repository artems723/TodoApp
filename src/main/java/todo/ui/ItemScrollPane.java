package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.swing.*;
import java.awt.*;

@org.springframework.stereotype.Component
public class ItemScrollPane extends JScrollPane {

    @Override
    @Autowired
    @Qualifier("itemTable")
    public void setViewportView(Component view) {
        super.setViewportView(view);
    }
}
