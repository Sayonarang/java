import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		ImageIcon icon = new ImageIcon("good2.png");
		
		
		
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP); //그림이 왼쪽 위에 배치
		//label.setVerticalAlignment(JLabel.BOTTOM); //그림이 왼쪽 아래 배치
		//label.setHorizontalAlignment(JLabel.RIGHT); //위에 어떤 위치에 따라 그림이 오른쪽으로 배치
		//label.setBounds(100, 100, 75, 75); //사진이 좌표에 따라 배치됨 다른 레이아웃 들을 null으로 넣어주면 자유
		
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red); //배경색
		redPanel.setBounds(0, 0, 250, 250); // x.y.넓이.높이 정사각형
		redPanel.setLayout(new BorderLayout()); // 어디에 배치할지 
		//redPanel.setLayout(null); 공백

		

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue); //블루 패널 
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout()); // 어디에 배치할지 
		//bluePanel.setLayout(null); 공백

		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green); //그린 패널 
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout()); // 어디에 배치할지 
		//greenPanel.setLayout(null); 공백

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		greenPanel.add(label); //그린 패널에 사진 넣음
		//bluenPanel.add(label); //블루 패널에 사진 넣음
		//redPanel.add(label); //레드 패널에 사진 넣음
		
		
		frame.add(redPanel); //구성요소 추가 
		frame.add(bluePanel); //구성요소 블루
		frame.add(greenPanel); //구성요소 그린

	}

}
