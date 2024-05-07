import javax.swing.*;
import java.awt.*;

public class TestLayout extends JFrame {
    JPanel[] pnl = new JPanel[20];
    public TestLayout(){
        setLayout(new GridLayout(4,5));
        for(int i = 0 ; i < pnl.length ;i++){
            int r = (int) (Math.random() *255);
            int b = (int) (Math.random() * 255);
            int g =(int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
    }

    public static void main(String[] args) {
        TestLayout t = new TestLayout();
        t.setSize(1920,1080);
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}