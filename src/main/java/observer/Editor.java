package observer;

import javax.swing.*;

public class Editor extends JFrame {

	private JPanel panel = new JPanel();
	private ObservableTextField textField1 = new ObservableTextField();
	private ObservableTextField textField2 = new ObservableTextField();
	private ObservableTextField textField3 = new ObservableTextField();

	private JButton button = new JButton("My button");

	public Editor() {
		setSize(300, 300);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(button);

		this.add(panel);
	}

	public ObservableTextField getTextField1() {
		return textField1;
	}

	public ObservableTextField getTextField2() {
		return textField2;
	}

	public ObservableTextField getTextField3() {
		return textField3;
	}

	public JButton getButton() {
		return button;
	}
}
