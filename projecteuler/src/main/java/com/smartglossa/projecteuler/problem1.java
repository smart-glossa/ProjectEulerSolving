package com.smartglossa.projecteuler;

public class problem1 {
	public static void main(String[] args){
		int i,sum=0;
	     for(i=1;i<1000;i++){
	    	 if(i%3==0||i%5==0){
	    		 sum=sum+i;
	    	 }
	     }System.out.println(sum);
	}
	}
     
