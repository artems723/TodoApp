package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.swing.*;

@org.springframework.stereotype.Component
public class BoxLayoutPanel extends JPanel {
    /**
     * We can't use "components" as the property name, because it conflicts with
     * an existing property on the Component superclass.
     */
    private ItemScrollPane itemScrollPane;
    private ButtonPanel buttonPanel;

    @Autowired
    public void setItemScrollPane(ItemScrollPane itemScrollPane) {
        this.itemScrollPane = itemScrollPane;
    }

    @Autowired
    public void setButtonPanel(ButtonPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    @PostConstruct
    public void init() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(itemScrollPane);
        add(buttonPanel);
    }
}