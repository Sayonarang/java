import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//첫 번째 프레임을 생성하는데 사용할것이므로 버튼 추가 액션 리스너 구현
public class MyFrame extends JFrame implements ActionListener {
	
	JLabel label = new JLabel("클릭하세요");
	JButton btn = new JButton("열기");
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setTitle("Demo");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		label.setBounds(50,50,250,150);
		btn.setBounds(300,100,100,50);
		btn.setFocusable(false);
		
		btn.addActionListener(this);
		this.add(label);
		this.add(btn);
		
		
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource()==btn) {
			this.dispose(); //첫 화면 실행했을때 나오는 버튼 누르면 첫화면 창 삭제 
			Second second = new Second();
		}

		
	}

}
