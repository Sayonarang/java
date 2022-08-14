import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{ //MouseListener마우스 리스너 인터페이스 구현 보도 자료 클릭 입력 및 종료의 같은 흥미로운 마우스 이벤트 수신

	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
	
		label = new JLabel();
		label.setBounds(0, 0, 200, 200); //왼쪽 상단 모서리에 빨간색 사각형
		label.setBackground(Color.red);
//		배경이 실제로 나타나려면 dot set opaque에 레이블
		label.setOpaque(true);
//		구성 요소에 마우스 리스너를 레이블에 적용 다른 마우스 이벤트 응답 가능
		this.addMouseListener(this);
		
		this.add(label); //프레임 추가
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭 간단한 인쇄 라인을 만들어 마우스 클릭  창에 레드 사각형 누르면 출력
		//System.out.println("You clicked the mouse"); //마우스를 클릭했습니다.
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 누름
		System.out.println("You Pressed the mouse"); //마우스를 눌렀습니다. 마우스 왼쪽 오른쪽 힐 버튼도 적용
//		하나를 수행한 후 레이블의 색상을 변경 	
//		마우스를 누른 상태에서 구성 요소를 누른 후 구성 요소 위로 마우스를 누르면 배경이 다른 색으로 설정
		label.setBackground(Color.yellow); //red 사각형을 누르면 yellow 색으로 변함

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스 방출된
		System.out.println("You Released the mouse"); 
		label.setBackground(Color.green); //red 사각형을 누르면 yellow 색으로 또 누르면 green색으로

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스 입력 
		//System.out.println("You entered the mouse"); //클릭한 다음 입력한 구성 요소를 입력하고 종료
		System.out.println("You entered the component"); //구성 요소를 클릭하지 않겠다고 가정
		label.setBackground(Color.blue); //red 사각형을 누르면 yellow 색으로 또 누르면 green색으로 마우스를 놓으면 파란색으로

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 종료
		System.out.println("You exited the component");
//		다른 마우스 이벤트가 있음을 알 수 있도록 입력한 다음 입력을 종료 
		label.setBackground(Color.red); //red 사각형을 누르면 yellow 색으로 또 누르면 green색으로 마우스를 놓으면 파란색으로 끝나면

	}
}
