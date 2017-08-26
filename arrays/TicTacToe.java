import java.util.Scanner;

//Timothy Hinds
//write a program that plays a game of tic tac toe

public class TicTacToe 
{

	public static void main(String[] args) 
	{
		//Scanner, variables, and 2d array
		Scanner input = new Scanner(System.in);
		char[][] board = new char[3][3];
		char player = 'X', status;
		int row, col;
		
		displayBoard(board);
		
		while((status = checkBoard(board)) == 'N')
		{
			System.out.print("Enter a row (0, 1, or 2); for player " + player + " : ");
			row = input.nextInt();
			
			System.out.print("Enter a column (0, 1, or 2); for player " + player + " : ");
			col = input.nextInt();
			
			if(board[col][row] != '\u0000') {
				System.out.println("The row and column is occupied.");
				continue;
			} else {
				board[col][row] = player;
				if(player == 'O') {
					player = 'X';
				} else {
					player = 'O';
				}
			}
			displayBoard(board);
			
		}
		
		
		if(status =='F')
			System.out.println("It's a tie");
		else
			System.out.println("The winner is " + status);
		
		
	}

	private static char checkBoard(char[][] board) 
	{
		char status = 'F';
		 //made variable status which stays at 'F' as long as the game is still going, it stops the game
		//if the board fills up the status stays at F in which the game is a tie and nobody won
		//the status changes to 'N' once a player has won the game
		  // Check if the board is full
		// \u0000 is for when a char is null
		
		  outer: for (int i = 0; i < board.length; i++) {
		   for (int j = 0; j < board[0].length; j++) {
		    if (board[i][j] == '\u0000') {
		     status = 'N';
		     break outer;
		    }
		   }
		 
		  }
		 
		//now will check for winning three in a row
		
		
		  // Checks the first column 
		  if (board[0][0] == board[0][1] && board[0][0] == board[0][2]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  // Checks the second column
		  if (board[1][0] == board[1][1] && board[1][0] == board[1][2]
		    && board[1][0] != '\u0000') {
		   status = board[1][0];
		  }
		 
		  // Checks the third column
		  if (board[2][0] == board[2][1] && board[2][0] == board[2][2]
		    && board[2][0] != '\u0000') {
		   status = board[2][0];
		  }
		 
		  // Checks the first row
		  if (board[0][0] == board[1][0] && board[0][0] == board[2][0]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  // Checks the second row 
		  if (board[0][1] == board[1][1] && board[0][1] == board[2][1]
		    && board[0][1] != '\u0000') {
		   status = board[0][1];
		  }
		 
		  // Checks the third row
		  if (board[0][2] == board[1][2] && board[0][2] == board[2][2]
		    && board[0][2] != '\u0000') {
		   status = board[0][2];
		  }
		 
		  // Checks first diagonal possibility
		  if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
		    && board[0][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  // Checks second diagonal possibility
		  if (board[2][0] == board[1][1] && board[2][0] == board[0][2]
		    && board[2][0] != '\u0000') {
		   status = board[0][0];
		  }
		 
		  return status;
		 
		 }
	

	private static void displayBoard(char[][] board) 
	{
		//loops through each row and column displaying the board
		//goes to next line after each one is filled up
		
		for(int row =0; row<board.length; row++)
		{
			for(int col=0; col<board[1].length;col++)
			{
				System.out.print("|" + board[row][col]);
			}
			System.out.println("|");
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
