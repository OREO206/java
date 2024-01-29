package p;

//추상 클래스를 이용한 추상화
abstract class Person {
 // 캡슐화된 속성
 private String name;
 private int age;

 // 생성자
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter 메서드 (캡슐화)
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // 추상 메서드 (추상화)
 public abstract void printInfo();

public void printBasicInfo() {
    System.out.println("일반인 정보:");
    System.out.println("이름: " + name + ", 나이: " + age);
}
}


//Person 클래스를 상속받아 구현한 Student 클래스
class Student extends Person {
 // 추가된 속성
 private int studentId;
 private double grade;

 // 생성자
 public Student(String name, int age, int studentId, double grade) {
     // 부모 클래스의 생성자 호출
     super(name, age);
     this.studentId = studentId;
     this.grade = grade;
 }

 // Getter 메서드 (캡슐화)
 public int getStudentId() {
     return studentId;
 }

 public double getGrade() {
     return grade;
 }

 // 메서드 오버라이딩 (다형성)
 @Override
 public void printInfo() {
     // 부모 클래스의 메서드 호출
     super.printBasicInfo();

     // 자식 클래스의 정보 출력
     System.out.println("학번: " + studentId + ", 성적: " + grade);
 }
}

//Main 클래스
public class G {
 public static void main(String[] args) {
     // 추상 클래스를 이용한 다형성
     Person person = new Student("홍길동", 25, 20220001, 85.5);

     // 다형성을 활용한 정보 출력
     person.printInfo();
 }
}