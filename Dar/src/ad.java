import javax.swing.JButton;
import javax.swing.JFrame;

public class ad {

	public static void main(String[] args) {
		JFrame f1 =new JFrame();
		
		JButton b1 = new JButton("CLICK");
		b1.setBounds(100, 100, 100, 40);
		
		f1.add(b1);
		f1.setSize(300,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}