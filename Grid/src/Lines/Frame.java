package Lines;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Frame extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		for (int i = 0; i < width; i += 10)
			g.drawLine(i, 0, i, height);

		for (int i = 0; i < height; i += 10)
			g.drawLine(0, i, width, i);

	}
}
