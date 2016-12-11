package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x;
		x=scn.nextInt();
		if(x<=120){
			System.out.println(x*2.10);
			System.out.println(x*2.10);
			}
		if(x>120&&x<331){
			System.out.println(x*3.02);
			System.out.println(x*2.68);
	}
		if(x>330&&x<501){
			System.out.println(x*4.39);
			System.out.println(x*3.61);
	}
		if(x>500&&x<701){
			System.out.println(x*4.97);
			System.out.println(x*4.01);
	}
		if(x>=701){
			System.out.println(x*5.63);
			System.out.println(x*4.50);
		}
	}
}