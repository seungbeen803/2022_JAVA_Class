package src.GUI;

import javax.swing.*;
import java.awt.*;

// 최상위 컨테이너인 JFrame을 상속 받아줘야 한다
public class ComponentEx extends JFrame {
    public ComponentEx() {
        // setTitle -> 주소
        setTitle("체크박스 만들기 예제");
        // 창 닫음과 동시에 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 부착할 컨텐트팬 선택 -> 그림 그릴 도화지 선택
        Container c = getContentPane();
        // 배치관리자를 사용 (FlowLayout) -> 들어온 순서대로 화면에 표시
        c.setLayout(new FlowLayout());
        // 그림으로 아이콘 사용
        ImageIcon cherryIcon = new ImageIcon("images/cherry.png");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

//        // CheckBox 설정 -> 중복 선택이 가능하다
//        // 설정은 각자
//        JCheckBox apple = new JCheckBox("사과");
//        // selected 부분은 맨처음 실행했을 때 누구를 먼저 선택하고 있을 것이냐를 정하는 값이다
//        // 초기 선택값 설정 -> selected:true
//        JCheckBox pear = new JCheckBox("배", true);
//        // imageIcon이 일반형태와 선택된 형태 구별
//        JCheckBox cherry = new JCheckBox("체리", cherryIcon);
//        cherry.setBorderPainted(true);
//        // 선택이 되었을 때 바뀔 이미지
//        cherry.setSelectedIcon(selectedCherryIcon);

        // RadioButton 설정 -> 중복 선택이 불가능하다
        // ButtonGroup 객체를 만들어줘야한다
        ButtonGroup g = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과");
        // 초기 선택값 설정 -> selected:true
        JRadioButton pear = new JRadioButton("배", true);
        // imageIcon이 일반형태와 선택된 형태 구별
        JRadioButton cherry = new JRadioButton("체리", cherryIcon);
        cherry.setBorderPainted(true);
        // 선택이 되었을 때 바뀔 이미지
        cherry.setSelectedIcon(selectedCherryIcon);

        // RadioButton을 그룹에 추가 -> 중복선택 불가능
        // 그룹에 추가해주어야 중복선택이 불가능하다
        g.add(apple);
        g.add(pear);
        g.add(cherry);

        // 화면에 추가
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250,150);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ComponentEx();
    }
}
