import java.io.FileWriter; 
import java.io.IOException;

//메모장 따로 만들기 
public class Main {

	public static void main(String[] args) {
//		파일 작성기 인스턴스 생성
		try {
			FileWriter writer = new FileWriter("poem.txt");
//			특정 방법을 사용할 것 
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!"); //장미 
			writer.append("\n(A poem by Bro)"); //작성기dot append 사용 일부 텍스트 추가
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

/*

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		파일 작성기 인스턴스 생성
		try {
			FileWriter writer = new FileWriter("poem.txt");
//			특정 방법을 사용할 것 
			writer.write("안녕하세요 \n반가워요 \n처음봐요 \n안녕히 가세요 \n굿' 바이!"); //장미 
			writer.append("\n(형 안녕)"); //작성기dot append 사용 일부 텍스트 추가
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
*/