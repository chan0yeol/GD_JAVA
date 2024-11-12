package elice.edu;

import java.util.*;
import java.io.*;

public class Ex_09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		while(true) {
			int n = scan.nextInt();
			if(n == 999) {
				break;
			}
			list.add(n);
			avg +=n;
		}
		avg = avg/list.size();
		list.sort((o1,o2)-> Integer.compare(o1, o2));
		System.out.println("평균:"+avg);
		System.out.println("중간값:"+list.get(list.size()/2));
	}
}
