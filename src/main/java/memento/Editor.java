package memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Editor extends JFrame implements Originator {

	private JButton randomFrame;
	private JButton undo;
	private Random random = new Random();
	private JPanel panel = new JPanel();
	private int currentWidth;
	private int currentHeight;
	private Color currentColor;
	private Runnable onBeforeReshape;


	public Editor() {
		setPanelSize(300, 300);
		currentColor = panel.getBackground();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		randomFrame = new JButton("random frame");
		panel.add(randomFrame);
		randomFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onBeforeReshape != null) {
					onBeforeReshape.run();
				}
				reshapeEditor();
			}
		});

		undo = new JButton("undo");
		panel.add(undo);

		this.add(panel);
	}

	private void setPanelSize(int width, int height) {
		currentHeight = height;
		currentWidth = width;
		setSize(width, height);
	}

	private void setPanelColor(Color color) {
		currentColor = color;
		panel.setBackground(color);
	}

	private void reshapeEditor() {
		setPanelSize(random.nextInt(500) + 50, random.nextInt(500) + 50);
		setPanelColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

	}

	public Memento createSnapshot() {
		return new EditorMemento(this, new EditorState(currentColor, currentWidth, currentHeight));
	}

	public void setState(EditorState state) {
		setPanelSize(state.currentWidth, state.currentHeight);
		setPanelColor(state.currentColor);
	}

	public void setOnBeforeReshape(final Runnable runnable) {
		this.onBeforeReshape = runnable;
	}

	public void setOnUndo(final Runnable runnable) {
		undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runnable.run();
			}
		});
	}

	public static class EditorState {
		private int currentWidth;
		private int currentHeight;
		private Color currentColor;

		public EditorState(Color currentColor, int currentWidth, int currentHeight) {
			this.currentColor = currentColor;
			this.currentWidth = currentWidth;
			this.currentHeight = currentHeight;
		}
	}

}
