
/**
 * Ein Objekt der Klasse Maus wird über seine Position (x|y) auf dem Spielfeld definiert!
 * Wird diese Position "erwischt", so meldet die Maus über einen Wahrheitswert, dass sie 
 * getroffen wurde!
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Maus
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x,y;

    /**
     * Konstruktor für Objekte der Klasse Maus
     */
    public Maus(int pX, int pY)
    {
        x = pX;
        y = pY;
    }

    public boolean getroffen(int pxPosHammer, int pyPosHammer)
    {
        if (x==pxPosHammer && y==pyPosHammer)
            return true;
        else
            return false;
    }
}
