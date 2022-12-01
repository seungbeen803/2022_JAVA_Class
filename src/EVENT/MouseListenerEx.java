package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("IM"); // "Hello" 출력용 레이블

    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseAdapter());

        c.setLayout(null);
        la.setSize(50, 20); // 레이블의 크기 50x20 설정
        la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
        c.add(la);

        setSize(200, 200);
        setVisible(true);
    } // 생성자 -> JFrame 셋팅

    // inner 클래스로 생성
//    class MyMouseListener implements MouseListener {
//        public void mousePressed(MouseEvent e) {
//            int x = e.getX(); // 마우스의 클릭 좌표 x
//            int y = e.getY(); // 마우스의 클릭 좌표 y
//            la.setLocation(x, y); // (x,y) 위치로 레이블 이동
//        }
//
//        // 모든 추상메서드는 반드시 재정의 해야 한다.
//        // 사용하지 않아도 재정의는 반드시 해줘야한다.
//        public void mouseReleased(MouseEvent e) {}
//        public void mouseClicked(MouseEvent e) {}
//        public void mouseEntered(MouseEvent e) {}
//        public void mouseExited(MouseEvent e) {}
//    }

    // MouseAdapter
    // 어댑터 클래스를 이용한 이벤트 처리
    // 어댑터 클래스를 이용하면 필요한 (추상)메서드만 오버라이딩 하면 됨
    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            int x = e.getX(); // 마우스의 클릭 좌표 x
            int y = e.getY(); // 마우스의 클릭 좌표 y
            la.setLocation(x, y); // (x,y) 위치로 레이블 이동
        }
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }
}

