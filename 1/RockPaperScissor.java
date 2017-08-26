//Timothy Hinds

import java.util.Scanner;

public class RockPaperScissor 
{
	public static void main(String[] args)
	{
		//variables
		int cpu, user;
		Scanner input = new Scanner(System.in);
		
		//random assignment for cpu
		cpu = (int)(Math.random() * 3);
		//Ask user to pick their choice
		System.out.println("Input 0 for scissor, 1 for rock, and 2 for paper.");
		user = input.nextInt();

		//outcomes when picking scissor
		if(user==0)
		{
			if(cpu==0)
			{
				System.out.println("Both players picked scissors, the game was a tie.");
			} else if(cpu==1) 
			{
				System.out.println("The computer picked rock, and you picked scissor. You lose.");
			} else 
			{
				System.out.println("The computer picked paper, and you picked scissor. You win!");
			}
			
		}
		
		//outcomes when picking rock
		if(user==1)
		{
			if(cpu==0)
			{
				System.out.println("The computer picked scissor, and you picked rock. You win!");
			} else if(cpu==1)
			{
				System.out.println("Both players picked rock, the game was a tie.");
			} else
			{
				System.out.println("The computer picked paper, and you picked rock. You lose.");
			}
			
		}
		
		//outcomes when picking paper
		if(user==2)
		{
			if(cpu==0)
			{
				System.out.println("The computer picked scissors, and you picked paper. You lose");
			} else if(cpu==1)
			{
				System.out.println("The computer picked rock, and you picked paper. You win!");
			} else
			{
				System.out.println("Both players picked paper, the game was a tie.");
			}
		}
	}
}
