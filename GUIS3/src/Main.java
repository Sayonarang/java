import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//frame.setLayout(new GridLayout()); //관리자를 전달 빈칸에 아무것도 안쓰면 가로
		//frame.setLayout(new GridLayout(9,1)); //행과 열을 지정할 수 있음
		frame.setLayout(new GridLayout(3,3,10,0)); //1=행 2=열 3=수평 간격 4=수직 간격 
		
		
		//JButton button1 = new JButton("1"); //새로운 버튼 인스턴스화 할때 버튼에 일부 텍스트 설정가능
		frame.add(new JButton("1")); //텍스트 즉시 설정
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		
		
		frame.setVisible(true);
	}

}
