package com.logic.pack1;

public class design {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 13; i++)
		{
			for(int j= 1; j <= i; j++)
			{
				if(j<=(14-i))
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    	}

}

/*

Output:
0 
0 0 
0 0 0 
0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 0 
0 0 0 0 0 0 0 
0 0 0 0 0 0     
0 0 0 0 0         
0 0 0 0             
0 0 0                 
0 0                     
0                         

*/
