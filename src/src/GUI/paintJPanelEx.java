package src.GUI;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
    private MyPanel panel = new MyPanel();
    public paintJPanelEx() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(250,220);
        setVisible(true);
    } // 생성자를 이용한 JFrame 설정

    class MyPanel extends JPanel {
        // paintComponent는 Graphics를 매개변수로 가진다
        public void paintComponent(Graphics g) {
            // JPanel 호출
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10,10,50,50);
            g.drawRect(50,50,50,50);
            g.setColor(Color.MAGENTA);
            g.drawRect(90,90,50,50);
        }
    }
    public static void main(String [] args) {
        new paintJPanelEx(); // 생성자 호출
    }
}

