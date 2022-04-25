package test;

public class SwitchTest {

	public static void main(String[] args) {
		// 조건문 - Switch
		int dice_Number = (int)(Math.random() * 6) +1;
		//System.out.println(dice_Number);
		switch(dice_Number) {
		case 1:
			System.out.println("주사위 값은 1입니다");
			break;
		case 2:
			System.out.println("주사위 값은 2입니다");
			break;
		case 3:
			System.out.println("주사위 값은 3입니다");
			break;
		case 4:
			System.out.println("주사위 값은 4입니다");
			break;
		case 5:
			System.out.println("주사위 값은 5입니다");
			break;
		case 6:
			System.out.println("주사위 값은 6입니다");
			
		
		}
	}

}
