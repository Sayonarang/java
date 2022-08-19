import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 대화 상자 만들기 
		//일반 메시지
//		JOptionPane.showMessageDialog(null, "This is some useless info", "에러 창", JOptionPane.PLAIN_MESSAGE); 
////		정보 메시지
//		JOptionPane.showMessageDialog(null, "Here is more useless info :D", "에러 창", JOptionPane.INFORMATION_MESSAGE); 
////		질문 메시지
//		JOptionPane.showMessageDialog(null, "really?", "에러 창", JOptionPane.QUESTION_MESSAGE); 
////		경고 메시지
//		JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "에러 창", JOptionPane.WARNING_MESSAGE); 
////		오류 메시지
//		JOptionPane.showMessageDialog(null, "This is some useless info", "에러 창", JOptionPane.ERROR_MESSAGE); 

		System.out.println(JOptionPane.showConfirmDialog(null, "무엇을 원하시나요?", "물어보살", JOptionPane.YES_NO_CANCEL_OPTION));
		

	}

}
