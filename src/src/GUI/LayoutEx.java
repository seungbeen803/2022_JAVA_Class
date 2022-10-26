package src.GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutEx extends JFrame {
    LayoutEx() {
        setTitle("Layout sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

//        // FLowLayout 설정
//        // hGap -> 컴포넌트 끼리 수평 거리(컴포넌트와 컴포넌트 사이의 가로 간격, 수평 거리)
//        // vGap -> 컴포넌트 끼리 수직 거리(컴포넌트와 컴포넌트 사이의 세로 간격, 수직 거리)
//        getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT,30, 40));
//
//        contentPane.add(new JButton("add"));
//        contentPane.add(new JButton("sub"));
//        contentPane.add(new JButton("mul"));
//        contentPane.add(new JButton("div"));
//        contentPane.add(new JButton("Calculate"));

//        // BorderLayout 설정
//        // hGap -> 컴포넌트 끼리 수평 거리(컴포넌트와 컴포넌트 사이의 가로 간격, 수평 거리)
//        // vGap -> 컴포넌트 끼리 수직 거리(컴포넌트와 컴포넌트 사이의 세로 간격, 수직 거리)
//        getContentPane().setLayout(new BorderLayout(30, 20));
//
//        contentPane.add(new JButton("add"), BorderLayout.NORTH);
//        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
//        contentPane.add(new JButton("mul"), BorderLayout.EAST);
//        contentPane.add(new JButton("div"), BorderLayout.WEST);
//        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);

        // GridLayout 설정
        contentPane.setLayout(new GridLayout(3, 3));
        // rows -> 행의 개수
        // cols -> 열의 개수
        for (int i = 1; i < 10; i++) {
            String text = Integer.toString(i); // Wrapper 클래스를 이용하여 i를 문자열로 변환(캐스팅)
            JButton button = new JButton(text);
            contentPane.add(button);
        }

        // Jframe 설정
        setSize(300, 200);
        setVisible(true); // 화면에 프레임 표시
    }// 프레임 설정

    public static void main(String[] args) {
        new LayoutEx(); // 객체 생성
    }
}
