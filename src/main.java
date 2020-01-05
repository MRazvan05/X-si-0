import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class main
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("|   | 1 | 2 | 3 |");
        System.out.println("|---|---|---|---|");
        System.out.println("| 1 |   |   |   |");
        System.out.println("|---|---|---|---|");
        System.out.println("| 2 |   |   |   |");
        System.out.println("|---|---|---|---|");
        System.out.println("| 3 |   |   |   |");
        System.out.println("-----------------");
        char[][] x = new char[10][10];
        int i, j;
        for(int a = 0 ; a < 5 ; a++)
        {
                System.out.print("X - Linie : ");
                i = scan.nextInt();
                System.out.print("X - Coloana : ");
                j = scan.nextInt();
                if(x[i][j] == 'X' || x[i][j] == 'O')
                {
                        System.out.println("Aceasta casuta este completata deja, alegeti alta : ");
                        i = scan.nextInt();
                        j = scan.nextInt();
                    if(x[i][j] == 'X' || x[i][j] == 'O')
                    {
                        System.out.println("Joc incheiat !");
                        System.exit(1);
                    }
                    else
                    {
                        x[i][j] = 'X';
                    }
                }
                else
                {
                    x[i][j] = 'X';
                }
            System.out.println("_________________");
            System.out.println("|   | 1 | 2 | 3 |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 1 | "+x[1][1]+" | "+x[1][2]+" | "+x[1][3]+ " |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 2 | "+x[2][1]+" | "+x[2][2]+" | "+x[2][3]+ " |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 3 | "+x[3][1]+" | "+x[3][2]+" | "+x[3][3]+ " |");
            System.out.println("*****************");
            if ((x[1][1] == 'X' && x[1][2] == 'X' && x[1][3] == 'X') || (x[2][1] == 'X' && x[2][2] == 'X' && x[2][3] == 'X') || (x[3][1] == 'X' && x[3][2] == 'X' && x[3][3] == 'X') || (x[1][1] == 'X' && x[2][1] == 'X' && x[3][1] == 'X') || (x[1][2] == 'X' && x[2][2] == 'X' && x[3][2] == 'X') || (x[1][3] == 'X' && x[2][3] == 'X' && x[3][3] == 'X') || (x[1][1] == 'X' && x[2][2] == 'X' && x[3][3] == 'X') || (x[1][3] == 'X' && x[2][2] == 'X' && x[3][1] == 'X'))
            {
                System.out.println("X - castigator");
                System.exit(1);
            }
            if((x[1][1] == 'X' || x[1][1] == 'O') && (x[1][2] == 'X' || x[1][2] == 'O') && (x[1][3] == 'X' || x[1][3] == 'O') && (x[2][1] == 'X' || x[2][1] == 'O') && (x[2][2] == 'X' || x[2][2] == 'O') && (x[2][3] == 'X' || x[2][3] == 'O') && (x[3][1] == 'X' || x[3][1] == 'O') && (x[3][2] == 'X' || x[3][2] == 'O') && (x[3][3] == 'X' || x[3][3] == 'O'))
            {
                System.out.println("Jocul s-a terminat, nu avem castigator.");
                System.exit(1);
            }
                System.out.print("O - Linie : ");
                i = scan.nextInt();
            System.out.println(" O - Coloana : ");
                j = scan.nextInt();
                if(x[i][j] == 'X' || x[i][j] == 'O')
                {
                        System.out.println("Aceasta casuta este completata deja, alegeti alta : ");
                        i = scan.nextInt();
                        j = scan.nextInt();
                    if(x[i][j] == 'X' || x[i][j] == 'O')
                    {
                        System.out.println("Joc incheiat !");
                        System.exit(1);
                    }
                    else
                    {
                        x[i][j] = 'O';
                    }
                }
                else
                {
                    x[i][j] = 'O';
                }
            System.out.println("_________________");
            System.out.println("|   | 1 | 2 | 3 |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 1 | "+x[1][1]+" | "+x[1][2]+" | "+x[1][3]+ " |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 2 | "+x[2][1]+" | "+x[2][2]+" | "+x[2][3]+ " |");
            System.out.println("|---|---|---|---|");
            System.out.println("| 3 | "+x[3][1]+" | "+x[3][2]+" | "+x[3][3]+ " |");
            System.out.println("*****************");
                if((x[1][1] =='O' && x[1][2] == 'O' && x[1][3] == 'O') || (x[2][1] =='O' && x[2][2] == 'O' && x[2][3] == 'O') || (x[3][1] =='O' && x[3][2] == 'O' && x[3][3] == 'O') || (x[1][1] =='O' && x[2][1] == 'O' && x[3][1] == 'O') || (x[1][2] =='O' && x[2][2] == 'O' && x[3][2] == 'O') || (x[1][3] =='O' && x[2][3] == 'O' && x[3][3] == 'O') ||(x[1][1] =='O' && x[2][2] == 'O' && x[3][3] == 'O') || (x[1][3] =='O' && x[2][2] == 'O' && x[3][1] == 'O'))
                {
                    System.out.println("O - castigator");
                    System.exit(1);
                }
        }
    }
}
