package com.captha.gen;

import java.util.Random;

public class CaptchaGen {

	public static String getName(){
		String s="";
		Random r=new Random();
		for (int i = 0; i < 4; i++) {
			int j=r.nextInt();
			s=s+Math.abs(j);
					
		}
		return s;
	}
}
