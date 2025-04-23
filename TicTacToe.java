import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
	
	char[][] board = 
	{
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '},
			
	};

//I needed help starting it so i searched it up, I knew how to do the bottom parts from the notes		
	char currentPlayer = 'X';
	
	Scanner scanner = new Scanner (System.in);
			
	while (true)
	{
	printBoard(board);
	System.out.println("Player" + currentPlayer + "'s turn.");
	
	System.out.println("Enter row (0, 1, 2): ");
   	 int row = scanner.nextInt();
    
    System.out.println("Enter column (0, 1, 2): ");
    int column = scanner.nextInt();
    
    if (board[row][column] == ' ') 
    {
        board[row][column] = currentPlayer;
    } 
    else 
    {
        System.out.println("Try another spot. That one is filled.");
        continue; // Go back to the start of the loop if the spot is taken
    }
    if (checkWinner(board, currentPlayer)) 
    {
        printBoard(board); // Print the final board
        System.out.println("Player " + currentPlayer + " wins!");
        break; // End the game
    }
    
 // Check if it's a tie (board is full and no winner)
    if (isBoardFull(board)) 
    {
        printBoard(board);
        System.out.println("It's a tie!");
        break; // End the game
    }
    
    // Switches players
    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
}

scanner.close();
}
	
public static void printBoard(char[][] board) 
{

	System.out.println("-------------");
    for (int i = 0; i < 3; i++) 
    {
    	System.out.print("| ");
        for (int j = 0; j < 3; j++) 
        {
        	System.out.print(board[i][j] + " | ");
        }
            System.out.println();
            System.out.println("-------------");
        }
    }

public static boolean checkWinner(char[][] board, char player)
{
    // Check rows, columns, and diagonals for a winner
    for (int i = 0; i < 3; i++) 
    {
        // Check rows
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) 
	{
            return true;
        }
        // Check columns
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player) 
	{
            return true;
        }
    }
    
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
    {
        return true;
    }
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) 
    {
        return true;
    }
    
    return false; // No winner
}    

public static boolean isBoardFull(char[][] board) 
{
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false;
            }
        }
    }
    return true;
}

}


