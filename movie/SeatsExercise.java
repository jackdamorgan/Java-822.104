package movie;

import java.util.Scanner;

public class SeatsExercise {

	public static void main(String[] args) {
		//input and stats.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the number of seats you want");
		int numofseats=scan.nextInt();
		int p = (int) (Math.random() *(90-70)+70);
		int payforchairs=0;
		int[][] seats = new int[4][3];
		boolean ava=true;
		
		//loop for the number of chairs, which make him choosing sits.
		
		for (int i = 0; i < numofseats; i++) {
		System.out.println("Please enter the row and the seat ");
        int r=scan.nextInt();
        int s=scan.nextInt();
        
        /* didnt understand how to set the checking system
         * tried to do it with boolean
         */
         
        
        for (int seat = 0; seat <r; seat++) {
			for (int j = 0; j < seats.length; j++) {
				if (ava==true) {
					payforchairs+=1;
					ava=false;
				}else {
					ava=true;
				}
			}
		}
		
        
		
	}
	

}}
