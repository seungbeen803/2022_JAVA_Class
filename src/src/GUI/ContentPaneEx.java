package src.GUI;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    // 생성자 만드는 단축키 : alt + insert
    ContentPaneEx() {
        setTitle("제목 표시줄"); // 프레임 주소 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫응 때 프로그램도 같이 종료

        // 컨텐트팬 알아내기 -> 도화지 선정
        Container contentPane = getContentPane();
        // 컨텐트팬 색 설정 -> 도화지 색 선정
        contentPane.setBackground(Color.orange);
        // 레이아웃 관리자 설정(배치 관리자)
        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // add 메서드를 이용하여 버튼 부착
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        // JFrame 설정
        setSize(300, 150);
        setVisible(true); // 프레임을 표시하겠다.
    }// 프레임 설정 끝

    public static void main(String[] args) {
        // ContentPaneEx 객체 생성
        // main에서 호출한 객체(GUI객체)에서 모든 것을 처리
        new ContentPaneEx();
    }
}
