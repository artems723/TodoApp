package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.ActionListener;

@Component ("addNewButton")
public class ActionListenerAddNewButton extends JButton {
    private ActionListener actionListener;

    @Autowired
    @Qualifier("addNewButtonActionListener")
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    @PostConstruct
    public void init() {
        this.addActionListener(actionListener);
        setText("Add New");
    }
}