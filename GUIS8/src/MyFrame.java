import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JButton button; //외부 
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this); //이것을 전달하고 프레임에 이 버튼을 추가
		
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이 버튼을 클릭하면 이벤트를 시작
		if(e.getSource()==button) { //가 버튼과 동일 하지만 이 작업 수행 메서드는 이 버튼을 인식하지 못하므로 외부에서 만들어야 함
			
			//새 인스턴스 
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("")); //파일 경로 
			//fileChooser.showOpenDialog(null); //열기 select file to open 
			//System.out.println(fileChooser.showOpenDialog(null));
			//int response = fileChooser.showOpenDialog(null); //정수 변수
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
		
	}
}
