import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
//	막대를 줄여 진행률 표시줄로 부름 
	JProgressBar bar = new JProgressBar(0,100);
	
	ProgressBarDemo(){
		
//		초기 값 설정
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
//		진행률 포시줄에 백분율을 추가하고 진행률 표시줄
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red); //막대 선 
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);

		fill();
	}
	public void fill() {
//		bar.setValue(10);
//		0에서 시작하여 카운터 생성 
		int counter =0;
		
		while(counter<=100) {
			
			bar.setValue(counter);
			try {
				Thread.sleep(50); //스피드
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=10;
			
		}
		bar.setString("Done! :");
		
	}
}
