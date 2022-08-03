import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);//경계 설정 

		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);//layeredPane가 JFrame에 추가 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
