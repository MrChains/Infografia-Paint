package Lines;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GridMouse extends Canvas implements MouseListener, MouseMotionListener {
	static int xi, yi, xf, yf;
	
	GridMouse() {
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();

		for (int i = 0; i < width; i += 10)
			g.drawLine(i, 0, i, height);

		for (int i = 0; i < height; i += 10)
			g.drawLine(0, i, width, i);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		xf = (int) (Math.round(e.getX() / 10.0) * 10);
		yf = (int) (Math.round(e.getY() / 10.0) * 10);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		xi = (int) (Math.round(e.getX() / 10.0) * 10);
		yi = (int) (Math.round(e.getY() / 10.0) * 10);
		repaint();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		xf = (int) (Math.round(e.getX() / 10.0) * 10);
		yf = (int) (Math.round(e.getY() / 10.0) * 10);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}