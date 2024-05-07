import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.awt.Graphics;

public class Frame extends JFrame {
    public Frame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        JPanel[] pnl = new JPanel[20];
        Graphics2D g1 = (Graphics2D) g;
        Random r = new Random();
        for(int i=0; i<pnl.length;i++){
            int f = r.nextInt(1,4);
            switch (f){
                case 1:
                    Circle circ = new Circle(r.nextInt(10,500),0,0,r.nextInt(0,256),r.nextInt(0,256),r.nextInt(0,256));
                    g1.setColor(new Color(circ.getColorR(),circ.getColorG(),circ.getColorB()));
                    g1.fillOval(r.nextInt(100,1000),r.nextInt(0,1921),circ.getRadius(),circ.getRadius());
                    break;
                case 2:
                    Rectangle rect = new Rectangle(r.nextInt(10,500),r.nextInt(10,500),0,0,r.nextInt(0,256),r.nextInt(0,256),r.nextInt(0,256));
                    g1.setColor(new Color(rect.getColorR(),rect.getColorG(),rect.getColorB()));
                    g1.fillRect(r.nextInt(100,1000),r.nextInt(0,1921),rect.getA(),rect.getB());
                    break;
                case 3:
                    Square sq = new Square(r.nextInt(10,500),0,0,r.nextInt(0,256),r.nextInt(0,256),r.nextInt(0,256));
                    g1.setColor(new Color(sq.getColorR(),sq.getColorG(),sq.getColorB()));
                    g1.fillRect(r.nextInt(100,1000),r.nextInt(0,1921), sq.getA(),sq.getA());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Frame tw = new Frame();
        });
    }
}