
public class snrntpdy4 {

	public static void main(String[] args) {
		int[]ball=new int[45];
		int temp = 0,j=0;
		
		for(int i=0; i<ball.length;i++)
			ball[i]=i+1;	//i에 0을 넣어서 1이 만들어 지고 for위로 올라감 
		
		for(int i=0; i<100;i++) {   //배열을 100번 섞음 
			j=(int)(Math.random()*45); //0부터 44까지 정수 
			temp=ball[0];   //swap 스왑 1,2 서로 바꿀려면 하나의 숫자가 필요함 3 
			ball[0]=ball[j];
			ball[j]=temp;
			
		}
		for(int i=0; i<6; i++)
			System.out.println(ball[i]+"");
	}

}
