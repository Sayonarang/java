import java.awt.*; //이런 식으로 미리 써두면 임폴트 할 필요 없음
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener {//구현 변경 리스너를 입력하여 슬라이더를 사용하여 변경할때마다 업데이트

//	몇 가지 전역 개체를 선언 
	JFrame frame; //프레임 호출
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
//	맨 처음에는 이 슬라이더 메모 클래스의 생성자에서 작업하도록 저장
	SliderDemo(){
//	이 슬라이더를 생성자 내에서 호출 인스턴스화 먼저 생성할 프레임 
		frame = new JFrame("Slider Demo"); //텍스트를 슬라이더로 설정 오른쪾
		panel = new JPanel();
		label = new JLabel();
		/*slider = new JSlider(0,100,50);
		 * 첫 번째 설정 값의 최소값 0 
		두 번째 최대 숫자 가정을 100 섭씨 0도에서 100도 사이의 물 온도를 찾을 수 있음 
		세 번째 슬라이더의 시작점 50*/
		slider = new JSlider(0,100,50); //슬라이더에 몇 가지 값을 추가 범위의 스펙트럼을 가질 수 있음 
		
//		슬라이더 점의 이름을 입력한 기본 설정된 크기 방법을 사용
		slider.setPreferredSize(new Dimension(400,200)); //new Dimension 새 차원 너비와 높이
		
//		슬라이더를 패널에 추가하고 나중에 패널을 프레임에 추가 슬라이더로 시작
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// 구현되지 않은 항목을 추가 
		
	} 

}
