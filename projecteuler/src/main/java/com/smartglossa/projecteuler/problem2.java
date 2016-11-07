package com.smartglossa.projecteuler;

public class problem2 {
	public static void main(String[] args){
		int i,sum=0,a=0,b=1,c;
		for(i=1;i<33;i++){
			c=a+b;
			
			if(c%2==0){
				sum+=c;
				
			}
			a=b;
			b=c;
			
		}System.out.println(sum);
	}

}
