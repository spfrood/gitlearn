/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author scott_r_parker
 * IDE: Terminal
 * date: Aug 12, 2019
 *
 */
public class JavaTruthTable_Ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        boolean x, y;
        //Input values

        //Output the Header row
        System.out.println ( " X  Y   !X  !Y  X&&Y X||Y  X^Y X^Y^Y  X^Y^X  !(X&&Y)   !X||!Y  !(X||Y)  !X&&!Y"
                );

        //Process and Output values for the first row (X=True, Y=True)
        x = true;
        y = true;
        System.out.print ( (x ? " T"  : " F" ) + " " );
        System.out.print ( (y ? " T"  : " F" ) + "  " );
        System.out.print ( (!x ? " T"  : " F" ) + "  " );
        System.out.print ( (!y ? " T"  : " F" ) + "   " );
        System.out.print ( (x && y ? " T"  : " F" ) + "   " );
        System.out.print ( (x || y ? " T"  : " F" ) + "    " );
        System.out.print ( (x ^ y ? " T"  : " F" ) + "   " );
        System.out.print ( (x ^ y ^ y ? " T"  : " F" ) + "     " );
        System.out.print ( (x ^ y ^ x ? " T"  : " F" ) + "      " );
        System.out.print ( (!(x && y) ? " T"  : " F" ) + "       " );
        System.out.print ( (!x || !y ? " T"  : " F" ) + "       " );
        System.out.print ( (!(x || y) ? " T"  : " F" ) + "      " );
        System.out.print ( (!x && !y ? " T"  : " F" ) );
        System.out.println ();

        //Process and Output values for the second row (X=True, Y=False)
        x = true;
        y = false;
        System.out.print ( (x ? " T"  : " F" ) + " " );
        System.out.print ( (y ? " T"  : " F" ) + "  " );
        System.out.print ( (!x ? " T"  : " F" ) + "  " );
        System.out.print ( (!y ? " T"  : " F" ) + "   " );
        System.out.print ( (x && y ? " T"  : " F" ) + "   " );
        System.out.print ( (x || y ? " T"  : " F" ) + "    " );
        System.out.print ( (x ^ y ? " T"  : " F" ) + "   " );
        System.out.print ( (x ^ y ^ y ? " T"  : " F" ) + "     " );
        System.out.print ( (x ^ y ^ x ? " T"  : " F" ) + "      " );
        System.out.print ( (!(x && y) ? " T"  : " F" ) + "       " );
        System.out.print ( (!x || !y ? " T"  : " F" ) + "       " );
        System.out.print ( (!(x || y) ? " T"  : " F" ) + "      " );
        System.out.print ( (!x && !y ? " T"  : " F" ) );
        System.out.println ( );

        //Process and Output values for the third row (X=False, Y=True)
        x = false;
        y = true;
        System.out.print ( (x ? " T"  : " F" ) + " " );
        System.out.print ( (y ? " T"  : " F" ) + "  " );
        System.out.print ( (!x ? " T"  : " F" ) + "  " );
        System.out.print ( (!y ? " T"  : " F" ) + "   " );
        System.out.print ( (x && y ? " T"  : " F" ) + "   " );
        System.out.print ( (x || y ? " T"  : " F" ) + "    " );
        System.out.print ( (x ^ y ? " T"  : " F" ) + "   " );
        System.out.print ( (x ^ y ^ y ? " T"  : " F" ) + "     " );
        System.out.print ( (x ^ y ^ x ? " T"  : " F" ) + "      " );
        System.out.print ( (!(x && y) ? " T"  : " F" ) + "       " );
        System.out.print ( (!x || !y ? " T"  : " F" ) + "       " );
        System.out.print ( (!(x || y) ? " T"  : " F" ) + "      " );
        System.out.print ( (!x && !y ? " T"  : " F" ) );
        System.out.println ( );

        //Process and Output values for the fourth row (X=False, Y=False)
        x = false;
        y = false;
        System.out.print ( (x ? " T"  : " F" ) + " " );
        System.out.print ( (y ? " T"  : " F" ) + "  " );
        System.out.print ( (!x ? " T"  : " F" ) + "  " );
        System.out.print ( (!y ? " T"  : " F" ) + "   " );
        System.out.print ( (x && y ? " T"  : " F" ) + "   " );
        System.out.print ( (x || y ? " T"  : " F" ) + "    " );
        System.out.print ( (x ^ y ? " T"  : " F" ) + "   " );
        System.out.print ( (x ^ y ^ y ? " T"  : " F" ) + "     " );
        System.out.print ( (x ^ y ^ x ? " T"  : " F" ) + "      " );
        System.out.print ( (!(x && y) ? " T"  : " F" ) + "       " );
        System.out.print ( (!x || !y ? " T"  : " F" ) + "       " );
        System.out.print ( (!(x || y) ? " T"  : " F" ) + "      " );
        System.out.print ( (!x && !y ? " T"  : " F" ) );
        System.out.println ( );
        System.out.println ( );
        System.out.println ( );
    }
    
}
