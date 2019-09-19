import java.util.*;

/*
 * Implementation des Spiels "MausHauen" (S.55, Nr.4)
 */

public class Maus
{
    boolean [] [] mausfeld; // Zweidimensionales Array
    
    private int feldX; // Größe des Feldes
    private int feldY;
    
    private int mausX; // Position der Maus
    private int mausY;
    
    private int faenge; // Fänge
    private int versuche; // Versuche 
    
    public Maus (int pX, int pY) // Constructor: Hier wird bei jedem Start die größe des Feldes festgelegt.
    {
        feldX = pX;
        feldY = pY;
        mausfeld = new boolean [feldX] [feldY]; 
    }
    
    public void starten() // Maus bekommt zufällige Position auf dem Feld.
    {
        mausX = (int)(Math.random()*feldX);
        mausY = (int)(Math.random()*feldY);
        mausfeld [mausX][mausY] = true;
    }
    
    public void beenden() // Spiel wird beendet. Die jeweilige Anzahl der Fänge und Versuche wird ausgegeben.
    {
        System.out.print('\u000C');
        System.out.println("Spiel zu Ende!");
        System.out.println("Score: " +faenge);
        System.out.println("Versuche: " +versuche);
    }
    
    public boolean versuchen (int XPos, int YPos) // Hier kann die Position der Maus erraten werden.
    {
        if(XPos < feldX && YPos < feldY)
        {
            versuche++;
            if(mausfeld [XPos] [YPos] == true)
            {
                faenge++;
                return true;
            }
            return false;
        }
        else
        {
            versuche++;
            return false;
        }
    }
}