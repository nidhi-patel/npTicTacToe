//===================================================
// Name         : Nidhi Patel
// Date         :  02/19/2016
// Description  : This program is a TicTacToe game
//===================================================

//For keyboard input
import java.util.Scanner;

public class TicTacToe
{
   //Two-Dimensional array to store the moves
	char[][] gameBoard = new char[3][3];


	static String playerX,      //playerX stores playerX's name
		   		  playerO;      //playerO stores playerO's name

	boolean playerXTurn = true,     //playerXTurn is true when it is playerX's turn
			  playerOTurn = false;    //playerOTurn is true when it is playerO's turn


    /**
       	Constructor with parameters
       	pX  player X's name
       	pO  player O's name
     */
	public TicTacToe(String pX,String pO)
	{
		playerX = pX;
		playerO = pO;
		gameBoard[0][0] = '1';
		gameBoard[0][1] = '2';
		gameBoard[0][2] = '3';
		gameBoard[1][0] = '4';
		gameBoard[1][1] = '5';
		gameBoard[1][2] = '6';
		gameBoard[2][0] = '7';
		gameBoard[2][1] = '8';
		gameBoard[2][2] = '9';
	}

   //Prints the game board on the screen
	public void displayBoard()
	{
		System.out.println("   " +gameBoard[0][0]+"  " + "|" + "   " +gameBoard[0][1]+"  " +  "|" + "   " +gameBoard[0][2]);
		System.out.println("      " + "|" + "      " + "|" + "      ");
		System.out.println("--------------------");
		System.out.println("   " +gameBoard[1][0]+"  " + "|" + "   " +gameBoard[1][1]+"  " +  "|" + "   " +gameBoard[1][2]);
		System.out.println("      " + "|" + "      " + "|" + "      ");
		System.out.println("--------------------");
		System.out.println("   " +gameBoard[2][0]+"  " + "|" + "   " +gameBoard[2][1]+"  " +  "|" + "   " +gameBoard[2][2]);
		System.out.println("      " + "|" + "      " + "|" + "      ");
	}

	//Reinitialize the array
	public void clearBoard()
	{
		gameBoard[0][0] = '1';
		gameBoard[0][1] = '2';
		gameBoard[0][2] = '3';
		gameBoard[1][0] = '4';
		gameBoard[1][1] = '5';
		gameBoard[1][2] = '6';
		gameBoard[2][0] = '7';
		gameBoard[2][1] = '8';
		gameBoard[2][2] = '9';
	}

	/**
		Add the move
		x   	   location of the move
		player     player(X or O)
	**/
	public void addMove(int x, char player)
	{
		switch(x)
		{
			case 1:
					if(gameBoard[0][0] == 'X' || gameBoard[0][0] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[0][0] = player;
						changeTurn();
						break;
					}
			case 2:
					if(gameBoard[0][1] == 'X' || gameBoard[0][1] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[0][1] = player;
						changeTurn();
						break;
					}
			case 3:
					if(gameBoard[0][2] == 'X' || gameBoard[0][2] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[0][2] = player;
						changeTurn();
						break;
					}
			case 4:
					if(gameBoard[1][0] == 'X' || gameBoard[1][0] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[1][0] = player;
						changeTurn();
						break;
					}
			case 5:
					if(gameBoard[1][1] == 'X' || gameBoard[1][1] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[1][1] = player;
						changeTurn();
						break;
					}
			case 6:
					if(gameBoard[1][2] == 'X' || gameBoard[1][2] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[1][2] = player;
						changeTurn();
						break;
					}
			case 7:
					if(gameBoard[2][0] == 'X' || gameBoard[2][0] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[2][0] = player;
						changeTurn();
						break;
					}
			case 8:
					if(gameBoard[2][1] == 'X' || gameBoard[2][1] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[2][1] = player;
						changeTurn();
						break;
					}
			case 9:
					if(gameBoard[2][2] == 'X' || gameBoard[2][2] == 'O' )
					{
						System.out.println("Please enter a valid choice\n");
						break;
					}
					else
					{
						gameBoard[2][2] = player;
						changeTurn();
						break;
					}
			default:
					System.out.println("Please enter a valid choice\n");
		}
	}

	//Return the char that represents which player's turn it is
	public char playerTurn()
	{
		if(playerXTurn)
		{
			return 'X';
		}
		else
		{
			return 'O';
		}
	}

