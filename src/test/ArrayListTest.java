/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hai
 */
public class ArrayListTest {
	public static void main(String[] args) {
		String[] name = {"Hai", "Manh", "Han"};
		
		String s1,s2,s3;
		s1 = "Hai";
		s2 = "Manh";
		s3 = "Han";
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(name));//tao 1 ArrayList tu 1 mang da co
		System.out.println("size: " + al.size());
		System.out.println("al list: " + al.toString());
		
		//Tao 1 mang cac doi tuong tu 1  ArrayList da co
		String[] arr = new String[al.size()];// truyen vao kich thuoc mang  = size cua ArrayList
		al.toArray(arr);
		for(String str : arr) System.out.print(str + ", ");
		System.out.println("");
		
//		System.out.println("size: " + al.size());//kiem tra so luong phan tu cua al
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		System.out.println("al: " + al.toString());
//		al.add("Ngan");
//		System.out.println("al: " + al.toString());
//		
//		System.out.println("size: " + al.size());
//		al.remove("Hai");
//		System.out.println("al: " + al.toString());
//		al.set(0, "Stark");
//		System.out.println("al: " + al.toString());
//		al.clear();
//		System.out.println("al: " + al.toString());
//		System.out.println("size: "+al.size());
		arr = new String[al.size()];

		

		

	}
}//class ArrayListTest
