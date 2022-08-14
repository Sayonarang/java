import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{ //MouseListener마우스 리스너 인터페이스 구현 보도 자료 클릭 입력 및 종료의 같은 흥미로운 마우스 이벤트 수신

	JLabel label;
	ImageIcon smile;
	ImageIcon sad;
	ImageIcon in;
	ImageIcon ghk;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		sad = new ImageIcon("sad.png");
		in = new ImageIcon("in.png");
		ghk = new ImageIcon("ghk.png");
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(sad);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(in);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setIcon(ghk); //변경 누르면 변함

	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(smile);

	}
}