	//Alternate the players turn
	public void changeTurn()
	{
		if(playerXTurn)
		{
			playerOTurn = true;
			playerXTurn = false;
		}
		else
		{
			playerXTurn = true;
			playerOTurn = false;
		}
	}

	//Display the winner
	//The player who made the last move is the winner
	public void winner()
	{
		if(gameOver()){
		 	if(playerTurn() == 'X'){
				System.out.println(playerO + " is the winner!");
			}
			else
			{
				System.out.println(playerX + " is the winner!");
			}
		}
	}

	/**
		Checks if there is a winner
		If there is a winner, true is returned
		Otherwise false is returned
	**/
	public boolean gameOver()
	{
		if(gameBoard[0][0] == gameBoard[1][0] &&   gameBoard[0][0] == gameBoard[2][0])
		{
			return true;
		}
		else if(gameBoard[0][0] == gameBoard[0][1] &&   gameBoard[0][0] == gameBoard[0][2])
		{
			return true;
		}
		else if(gameBoard[0][0] == gameBoard[1][1] &&   gameBoard[0][0] == gameBoard[2][2])
		{
			return true;
		}
		else if(gameBoard[0][1] == gameBoard[1][1] &&   gameBoard[0][1] == gameBoard[2][1])
		{
			return true;
		}
		else if(gameBoard[1][0] == gameBoard[1][1] &&   gameBoard[1][0] == gameBoard[1][2])
		{
			return true;
		}
		else if (gameBoard[0][2] == gameBoard[1][2] &&   gameBoard[0][2] == gameBoard[2][2])
		{
			return true;
		}
		else if (gameBoard[2][0] == gameBoard[2][1] &&   gameBoard[2][0] == gameBoard[2][2])
		{
			return true;
		}
		else if (gameBoard[2][0] == gameBoard[1][1] &&   gameBoard[2][0] == gameBoard[0][2])
		{
			return true;
		}
		else if(gameBoard[0][0] != '1' && gameBoard[0][1] != '2' &&	gameBoard[0][2] != '3' && gameBoard[1][0] != '4' && gameBoard[1][1] != '5'
			 && gameBoard[1][2] != '6' && gameBoard[2][0] != '7' && gameBoard[2][1] != '8' && gameBoard[2][2] != '9')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	Main method that creates a new TicTacToe object and gets input from the user
	**/
	public static void main (String[]args)
	{
		int xMove,             //Player X's move
			oMove;             //Player O's move
		String playerX,		   //Player X's name
			   playerO;		   //Player O's name

		//Create a Scanner object to recieve input from the user
		Scanner keyboard = new Scanner (System.in);

		//Prompt the player X to enter their name and store the input in playerXName
		System.out.println("Player X Please Enter Your Name: ");
		playerX = keyboard.nextLine();

		//Prompt the player O to enter their name and store the input in playerOName
		System.out.println("\nPlayer O Please Enter Your Name: ");
		playerO = keyboard.nextLine();

		System.out.println("\nLets play Tic-Tac-Toe!\n");

		//Declare and instantiate a TicTacToe object using the player names
		TicTacToe newGame = new TicTacToe(playerX,playerO);

		//Give instructions of how to play this game to the user
		System.out.println("To make a move please enter the number corresponding to that location\n" +
		"For example, if you want to make your move in the center box enter the number 5\n");

		//Diplay the game board
		newGame.displayBoard();
		System.out.println();

		/**
		While loop iterates until the game is not over and until the number of moves is less than or equal
		to 9.(Maximum 9 moves allowed per game)
		**/
		while(!newGame.gameOver())
		{
			//If it is player X's turn prompt player X to enter their move and store the move in the gameBoard array
			if(newGame.playerTurn() == 'X')
			{
				System.out.print(playerX + " make your move: ");
				xMove = keyboard.nextInt();
				newGame.addMove(xMove,'X');
			}
			//If it is player O's turn prompt player O to enter their move and store the move in the gameBoard array
			else
			{
				System.out.print(playerO + " make your move: ");
				oMove = keyboard.nextInt();
				newGame.addMove(oMove,'O');
			}

			//Display the board after every move
			System.out.println();
			newGame.displayBoard();
			System.out.println();


		    if(newGame.gameOver()){
				System.out.println("Game Over!");
				newGame.winner();
			}
		}
      	//Reinitialize the game to the beginning
		newGame.clearBoard();
	}
}

