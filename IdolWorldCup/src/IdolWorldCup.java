

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class IdolWorldCup {
	static JPanel panelNorth;
	static JPanel panelCenter;
	static JLabel labelMessage;
	static JLabel labelVs;
	static JButton buttonLeft;
	static JButton buttonRight;
	static String[] images = {
			"노제.png","로제.png","민니.png",
			"보니.png","모모.png","사쿠라.png",
			"아이유.png","윤아.png","윈터.png",
			"태연.png","이서.png","cmzl.png"
	};
	static int imageIndex = 2;
	
	static ImageIcon changeImage(String filename) {
		ImageIcon icon = new ImageIcon("./"+filename);
		Image originImage = icon.getImage();
		Image changedImage = originImage.getScaledInstance(200,200, Image.SCALE_SMOOTH);
		ImageIcon icon_new = new ImageIcon(changedImage);
		return icon_new;
		
	}

	
	static class MyFrame extends JFrame implements ActionListener {
		public MyFrame(String title) {
			super(title);
			
			this.setSize(450, 250);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelNorth = new JPanel();
			labelMessage = new JLabel("당신의 이상형을 찾아주세요");
			labelMessage.setFont(new Font("Arial",Font.BOLD,20));
			panelNorth.add(labelMessage);
			this.add(panelNorth);
			
			panelCenter = new JPanel();
			labelVs = new JLabel("VS");
			labelVs.setFont( new Font("Arial", Font.BOLD,20));
			buttonLeft = new JButton("LeftButton");
			buttonLeft.setIcon(changeImage("cmzl.png"));
			buttonLeft.setPreferredSize(new Dimension(200,200));
			buttonRight = new JButton("RightButton");
			buttonRight.setIcon(changeImage("노제.png"));
			buttonRight.setPreferredSize(new Dimension(200,200));
			
			buttonLeft.addActionListener(this);
			buttonRight.addActionListener(this);
			panelCenter.add(buttonLeft);
			panelCenter.add(labelVs);
			panelCenter.add(buttonRight);
			this.add(panelCenter);
			
			this.pack();
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if( e.getActionCommand().equals("LeftButton"));
				buttonRight.setIcon(changeImage(images[imageIndex]));
				imageIndex++;
			}else {
				buttonLeft.setIcon(changeImage(images[imageIndex]));
				imageIndex++;
			}
			
		}
	}

	public static void main(String[] args) {
		new MyFrame("Idol World Cup");
	}

}