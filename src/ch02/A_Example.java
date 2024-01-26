package ch02;

// GalaxyPhone

// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (tellNumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름: onPower - power 상태를 부정
// 전화걸기: call - power가 true일 때 "(상대전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기 emergency - "112로 전화를 겁니다." 출력
// 휴대전화정보보기 getInfomation - power가 true일 때
//
// ==== (전화번호) ====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
// 출력

class GalaxyPhone {
	static String maker;
	String modelName;
	String owner;
	String tellNumber;
	boolean power;
	
	void onPower() {
		power = !power;
	}
	
	void call(String toTelNumber) {
		if(!power) return;
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	
	static void emergency() {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInfomation() {
		if(!power) return;
			System.out.println("=== " + tellNumber + " ===");
			System.out.println("제조사 : " + maker);
			System.out.println("모델명 : " + modelName);
			System.out.println("소유자 : " + owner);
	}
}


// Drama
// 방송사: (boardcastingCompany - String)
// 제목:	(title - String)
// 배우: (actors - String[])
// 장르: (genre - String)
// 시청률 (viewerRaing - double)
// 부작:	(series - int)

// 정보보기: getInformation
// ==== (title) ====
// 방송사: (boardcastingCompany)
// 장르: (genre)
// 부작: (series)부작
// 시청률: (viewerRating)%
// 배우: (actor), (actor), (actor)...		전지현, 김수현, 박해진, 유인나

class Drama {
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;
	
	void getInformation() {
		System.out.println("==== (title) ====");
		System.out.println("방송사: " + boardcastingCompany);
		System.out.println("제목: " + title);
		System.out.println("장르: " + genre);
		System.out.println("부작: " +  series);
		System.out.println("시청률: " + viewerRating + "%");
		System.out.print("배우: ");
		for(int index = 0; index < actors.length; index++) {
//			System.out.print(actors[index]);
//			if(index < actors.length -1) System.out.print(", ");
			// index < actors.length -1 
			// true - actors[index] + ", " / flase - actors[index]
			String actor = index < actors.length - 1 ? actors[index] + ", " : actors[index];
			System.out.println(actor);
		}
		System.out.println("");
	}
	
}

// TriangleMath
// 빗변 구하기 - getHypotenuse
// 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// cos 구하기 - getCos
// tan 구하기 - getTan

class TriangleMath {                                     
	
	// 상순데 스테틱이 됨 
	// static final double PI = 3.14;
	
	static double getHypotenuse(int bottom, int height) {
		if(bottom <= 0 || height <= 0) return 0;
		// if(!(bottom >=0 && height > 0));
		
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);
		if(bottom <= 0 || height <= 0) return 0;
		return Math.sqrt(result);
	}
	
	static double getCircumference(int height, int bottom, int hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if(height <= 0 || hypotenuse <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if(bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if(bottom <= 0 || height <= 0) return 0;
		return height / bottom;
	}
}

public class A_Example {

	public static void main(String[] args) {
		GalaxyPhone s23 = new GalaxyPhone();
		GalaxyPhone s24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
		// s23.maker = "SAMSUNG";
		s23.modelName = "s23";
		s23.owner = "홍길동";
		s23.tellNumber = "010-1234-5678";
		s23.power = false;
		
		// s24.maker = "SAMSUNG";
		s24.modelName = "s24";
		s24.owner = "김철수";
		s24.tellNumber = "010-5678-1234";
		s24.power = false;
		
		s23.onPower();
		s23.getInfomation();
		
		GalaxyPhone.emergency();
		s23.emergency();
		s24.emergency();
		
		
		Drama drama1 = new Drama();  // new 뒤에 붙은 class랑 이름이 같은 애가 '생성자'라고 함
		
		drama1.boardcastingCompany = "SBS";
		drama1.title = "별에서 온 그대";
		drama1.genre = "로맨스";
		drama1.viewerRating = 13.5;
		drama1.series = 21;
		drama1.actors = new String[] {"전지현, 김수현, 박해진, 유인나"};
		
		drama1.getInformation();

		// drama1.series; # 이건 변수
		// drama1.getInformation(); # 이건 메서드  ## 둘의 차이점 (). 변수는 괄호 필요x 메서드는 괄호 o 
		
		TriangleMath triangleMath = new TriangleMath();
		double bit = triangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		
		// System.out.println(TriangleMath.PI);
		// TriangleMath.PI = 0.0;
	}
}
