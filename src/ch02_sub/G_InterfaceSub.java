package ch02_sub;

// implements = extends랑 같은 역할
class InterfaceSub implements G_Message {
	
	int method3(int number) {
		System.out.println("G_Message.GREEETINNG_MESSAGE");
		
		System.out.println("G_Message.GOODBYE_MESSAGE");
		return 3 + number;
	}
	
}

public class G_InterfaceSub implements G_Message, G_Method {

	// 이 클래스 내에서만 사용가능
	public void method1() {
		System.out.println("G_Message.GREEETINNG_MESSAGE");
		
		System.out.println("G_Message.GOODBYE_MESSAGE");
	}
	
	// 이 클래스는 지정을 해뒀기에 다른 곳에서도 사용가능
	public void method2() {
		System.out.println("G_Message.GREEETINNG_MESSAGE");
		
		System.out.println("G_Message.GOODBYE_MESSAGE");
	}

}
