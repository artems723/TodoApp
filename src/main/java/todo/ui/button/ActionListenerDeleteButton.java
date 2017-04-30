package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.ActionListener;

@Component("deleteButton")
public class ActionListenerDeleteButton extends JButton {
    private ActionListener actionListener;

    @Autowired
    @Qualifier("deleteButtonActionListener")
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    @PostConstruct
    public void init() {
        this.addActionListener(actionListener);
        setText("Delete");
    }
}