package Specific.InterSection.Reverse;

import java.util.Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {

		//String str[] = { "Monalika", "Techno", "Tea", "Tribe", "Credits" };
		int str[] = { 12,67,90,45,30 };
		int i=0;
		int j=str.length-1;
		int temp;
		//String temp;
		while(i<j){
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;	
		}
        System.out.println(Arrays.toString(str));
	}
}