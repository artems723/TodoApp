package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import todo.ui.button.ActionListenerAddNewButton;
import todo.ui.button.ActionListenerDeleteButton;

import javax.annotation.PostConstruct;
import javax.swing.*;

@org.springframework.stereotype.Component
public class ButtonPanel extends JPanel {
	/**
	 * We can't use "components" as the property name, because it conflicts with
	 * an existing property on the Component superclass.
	 */

	private ActionListenerDeleteButton actionListenerDeleteButton;
	private ActionListenerAddNewButton actionListenerAddNewButton;

	@Autowired
	public void setActionListenerDeleteButton(ActionListenerDeleteButton actionListenerDeleteButton) {
		this.actionListenerDeleteButton = actionListenerDeleteButton;
	}

	@Autowired
	public void setActionListenerAddNewButton(ActionListenerAddNewButton actionListenerAddNewButton) {
		this.actionListenerAddNewButton = actionListenerAddNewButton;
	}

	@PostConstruct
	public void init() {

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		add(actionListenerDeleteButton);
		add(actionListenerAddNewButton);
	}
}