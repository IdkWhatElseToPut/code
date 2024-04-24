import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class AnimateScreen extends JPanel {
    private int sunY = 50;
    private int duckX = 675;
    private int raccoonX = 500;
    private int cloudX = 200;

    public AnimateScreen() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        daySkySpring(g);
        sun(g, 100, sunY);
        dayGroundSpring(g);
        springTree(g, 80, 400);
        springTree(g, 200, 400);
        springTree(g, 320, 400);
        cabin(g);
        springFlower(g, 100, 500);
        springFlower(g, 200, 500);
        springFlower(g, 300, 500);
        duck(g, duckX, 525);
        racoon(g, raccoonX, 500);
        cloud(g, cloudX, 100);
    }

    public void animate() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            sunY -= 1;
            if(sunY+100<0){
                sunY = 400;
            }

            duckX += 1;
            if (duckX > 800) {
                duckX = 0;
            }

            raccoonX -= 1;
            if (raccoonX + 70 < 0) {
                raccoonX = 800;
            }

            cloudX += 1;
            if (cloudX > 800) {
                cloudX = -200;
            }

            repaint();
        }
    }

    private void daySkySpring(Graphics g) {
        Color colorDaySky = new Color(145, 223, 239);
        g.setColor(colorDaySky);
        g.fillRect(0, 0, 800, 400);
    }

    private void dayGroundSpring(Graphics g) {
        Color colorDayGround = new Color(12, 105, 43);
        g.setColor(colorDayGround);
        g.fillRect(0, 400, 800, 200);
    }

    private void sun(Graphics g, int x, int y) {
        Color colorSun = new Color(247, 247, 65);
        g.setColor(colorSun);
    
        // If the sun goes off the right side of the screen, reappear on the left side
        if (x > 800) {
            g.fillOval(50, sunY, 100, 100);
        } else {
            g.fillOval(x, sunY, 100, 100);
        }
    }
    

    private void cabin(Graphics g) {
        Color cabinOutside = new Color(139, 69, 19);
        Color roof = new Color(176, 33, 33);
        Color door = new Color(102, 51, 0);
        Color doorKnob = new Color(0, 0, 0);

        g.setColor(cabinOutside);
        g.fillRect(500, 300, 150, 150);

        g.setColor(roof);
        int[] roofX = {475, 675, 575};
        int[] roofY = {300, 300, 250};
        g.fillPolygon(roofX, roofY, 3);

        g.setColor(door);
        g.fillRect(555, 375, 45, 75);

        g.setColor(doorKnob);
        g.fillOval(585, 410, 10, 10);

        g.setColor(Color.white);
        g.fillRect(520, 325, 30, 30);
        g.fillRect(600, 325, 30, 30);
    }

    private void springTree(Graphics g, int x, int y) {
        Color treeTrunk = new Color(139, 69, 19);
        Color treeLeaves = new Color(0, 153, 0);

        g.setColor(treeTrunk);
        g.fillRect(x - 12, y, 25, 100);

        g.setColor(treeLeaves);
        g.fillOval(x - 40, y - 65, 80, 80);
        g.fillOval(x - 30, y - 85, 60, 60);
        g.fillOval(x - 20, y - 105, 40, 40);
    }

    private void springFlower(Graphics g, int x, int y) {
        Color stem = new Color(0, 128, 0);
        Color flowerPetal = new Color(225, 192, 203);

        g.setColor(stem);
        g.fillRect(x - 1, y, 5, 40);

        g.setColor(flowerPetal);
        g.fillOval(x + 4, y - 5, 15, 15);
        g.fillOval(x - 6, y + 5, 15, 15);
        g.fillOval(x - 16, y - 5, 15, 15);
        g.fillOval(x - 6, y - 15, 15, 15);

        g.setColor(Color.yellow);
        g.fillOval(x - 6, y - 5, 15, 15);
    }

    private void duck(Graphics g, int x, int y) {
        Color beak = new Color(233, 173, 34);
        Color body = new Color(220, 220, 113);
        Color eye = new Color(0, 0, 0);

        g.setColor(beak);
        g.fillOval(x + 30, y - 10, 25, 13);
        g.fillRect(x - 10, y + 35, 10, 20);

        g.setColor(body);
        g.fillOval(x - 40, y - 5, 65, 40);
        g.fillOval(x + 5, y - 20, 35, 27);

        g.setColor(eye);
        g.fillOval(x + 25, y - 15, 8, 8);

        g.setColor(beak);
        int[] xPoints = {x + 70, x + 70, x + 50};
        int[] yPoints = {y + 75, y + 90, y + 85};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private void racoon(Graphics g, int x, int y) {
        Color gray = new Color(205, 194, 157);
        Color black = new Color(0, 0, 0);
        Color darkGray = new Color(97, 92, 77);

        g.setColor(gray);
        g.fillOval(x - 50, y, 75, 50);
        g.fillOval(x - 75, y - 10, 40, 35);
        g.setColor(darkGray);
        g.fillOval(x - 70, y, 30, 10);

        g.setColor(gray);
        g.fillRect(x - 40, y + 40, 7, 25);
        g.fillRect(x - 30, y + 40, 7, 25);
        g.fillRect(x, y + 40, 7, 25);
        g.fillRect(x + 10, y + 40, 7, 25);

        g.setColor(gray);
        g.fillRect(x + 23, y + 20, 7, 10);
        g.fillRect(x + 37, y + 22, 7, 10);
        g.fillRect(x + 51, y + 28, 7, 10);
        g.setColor(black);
        g.fillRect(x + 30, y + 20, 7, 10);
        g.fillRect(x + 44, y + 24, 7, 10);

        g.fillOval(x - 65, y + 1, 7, 7);
        g.fillOval(x - 55, y + 1, 7, 7);
        g.fillOval(x - 62, y + 10, 10, 6);

        g.setColor(gray);
        int[] leftEarX = {x - 65, x - 60, x - 55};
        int[] leftEarY = {y - 7, y - 17, y - 7};
        int[] rightEarX = {x - 53, x - 48, x - 43};
        int[] rightEarY = {y - 7, y - 17, y - 7};
        g.fillPolygon(leftEarX, leftEarY, 3);
        g.fillPolygon(rightEarX, rightEarY, 3);
    }

    private void cloud(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 200, 100);
    }
}
