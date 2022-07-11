import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //GUI���� 


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
		static int CANVAS_WIDTH = 400 + (BLOCK_GAP * BLOCK_COLUMNS)-BLOCK_GAP;//���� ���� ��ŭ ���� �ְ� ������ ���� ���ش�
		static int CANVAS_HEIGHT = 600; 
		
		//variable �������� //6. �������� �ϸ� Ŭ���� Ʋ�� ����� 
		static MyPanel myPanel = null; //ĵ������ �׸� �г� ��ü ����
		static int score = 0;
		static Timer timer = null;
		static Block[][] blocks = new Block[BLOCK_ROWS][BLOCK_COLUMNS]; 
		static Bar bar = new Bar();
		static Ball ball = new Ball();
		static int barXTarget = bar.x; //Target Value - interpolation ���� ����ä��
		static int dir = 0; //���� ���� 0:Up-Right 1:Down - Right 2:Up - Left 3:Down - Left
		static int ballSpeed = 5; //ball�� �ӵ�
		static boolean isGameFinish = false;
		
		static class Ball{//7. ball Ŭ���� ����
			int x = CANVAS_WIDTH/2 - BALL_WIDTH/2;
			int y = CANVAS_HEIGHT/2 - BALL_HEIGHT/2;
			int width = BALL_WIDTH;
			int height = BALL_HEIGHT;
			
			Point getCenter() {//x y�� ������ �ִ� Point Ŭ���� ���
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
	
		static class Bar{//8. ball Ŭ���� ����
			int x = CANVAS_WIDTH/2 - BAR_WIDTH/2;
			int y = CANVAS_HEIGHT - 100;
			int width = BAR_WIDTH;
			int height = BAR_HEIGHT;
		}
		static class Block{//9. ball Ŭ���� ����
			int x=0;
			int y=0;
			int width = BLOCK_WIDTH;
			int height = BLOCK_HEIGHT;
			int color = 0; //0:white-10�� 1:yellow-20�� 2:blue-30�� 3:magenta-40�� 4:red-50��
			boolean isHidden = false; // �浹 �� �� ������� �ϱ� ���� ����
		}
		static class MyPanel extends JPanel{
			public MyPanel() {
				this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
				this.setBackground(Color.BLACK);				
		}

		@Override
		public MyFrame(String title) {//10. ������ �ʱ�ȭ
			super(title);
			this.setVisible(true);
			this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
			this.setLocation(400,300);
			this.setLayout(new BorderLayout());
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� �������� �ϱ�
// ���� �� 
			initData(); //������ �ʱ�ȭ�ϴ� �Լ�(�żҵ�) // 11. �żҵ� ���� ���ÿ� ���ش�
			
			myPanel = new MyPanel(); //�г� ����� ĵ���� ���� 
			this.add("Center", myPanel);
			
			setKeyListener(); //Ű���� �Է� �޴� �޼ҵ� 
			startTimer();
		}
		public void initDate() {
		}
		public void setKeyListener(){
		}
		public void startTimer() {
		}
		
		public static void main(String [] args) {
			new MyFrame("Block Game"); //2. inner Ŭ���� ���� Ÿ��Ʋ �־��ֱ�
		}
	}
		
			
		}
		
		
		

		
		
		
		
	}

}
