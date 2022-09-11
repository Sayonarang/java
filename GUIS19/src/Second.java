import java.awt.*;
import javax.swing.*;

public class Second extends JFrame{

	JLabel label = new JLabel("This is the second frame");
	
	public Second() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,600);
		this.setTitle("Second");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		//배경을 설정하는 콘텐츠 창을 가져온다 getContentPane()
		this.getContentPane().setBackground(Color.blue);
		
		label.setBounds(50,100,300,250);
		label.setForeground(Color.white);
		label.setFont(new Font("Consolas", Font.BOLD, 20));
		
		this.add(label);
	
		
		this.setVisible(true);
		
	}
}
