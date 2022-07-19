import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI() {
		JFrame frame = new JFrame(); 
		
		frame.setTitle("한소연 병신장애인");
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}
	

}
