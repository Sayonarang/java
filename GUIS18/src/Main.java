import java.awt.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
//		테두리 레이아웃으로 프레임 설정 새 테두리 
		frame.setLayout(new BorderLayout(10,10)); //여백
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.NORTH); //위
		frame.add(panel2,BorderLayout.WEST); //왼쪽
		frame.add(panel3,BorderLayout.EAST); //오른쪽
		frame.add(panel4,BorderLayout.SOUTH); //아래
		frame.add(panel5,BorderLayout.CENTER); //가운데
		
		
	}

}
