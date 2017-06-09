package Lines;

import java.awt.*;



public class Dda extends GridMouse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Dda() {
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int dx, dy;
		float Xinc, Yinc, x, y, steps;

		dy = yf - yi;
		dx = xf - xi;
		g.fillRect(xi, yi, 10, 10);
		if (dy > dx) {
			steps = Math.abs(dy);
		} else {
			steps = Math.abs(dx);
		}
		x = xi;
		y = yi;
		Yinc = dy / steps;
		Xinc = dx / steps;
		while (steps != 0) {

			steps--;
			x = x + Xinc;
			y = y + Yinc;

			g.fillRect((int) Math.round(x / 10.0) * 10, (int) Math.round(y / 10.0) * 10, 10, 10);

		}

	}
	


}