package elice.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex_0001 {

	public static void main(String[] args) {
		ArrayList<Car> car = new ArrayList<>();
		car.add(new Car("Ford",2015));
		car.add(new Car("BMW",1995));
		car.add(new Car("Honda",1997));
		car.add(new Car("ABC",2015));
		Collections.sort(car, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		
		car.sort((o1,o2) -> {
			return Integer.compare(o1.getYear(), o2.getYear());
		});
		
		car.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
		for (Car car2 : car) {
			System.out.println(car2);
		}

	}

}



/*
*/

//package goodee;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Student implements Comparable<Student> {
//    String name;
//    int kor, eng, math;
//
//    public Student(String name, int kor, int eng, int math) {
//        this.name = name;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//
//    // 총점을 계산하는 메서드
//    int getTotal() {
//        return kor + eng + math;
//    }
//
//    // 평균을 계산하는 메서드
//    double getAverage() {
//        return getTotal() / 3.0;
//    }
//
//    @Override
//    public String toString() { // 출력
//        return String.format("%s:국어(%d),영어(%d),수학(%d),총점(%d),평균(%.2f)",
//                name, kor, eng, math, getTotal(), getAverage());
//    }
//
//    @Override
//    public int compareTo(Student other) {
//        return this.name.compareTo(other.name); // 이름 기준으로 정렬
//    }
//}
//
//public class Main {
//    public static void main(String args[]) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("홍길동", 90, 80, 70));
//        list.add(new Student("김삿갓", 95, 85, 75));
//        list.add(new Student("이몽룡", 80, 95, 95));
//        list.add(new Student("임꺽정", 60, 75, 100));
//        list.sort((o1,o2) -> o1.name.compareTo(o2.name));
// //       Collections.sort(list); // 이름을 기준으로 정렬
//        
//        list.forEach(System.out::println); // 각 학생 정보를 출력
//    }
//}