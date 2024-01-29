//package p;
//
////Person 클래스 (상속과 캡슐화)
//class Person {
// private String name;
// private int age;
//
// // 생성자
// public Person(String name, int age) {
//     this.name = name;
//     this.age = age;
// }
//
// // Getter 메서드 (캡슐화)
// public String getName() {
//     return name;
// }
//
// public int getAge() {
//     return age;
// }
//
// // 정보 출력 메서드
// public void printInfo() {
//     System.out.println("이름: " + name + ", 나이: " + age);
// }
//}
//
////Student 클래스 (Person 클래스를 상속하고, 다형성을 적용)
//class Student extends Person {
// private int studentId;
// private double grade;
//
// // 생성자
// public Student(String name, int age, int studentId, double grade) {
//     // 부모 클래스의 생성자 호출
//     super(name, age);
//     this.studentId = studentId;
//     this.grade = grade;
// }
//
// // Getter 메서드 (캡슐화)
// public int getStudentId() {
//     return studentId;
// }
//
// public double getGrade() {
//     return grade;
// }
//
// // 메서드 오버라이딩 (다형성)
// @Override
// public void printInfo() {
//     // 부모 클래스의 메서드 호출
//     super.printInfo();
//     System.out.println("학번: " + studentId + ", 성적: " + grade);
// }
//}
//
////Main 클래스
//public class F {
// public static void main(String[] args) {
//     // Person 객체 생성
//     Person person = new Person("홍길동", 25);
//
//     // Person 객체 정보 출력
//     System.out.println("일반인 정보:");
//     person.printInfo();
//     
//     // Student 객체 생성 (다형성)
//     Person student = new Student("김철수", 20, 20220001, 85.5);
//
//     // Student 객체 정보 출력 (다형성)
//     System.out.println("\n학생 정보:");
//     student.printInfo();
// }
//}
//
//
//
//
//
