package ru.school.samsung;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String line = "אבגדהו¸זחטיךכלםמןנסעףפץצקרשתûü‎‏ÿ";
	Integer a = 10;
	for (int i = 0; i < str.length(); i++){
		
		System.out.print((line.indexOf(str.charAt(i)) + 1) + " ");	
		}
	}
}
