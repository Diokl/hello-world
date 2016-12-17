package ru.school.samsung;

import java.util.Scanner;

public class Strings2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k =  scan.nextInt();
		k -= 1;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Scanner s = new Scanner(System.in);
		String h = s.nextLine();
		char new_one = h.charAt(0);
		String[] parts = str.split(" ");
		for (int i = 0; i < parts.length; i++){
			char[] a = parts[i].toCharArray(); 
			a[k] = new_one;
			for (int t = 0; t < parts[i].length();  t++){
				System.out.print(a[t]);
			}
			System.out.print(" ");
		}
	}
}
