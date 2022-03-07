package com.javaapplication1;

public class javaapplication2 {

	public static void main(String[] args) {
		int i,j=0;
		i=8;
		j=9;
		
		try {
			int k = i/j;
			
			if(k==0)
				throw new AnkitException("  How this is possible");
			System.out.println(k);
		}
		catch(AnkitException e)
		{
			System.out.println("Error" + e.getMessage());
		}

	}

}
