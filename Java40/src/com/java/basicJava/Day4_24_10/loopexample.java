package com.java.basicJava.Day4_24_10;

/*
*/
class loopexample 
{
	public static void main(String[] args) 
	{
		int nr = Integer.parseInt(args[0]);
		int nc = Integer.parseInt(args[1]);
		
		for(int r =1; r<=nr; r++)
		{
			for(int c= 1; c<=nc; c++) 
			{
				if (r==1 || r==nr || c==1 || c==nc )
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("");
				}

			}
			System.out.println();

		}
	}
}
