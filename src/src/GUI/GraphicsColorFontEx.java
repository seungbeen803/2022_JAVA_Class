package src.GUI;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
    private MyPanel panel = new MyPanel();
    public GraphicsColorFontEx() {
        setTitle("Color, Font 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(350, 470);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawString("I Love Java.~~", 30,30);
            g.setColor(new Color(255, 0, 0)); // rgb값 이용
            // Impact : 글꼴 이름
            // BOLD : 글씨 두껍게
            g.setFont(new Font("굴림체", Font.BOLD, 30));
            g.drawString("굴림체", 30, 60);
            g.setColor(new Color(0x00ff00ff)); // 16진수 이용
            for(int i=1; i<=5; i++) {
                g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
                g.drawString("This much!!", 30, 60+i*60);
            }
        }
    }
    public static void main(String [] args) {
        new GraphicsColorFontEx();
    }
}
