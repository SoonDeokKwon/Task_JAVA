package problem04;

public class CountBoyGirl {
	public static void main(String[] args) {
		
		String[] arr = {"010102-4", "991012-1", "960304-1","881012-2" , "040403-3"};
		
		int boyNum = 0;
		int girlNum = 0;
		
		for(int i=0; i < arr.length; i++) {
			int n = arr[i].charAt(7);
			switch(n) {
			case '1':
				boyNum += 1;
				break;
			case '2':
				girlNum += 1;
				break;
			case '3':
				boyNum += 1;
				break;
			case '4':
				girlNum += 1;
				break;
			}
		}
		
		System.out.println("<<실행결과>>");
		System.out.println("남 " + boyNum + " 여 " + girlNum);
		
	}
}
