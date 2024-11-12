package com.exclass.edu;

public class Class_Ex03 {
	 public static class Animal{
		    private String name;
		    private int age;
	        public Animal(String name){
	            this(name,1);
	        }
	        public Animal(int age){
	            this("사람",age);
	        }
	        public Animal(String name, int age){
	        	super();
	            this.name = name;
	            this.age = age;
	        }
	        public void info() {
	            System.out.printf("%s:%d살\n",name,age);
	        }
	    }
	 public static void main(String args[]) {
	  Animal a1 = new Animal("원숭이", 26);
	  Animal a2 = new Animal("사자");
	  Animal a3 = new Animal(100);
	  a1.info();
	  a2.info();
	  a3.info();
	 }
}
