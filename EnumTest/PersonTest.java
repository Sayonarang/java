package EnumTest;

public class PersonTest {
	public static void who(Person a) {
		switch(a) {
			case MAN:
				System.out.println("남성");
				break;
			case WOMAN:
				System.out.println("여성");
				break;
		}
	}
	public static void main(String[] args) {
		System.out.println(Person.MAN);
		who(Person.MAN); //who 메소드 
	}

 } 
