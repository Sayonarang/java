
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setTitle("반가워용"); //제목 변경
		frame.setResizable(false); //프레임 크기가 조정되지 않도록 방지
		frame.setSize(420, 420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame.DO_NOTHING_ON_CLOSE를 쓰면 X버튼을 못누른다.
		
	
		
		//이미지 아이콘 변경
		ImageIcon image = new ImageIcon("Cat.png");
		frame.setIconImage(image.getImage()); //아이콘 변경
		//바탕 색 
		frame.getContentPane().setBackground(Color.pink); //색 생성 
		//마음에 드는 색 없으면 Color.pink빼고 (new Color(123,50,250));지정 하면 마음대로 
		
		
		
		
		
		
	}

}
