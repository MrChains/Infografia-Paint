import java.awt.Color;
import java.awt.Graphics;

public class Bresenham extends MyShape {

	public Bresenham() {
		super();
	}

	public Bresenham(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		int dx, dy, stepx, stepy;
		dx = x2 - x1;
		dy = y2 - y1;

		if (dy < 0) {
			dy = -dy;
			stepy = -1;
		} else
			stepy = 1;

		if (dx < 0) {
			dx = -dx;
			stepx = -1;
		} else
			stepx = 1;

		if ((x1 == x2) && (y1 == y2))
			g.fillRect((int) Math.round(x1 / 10.0) * 10, (int) Math.round(y1 / 10.0) * 10, 10, 10);

		if (dx > dy) {
			int frac = 2 * dy - dx;
			while (x1 != x2) {
				x1 += stepx;
				if (frac >= 0) {
					y1 += stepy;
					frac -= 2 * dx;
				}
			}
			frac += 2 * dy;
			g.fillRect((int) Math.round(x1 / 10.0) * 10, (int) Math.round(y1 / 10.0) * 10, 10, 10);
		} else {
			int frac = 2 * dx - dy;
			while (y1 != y2) {
				if (frac >= 0) {
					x1 += stepx;
					frac -= 2 * dy;
				}
				y1 += stepy;
				frac += 2 * dx;
				g.fillRect((int) Math.round(x1 / 10.0) * 10, (int) Math.round(y1 / 10.0) * 10, 10, 10);
			}
		}

	}
}
