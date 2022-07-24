import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{ //액션 리스너 인터페이스 구현 

	/*버튼 과 텍스트 필드는 인식X 생성자 내에서 버튼과 텍스트 필드를 선언 해서 
	이것을 생성자 외부에서 선언 해야 함 */
	JButton button;
	JTextField textField;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); //흐름 레이아웃 
		
		button = new JButton("Submit");//텍스트 왼쪽에 버튼 만듦
		button.addActionListener(this);//버튼을 누르기 위해 액션 리스너 추가 
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));//이 텍스트 필드에 몇 가지 치수 설정  선호하는 사이즈 
		textField.setFont(new Font("Consolas",Font.PLAIN,35)); //글꼴 크기 선택 
		//textField.setForeground(Color.red); 이것이 기본 선언 
		textField.setForeground(new Color(0x00FF00)); //글색 녹색 
		textField.setBackground(Color.black);//배경 
		textField.setCaretColor(Color.white);
		textField.setText("Hi"); //미리 텍스트 
		//textField.setEditable(false); //내가 미리 만든 텍스트 변경 X
		
		
		
		this.add(button); //프레임 추가 
		this.add(textField);//실제로 프레임을 포장하기 전에 이것을 추가 
		this.pack(); //추가하는 구성 요소에 맞게 조정되도록 
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 단순히 이것을 전달 해당 이벤트가 버튼인지 확인 
		if(e.getSource()==button) { //우리 버튼과 같으면 우리는 우리가 텍스트 필드 가져옴
			System.out.println("Welcome " + textField.getText()); 
			button.setEnabled(false);
			textField.setEditable(false); //미리 쓴 텍스트 변경X
		}
		
	}

		
			
	}


