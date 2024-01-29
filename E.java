package p;

public class E {

	public static void main(String[] args) {
		 int number = 1234567890;

	        // 입력된 정수의 3번째 자릿수 출력
	        int position = 2;
	        int count = 0;

	        for (int i = 0; i < 10; i++) {
	            int digit = number % 10;
	            number /= 10;

	            count++;

	            if (count == position) {
	                System.out.println("입력된 정수의 " + position + "번째 자릿수는: " + digit);
	                break;
	            }
	        }
	    }
	}
