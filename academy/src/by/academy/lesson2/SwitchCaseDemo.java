package by.academy.lesson2;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		System.out.println ("Введите тип данных (int, double, float, char, String ) ");
		Scanner inputType1 = new Scanner (System.in);
		String type = inputType1.next ();
		
		System.out.println ("Введите число  ");
		Scanner inputType2 = new Scanner (System.in);
		int i = inputType2.nextInt();


		switch (type){
		case ("int"):
			System.out.println ( i % 2 );
		break;

		case ("double"):
			System.out.println (i * 0.3);
		break;

		case ("float"):
			System.out.println (i * i);
		break;

		case ("char"):
	
		   System.out.println((int) type.charAt(i));
			
		break;
		case ("String"):
			System.out.println ("Hello" + i);

		default:
			System.out.println("Unsupported type");

		}
	}
}
