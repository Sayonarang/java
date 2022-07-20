import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	private Image img; //밖에서 쓸 수 있도록 
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
		
	}
	//이미지를 불러옴 //pain 어떤 이미지를 자동으로 비추어짐
	public void paintComponent(Graphics g) { 
		g.drawImage(img, 0, 0, null);
		
	}
}

public class RedText {
	public static void main(String[] args) {
		JFrame frame = new JFrame("RedText 0");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/bird.jpg").getImage());
		frame.add(panel);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		/*public class Lesson8 {
			public static void main(String[] args) {
				JFrame frame = new JFrame("Lesson 08");
				frame.setSize(640, 480);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				
				ImagePanel panel = new ImagePanel(new ImageIcon("./image/bird.jpg").getImage());
				frame.add(panel);
				frame.pack();
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		*/
	}

}






