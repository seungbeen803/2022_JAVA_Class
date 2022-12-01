package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
    JLabel la =
            new JLabel("<Enter>키로 배경색이 바뀝니다");

    KeyCharEx() {
        super("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);
        c.addKeyListener(new MyKeyListener());
        setSize(250, 150);
        setVisible(true); // 프레임 화면에 표시할 것인지 아닌지
        c.requestFocus(); // 컨텐트팬에 포커스 설정
    }// 생성자

    // 이벤트가 누를 때마다 새로 갱신되면서 반복된다.
    class MyKeyListener extends KeyAdapter { // 어댑터 클래스 사용
        public void keyPressed(KeyEvent e) { // 키를 눌렀을 때 이벤트 실행
            // 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
            int r = (int) (Math.random() * 256); // red 성분
            int g = (int) (Math.random() * 256); // green 성분
            int b = (int) (Math.random() * 256); // blue 성분

            switch(e.getKeyChar()) { // 입력된 키 문자
                case '\n': // <Enter> 키 입력
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);
                    getContentPane().setBackground(new Color(r, g, b)); // 배경색을 바꿔준다
                    break;
                case 'q':
                    System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        new KeyCharEx();
    }
}

