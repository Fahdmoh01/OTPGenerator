package com.generate;

import java.util.*;

public class OTPGenerator {
	static char[] generateOTP(int len){
		System.out.println("Generating OTP using random():");
		System.out.print("Your new OTP is: ");
		String numbers="0123456789";
		Random rndm_method= new Random();
		char[] generate= new char[len];
		for(int i=0;i<len;i++) {
			generate[i]= numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		
		return generate;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the OTP to be Generated");
		System.out.println(generateOTP(scan.nextInt()));
		scan.close();
	}
}
