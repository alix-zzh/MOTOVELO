package detail;

import java.awt.*;

/**
 * Created by alex on 27.11.17.
 */
public class WheelDetail implements WheelView {
    private Color color;
    private int width;
    private final int RADIUS=30;

    public WheelDetail(Color color, int width) {
        this.color = color;
        this.width = width;
    }

    @Override
    public void print(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(width));
        g2.setPaint(color);
        int diameter = RADIUS * 2;
        g2.drawOval(30 - RADIUS, 70 - RADIUS, diameter, diameter);
        g2.drawOval(120 - RADIUS, 70 - RADIUS, diameter, diameter);
    }
}
