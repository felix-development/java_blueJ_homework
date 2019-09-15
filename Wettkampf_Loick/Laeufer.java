
/**
 * Jedem Läufer wird eine Zufallszahl zwischen 10 und 20 Sekunden als Laufzeit
 * generiert. Der Qualifikationsstatus steht standardmäßig auf false und wird 
 * nach Auswertung eines Laufes gesetzt!
 * 
 * @author Ansgar Loick 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Laeufer
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private boolean qualifiziert=false;
    private double zeit;

    /**
     * Konstruktor für Objekte der Klasse Laeufer
     */
    public Laeufer(String pName)
    {
        // Instanzvariable initialisieren
        name = pName;
    }
    
    /**
     * Lauf des Läufers
     */
    public void laufen()
    {
        zeit = Math.random()*10+10;
    }
    
    /**
     * get-Methode für Attribut zeit
     * 
     * @return        zeit
     */
    public double getZeit()
    {
        return zeit;
    }
    
    /**
     * get-Methode für Attribut name
     * 
     * @return        name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * set-Methode für Attribut qualifiziert
     * 
     * @param        pQualifiziert
     */
    public void setQualifiziert(boolean pQualifiziert)
    {
        qualifiziert=pQualifiziert;
    }
    
    /**
     * get-Methode für Attribut qualifiziert
     */
    public boolean getQualifiziert()
    {
        return qualifiziert;
    }
}
