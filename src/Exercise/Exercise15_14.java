package Exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise15_14 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exercise15_14() {
		setTitle("Draw percentage");
		add(new InnerPanel());
	}

	public static void main(String args[]) {
		Exercise15_14 frame = new Exercise15_14();
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class InnerPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Color[] colorArray = { Color.BLUE, Color.RED, Color.BLUE, Color.GRAY };
	public String[] nameArray = { "Project -- 20%", "Quizzes -- 10%",
			"Midtems -- 30%", "Final -- 40%" };
	public int scoreArray[] = { 20, 10, 30, 40 };

	public InnerPanel() {
		this.setLayout(new BorderLayout());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int barWidth = (int)((getWidth() - 10.0) / scoreArray.length - 10);
		int x=10;
		for (int i = 0; i < colorArray.length; i++) {
			g.setColor(colorArray[i]);
			g.drawString(nameArray[i], getWidth() / 4 - 50 + (i * 100),
					getHeight() / 2 - 5);
			g.drawLine(5, getHeight() - 10, getWidth() - 5, getHeight() - 10);
			int y=getHeight()-10-scoreArray[i];
			g.fillRect(x, y, barWidth, scoreArray[i]);
			x += barWidth + 10;
		}

	}

}