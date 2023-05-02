package com.Enm;
import java.util.*;
public class TesterEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu[] menuList = Menu.values();
		for(Menu m : menuList)
		{
			System.out.println(m);
		}
		
		System.out.println("\n");
		System.out.println("Select anyone from above: ");
		System.out.println("You selected: " + Menu.valueOf(sc.next().toUpperCase()));
		sc.close();
	}

}