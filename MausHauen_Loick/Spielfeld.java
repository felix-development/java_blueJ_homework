import java.util.*;
/**
 * Ein Objekt der Klasse Spielfeld ist ein 5x5-Spielbrett, dass auf der Konsole
 * als zweidimensionales Array mit dem Zeichen "O" für "Loch" und "M" für "Maus"
 * dargestellt wird.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielfeld
{
    private char[][] feld=new char[5][5];
    private Maus maus;

    /**
     * Konstruktor für Objekte der Klasse Spielfeld
     */
    public Spielfeld()
    {
        for (int i=0;i<5;i++)
            for (int j=0;j<5;j++){
                feld[i][j]='O';
            }
    }

    public void ausgabe()
    {
        System.out.print('\u000C');
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("| "+feld[i][j]+" ");
                
            }
            System.out.print("|\n");
        }
    }
    
    public void spielfeldLeeren(){
        for (int i=0;i<5;i++)
            for (int j=0;j<5;j++){
                feld[i][j]='O';
            }
    }
    
    public void setzeMaus(){
        Random random = new Random();
        int xPos = 1+random.nextInt(4);
        int yPos = 1+random.nextInt(4);
        
        maus=new Maus(xPos,yPos);
        feld[xPos-1][yPos-1]='M';
    }
        
    public boolean mausHauen(){
        int xPosHammer, yPosHammer;
        Scanner sc=new Scanner(System.in);
        System.out.print("Gib die x-Position der Maus ein: \n");
        xPosHammer = sc.nextInt();
        System.out.print("Gib die y-Position der Maus ein: \n");
        yPosHammer = sc.nextInt();
        return maus.getroffen(xPosHammer,yPosHammer);
    }
    
    public void spielen(){
        boolean spielende = false;
        while (spielende!=true){
            spielfeldLeeren();
            ausgabe();
            setzeMaus();
            ausgabe();
            try {//Kurze Ausführungspause für 500 Millisekunden
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.print("oops");
            }
            spielfeldLeeren();
            ausgabe();
            spielende=mausHauen();
        }
        System.out.print("Maus erwischt!!! \n");
    }
}
