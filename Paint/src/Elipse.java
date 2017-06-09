import java.awt.Color;
import java.awt.Graphics;

public class Elipse extends MyShape {
	private int x, y, p, Rx2, Ry2, twoRx2, twoRy2, px, py;

	public Elipse() {
		super();
	}

	public Elipse(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		Rx2 = x2 * x2;
		Ry2 = y2 * y2;
		twoRx2 = 2 * Rx2;
		twoRy2 = 2 * Ry2;
		x = 0;
		y = y2;
		px = 0;
		py = twoRx2 * y;

		// Region 1
		p = (int) Math.round(Ry2 - (Rx2 * y2) + (0.25 * Rx2));

		while (px <= py) {
			x++;
			px += twoRy2;
			if (p < 0)
				p += Ry2 + px;
			else {
				y--;
				py -= twoRx2;
				p += Ry2 + px - py;
			}
			g.fillRect((int) Math.round((x1 + x) / 10.0) * 10, (int) Math.round((y1 + y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 + x) / 10.0) * 10, (int) Math.round((y1 - y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 - x) / 10.0) * 10, (int) Math.round((y1 + y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 - x) / 10.0) * 10, (int) Math.round((y1 - y) / 10.0) * 10, 10, 10);

		}
		// Region 2
		p = (int) Math.round(Ry2 * (x + 0.5) * (x + 0.5) + Rx2 * (y - 1) * (y - 1) - Rx2 * Ry2);
		while (y >= 0) {
			y--;
			py -= twoRx2;
			if (p > 0)
				p += Rx2 - py;
			else {
				x++;
				px += twoRy2;
				p += Rx2 - py + px;
			}
			g.fillRect((int) Math.round((x1 + x) / 10.0) * 10, (int) Math.round((y1 + y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 + x) / 10.0) * 10, (int) Math.round((y1 - y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 - x) / 10.0) * 10, (int) Math.round((y1 + y) / 10.0) * 10, 10, 10);
			g.fillRect((int) Math.round((x1 - x) / 10.0) * 10, (int) Math.round((y1 - y) / 10.0) * 10, 10, 10);

		}

	}

}