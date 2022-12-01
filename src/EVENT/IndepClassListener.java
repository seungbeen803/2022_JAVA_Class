package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new ActionListener(){ // ActionListener 재정의를 해주면 됨
            // 익명 클래스로 작성
            public void actionPerformed(ActionEvent e) { // ActionEvent -> 이벤트 객체
                // 이벤트 객체는 이벤트 정보를 담고 있다.
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
            }
        }); // 우리가 이번에 배우는거
        c.add(btn);
        setSize(250, 120);
        setVisible(true);
    } // 생성자 -> JFrane 셋팅
    // 내부 클래스로 작성
    private class MyActionListener implements ActionListener { // ActionListener를 구현
    public void actionPerformed(ActionEvent e) { // ActionEvent -> 이벤트 객체
        // 이벤트 객체는 이벤트 정보를 담고 있다.
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else
            b.setText("Action");
        
        // InnerClassListener나 JFrame 멤버 호출가능
        // 클래스 내부로 들어왔기 때문에 내부에 있는 것을 사용할 수 있다.
        setTitle(b.getText());
    }
}
    public static void main(String [] args) {
        new IndepClassListener();
    }
}
// 독립된 클래스로 이벤트 리스너를 작성한다.
//class MyActionListener implements ActionListener { // ActionListener를 구현
//    public void actionPerformed(ActionEvent e) { // ActionEvent -> 이벤트 객체
//        // 이벤트 객체는 이벤트 정보를 담고 있다.
//        JButton b = (JButton)e.getSource();
//        if(b.getText().equals("Action"))
//            b.setText("액션");
//        else
//            b.setText("Action");
//    }
//}
