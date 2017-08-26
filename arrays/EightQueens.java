//Timothy Hinds

import java.util.Scanner;

public class EightQueens 
{

	
	 public static void main(String[] args) 
	 {
		 //variable for number of queens and creating the 8 by 8 array for the game board
		 //the elements through index 1-8 are the first row going down
		 //the elements 9-16 are the first row elements
		 //continuing on until the end of the array
		 boolean[] gameBoard = new boolean[8 * 8];
		 int queens = 0;
		 while (queens < 8) 
		 {
			 // Picking a random position on the gameboard to check if its okay to be used
			 int position = randomNumber(0, gameBoard.length - 1);
			 if (check(position, gameBoard))
			 {
				 gameBoard[position] = true;
				 queens++;
			 }
		 }
		 
		  // Printing out the game board to the console with the queens in place of the index
		 
		  for (int i = 0; i < gameBoard.length; i++) 
		  {
			  if (gameBoard[i]) 
			  {
				  System.out.print("|Q");
				  } else {
					  System.out.print("| ");
					  }
			  if ((i+1) % 8 == 0)
				  System.out.println("|");
		  }
	 
	 }
	 
	 
	 
	 
	 
	 //method takes two numbers, and returns a number randomly between them
	 public static int randomNumber(int smaller, int bigger) 
	 {
	  return (int) (smaller + Math.random()
	    * (bigger - smaller + 1));
	 }
	 
	 
	 
	 //This method I used to return the position after checking every position on the gameboard
	 public static boolean check(int pos, boolean[] gameBoard) 
	 {
	 
	  return checkTop(pos, gameBoard) & checkBottom(pos, gameBoard)
	    & checkLeft(pos, gameBoard) & checkRight(pos, gameBoard)
	    & checkTopLeft(pos, gameBoard) & checkTopRight(pos, gameBoard)
	    & checkBottomLeft(pos, gameBoard) & checkBottomRight(pos, gameBoard);
	 }
	 
	 
	 
	 
	 //the following methods checks the respective positions on the game board
	 //the methods will return true if the position is USABLE 
	 //Using multiple methods to check each position inside of the array
	 public static boolean checkTop(int i, boolean[] gameBoard) {
	  // the top of position i is i-8
	  if ((i - 8) > -1) {
	   if (gameBoard[i - 8]) {
	    return false;
	   }
	  }
	 
	  return true;
	 
	 }
	 
	 public static boolean checkBottom(int i, boolean[] gameBoard) {
	  // the bottom of position i is i+8
	  if ((i + 8) < 64) {
	   if (gameBoard[i + 8]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkLeft(int i, boolean[] gameBoard) {
	  // the left of position i is i-1
	  if ((i - 1) > -1) {
	   if (gameBoard[i - 1]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkRight(int i, boolean[] gameBoard) {
	  // the right of position i is i+1
	  if ((i + 1) < 64) {
	   if (gameBoard[i + 1]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkTopLeft(int i, boolean[] gameBoard) {
	  // the top left of position i is i-9
	  if ((i - 9) > -1) {
	   if (gameBoard[i - 9]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkTopRight(int i, boolean[] gameBoard) {
	  // the top left of position i is i-7
	  if ((i - 7) > -1) {
	   if (gameBoard[i - 7]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkBottomLeft(int i, boolean[] gameBoard) {
	  // the bottom left of position i is i+7
	  if ((i + 7) < 64) {
	   if (gameBoard[i + 7]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 public static boolean checkBottomRight(int i, boolean[] gameBoard) {
	  // the top left of position i is i+9
	  if ((i + 9) < 64) {
	   if (gameBoard[i + 9]) {
	    return false;
	   }
	  }
	  return true;
	 }
	 
	 
}
