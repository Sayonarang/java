import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //GUI구현 


public class BlockGame {

	static class MyFrame extends JFrame{
		static int BALL_WIDTH = 20;
		static int BALL_HEIGHT = 20;
		static int BLOCK_ROWS = 5;
		static int BLOCK_COLUMNS = 10;
		static int BLOCK_WIDTH = 40;
		static int BLOCK_HEIGHT = 20;
		static int BLOCK_GAP = 3;
		static int BAR_WIDTH = 80;
		static int BAR_HEIGHT = 20;
		static int CANVAS_WIDTH = 400 + (BLOCK_GAP * BLOCK_COLUMNS)-BLOCK_GAP;//블럭의 갯수 만큼 갭을 주고 마지막 갭을 빼준다
		static int CANVAS_HEIGHT = 600; 
		
		//variable 변수선언 //6. 변수선언 하며 클래스 틀만 만들기 
		static MyPanel myPanel = null; //캔버스를 그릴 패널 객체 생성
		static int score = 0;
		static Timer timer = null;
		static Block[][] blocks = new Block[BLOCK_ROWS][BLOCK_COLUMNS]; 
		static Bar bar = new Bar();
		static Ball ball = new Ball();
		static int barXTarget = bar.x; //Target Value - interpolation 보간 사이채움
		static int dir = 0; //공의 방향 0:Up-Right 1:Down - Right 2:Up - Left 3:Down - Left
		static int ballSpeed = 5; //ball의 속도
		static boolean isGameFinish = false;
		
		static class Ball{//7. ball 클래스 설정
			int x = CANVAS_WIDTH/2 - BALL_WIDTH/2;
			int y = CANVAS_HEIGHT/2 - BALL_HEIGHT/2;
			int width = BALL_WIDTH;
			int height = BALL_HEIGHT;
			
			Point getCenter() {//x y를 가지고 있는 Point 클래스 사용
				return new Point(x + (BALL_WIDTH/2),y+(BALL_HEIGHT/2));
			}
			
			
			
			Point getTopCenter() {
				return new Point(x + (BALL_WIDTH/2),y);
			}
			Point getLeftCenter() {
				return new Point(x, y+(BALL_HEIGHT/2));
			}
			Point getRightCenter() {
				return new Point(x + (BALL_WIDTH),y+(BALL_HEIGHT/2));
			}
			
		}
	
		static class Bar{//8. ball 클래스 설정
			int x = CANVAS_WIDTH/2 - BAR_WIDTH/2;
			int y = CANVAS_HEIGHT - 100;
			int width = BAR_WIDTH;
			int height = BAR_HEIGHT;
		}
		static class Block{//9. ball 클래스 설정
			int x=0;
			int y=0;
			int width = BLOCK_WIDTH;
			int height = BLOCK_HEIGHT;
			int color = 0; //0:white-10점 1:yellow-20점 2:blue-30점 3:magenta-40점 4:red-50점
			boolean isHidden = false; // 충돌 후 블럭 사라지게 하기 위해 설정
		}
		static class MyPanel extends JPanel{
			public MyPanel() {
				this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
				this.setBackground(Color.BLACK);				
		}

		@Override
		public MyFrame(String title) {//10. 생성자 초기화
			super(title);
			this.setVisible(true);
			this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
			this.setLocation(400,300);
			this.setLayout(new BorderLayout());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창이 닫히도록 하기
// 위한 것 
			initData(); //변수를 초기화하는 함수(매소드) // 11. 매소드 선언 동시에 해준다
			
			myPanel = new MyPanel(); //패널 만들어 캔버스 역할 
			this.add("Center", myPanel);
			
			setKeyListener(); //키보드 입력 받는 메소드 
			startTimer();
		}
		public void initDate() {
		}
		public void setKeyListener(){
		}
		public void startTimer() {
		}
		
		public static void main(String [] args) {
			new MyFrame("Block Game"); //2. inner 클래스 생성 타이틀 넣어주기
		}
	}
		
			
		}
		
		
		

		
		
		
		
	}

}
