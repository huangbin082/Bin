package com.sort;

/** 
* @author Bin
* @version 2018��8��4�� ����9:29:09
* @Description 
*/
public class Bubble {
	
	public int[] bubbleSort(int[] input){
		boolean ifBreak = true;
		int j = input.length-1;
		while(ifBreak){
			ifBreak = false;		
			for(int i = 0;i<j;i++){
				if(input[i]>input[i+1]){
					int a = input[i];
					int b = input[i+1];
					input [i+1] = a;
					input [i] = b;
					ifBreak=true;
				}				
			}
			j--;
		}
		return input;
	}

}
