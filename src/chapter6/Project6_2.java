package chapter6;
import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Project6_2 {

    public static void main(String [] args)
    {
        runGame();
    }
    public static void runGame()
    {
        String winner="";
        boolean xTurn=true;
        int theRow=0;
        int theCol=0;
        String[][] board=new String[3][3];

        initializeGameBoard(board);

        printCurrentBoard(board);

        while(winner.equals(""))
        {
            if(xTurn)
            {
                System.out.print("It is Xturn");
            }
            else
            {
                System.out.print("It is o turn");
            }

            getUserInput(xTurn,board);
            System.out.println();

            printCurrentBoard(board);
            winner=getWinner(board);
            xTurn=!xTurn;

            if(winner.equals("")&& isBoardFull(board))
            {
                winner="c";
            }
        }
        System.out.println();

        if(winner.equals("c"))
        {
            System.out.println("nobody won this match");
        }
        else
        {
            System.out.println("Winner is"+winner);
        }
    }

    public static void initializeGameBoard(String[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                board[i][j]=" ";

            }
        }
    }

    public static void printCurrentBoard(String[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]);
                if(j<2)
                {
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i<2)
            {
                System.out.print("-------");
            }
            System.out.println();
        }
    }
    public static void getUserInput(boolean xTurn,String [][]board)
    { Scanner input= new Scanner(System.in);
        int row=-1;
        int col=-1;
        boolean keepAsking=true;
        while(keepAsking)
        {
            System.out.println("Please enter row and column you want to fill fom 0,1,,2");
            row=input.nextInt();
            col=input.nextInt();
            input.nextLine();

            if(row>=0 && row <=2 && col>=0 && col<=2)
            {
                if(!callAlreadyOccupied(row,col,board))
                {
                    keepAsking=false;
                }
                else
                {
                    System.out.println("that cell is already occupied");
                }

            }
        }

        if(xTurn)
        {
            board[row][col]="x";
        }
        else
        {
            board[row][col]="0";
        }
    }


    public static boolean isBoardFull(String[][] board)
    {   int countFill=0;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(!board[i][j].equals(" "))
                {
                    countFill++;
                }
            }
        }
        return countFill==9;
    }

    public static boolean callAlreadyOccupied(int row,int col,String [][]board)
    {
        return !board[row][col].equals(" ");
    }
    public static String getWinner(String[][] board)
    {
        final int ROWS=board.length;
        final int COLS=board[0].length;

        for(int i=0;i<ROWS;i++)
        {
            if(!board[i][0].equals(" ")&& board[i][0].equals(board[i][1])&&board[i][1].equals(board[i][2]))
            {
                return board[i][0];//check horizantally
            }
        }

        //check column
        for(int i=0;i<COLS;i++)
        {
            if(!board[0][i].equals(" ")&& board[0][i].equals(board[1][i])&&board[1][i].equals(board[2][i]))
            {
                return board[i][0];//check verticallly
            }
        }

        //check from upper  left to right diagonal
        if(!board[0][0].equals(" ")&&board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2]))
        {
            return board[2][0];
        }
        return  "";
    }

}
