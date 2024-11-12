package elice.edu;

import java.util.Objects;
import java.util.Scanner;

class Student {
	 int studno;
	 String name;
	 String major;
	 public Student(int studno, String name, String major) {
	  this.studno = studno;
	  this.name = name;
	  this.major = major;
	 }
	 @Override
	 public int hashCode() {
		 return Objects.hash(studno, name);
	 }
	 @Override
	 public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
		 }
		 if(obj == null) {
			 return false;
		 }
		 if(getClass() != obj.getClass()) {
			 return false;
		 }
		 Student std = (Student)obj;
		 return studno == std.studno && name.equals(std.name);
	 }
	 public String toString() {
	  return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
	 }
	}
public class Ex_02 {

	public static void main(String[] args) {

		  Student s1 = new Student(100,"홍길동","경영");
		  Student s2 = new Student(100,"홍길동","컴공");
		  System.out.println(s1.hashCode());
		  System.out.println(s2.hashCode());
		  if(s1.equals(s2)) {
		   System.out.println(s1+"과 "+s2+"학생은 같은 학생입니다.");
		  } else {
		   System.out.println(s1+"과 "+s2+"학생은 다른 학생입니다.");
		  }
		
	}

}

//package goodee;
//import java.io.*;
//import elice.EliceUtils;
//import java.util.*;
//class Student {
// int studno;
// String name;
// String major;
// public Student(int studno, String name, String major) {
//  this.studno = studno;
//  this.name = name;
//  this.major = major;
// }
//    @Override
//		public int hashCode() {
//			return Objects.hash(studno, name);
//		}
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//        if(obj == null) {
//            return false;
//        }
//        if(getClass()!=obj.getClass()) {
//            return false;
//        }
//        Student other = (Student) obj;
//        return studno == other.studno && Objects.equals(name, other.name);
//    }
// public String toString() {
//  return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
// }
//}
//public class Main {
// public static void main(String args[]) {
//  Student s1 = new Student(100,"홍길동","경영");
//  Student s2 = new Student(100,"홍길동","컴공");
//  System.out.println(s1.hashCode());
//  System.out.println(s2.hashCode());
//  if(s1.equals(s2)) {
//   System.out.println(s1+"과 "+s2+"학생은 같은 학생입니다.");
//  } else {
//   System.out.println(s1+"과 "+s2+"학생은 다른 학생입니다.");
//  }
// }
//}