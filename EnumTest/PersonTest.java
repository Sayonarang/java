package EnumTest;

public class PersonTest {
	public static void who(Person a) {
		switch(a) {
			case MAN:
				System.out.println("����");
				break;
			case WOMAN:
				System.out.println("����");
				break;
		}
	}
	public static void main(String[] args) {
		System.out.println(Person.MAN);
		who(Person.MAN); //who �޼ҵ� 
	}

 } 
