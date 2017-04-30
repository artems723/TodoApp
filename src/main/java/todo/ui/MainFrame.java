package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

	@PostConstruct
	public void init() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(600, 400));
		setTitle("My To Do List");

		setVisible(true);
		setState(Frame.NORMAL);
		show();
	}

	@Override
	@Autowired
	@Qualifier("boxLayoutPanel")
	public void setContentPane(Container contentPane) {
		super.setContentPane(contentPane);
	}



}