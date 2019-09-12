public class Wettlauf
{
    Laeufer[] laeuferfeld;    
       
    /**
     * Konstruktor für Objekte der Klasse Wettlauf
     */
    public Wettlauf(int pLauf)     
    {
        int anzahl = pLauf+1;
        laeuferfeld = new Laeufer[anzahl];
    }

    public void anDenStart()
    {
        for (int x=0; x<laeuferfeld.length; x++)
        {
            laeuferfeld[x] = new Laeufer("LaeuferX" + x);
        }
    }
    
    public void Lauf() {
        System.out.print('\u000C');
        for (int y=0; y<laeuferfeld.length; y++)
        {           
            System.out.println("Name: "+ laeuferfeld[y].getName());
            System.out.println("Zeit: "+ laeuferfeld[y].getZeit());
            System.out.println("Qualifiziert: "+laeuferfeld[y].getQualifiziert());
        }
    }                        
}
