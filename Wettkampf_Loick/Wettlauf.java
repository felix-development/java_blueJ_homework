import java.util.Random;
/**
 * Simuliert einen Wettlauf mit 8 Teilnehmern. Die ersten beiden erhalten einen Qualifikationsvermerk!
 * 
 * @author Felix Patryjas
 * @version (15.09.2019)
 */
public class Wettlauf
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Laeufer[] laeuferfeld;
    
    private String ersterPlatz;
    private String zweiterPlatz;
    
    private String letzterPlatz;
    private String vorletzterPlatz;
    
    private double durchschnittszeit;
    
    private int läufer;

    /**
     * Konstruktor für Objekte der Klasse Wettlauf
     */
    public Wettlauf(int pAnzahl)
    {
        pAnzahl = läufer;
        laeuferfeld = new Laeufer[8];
    }

    /**
     * Startsimulation: alle Läufer werden instanziiert!
     * 
     */
    public void anDenStart()
    {
        for (int i=0;i<8;i++){
            laeuferfeld[i]=new Laeufer(zufallsString());
        }   
    }
     
    /**
     * Laufsimulation: Alle Läufer laufen!
     * 
     */
    public void rennenLaufen()
    {
        for (int i=0;i<8;i++){
            laeuferfeld[i].laufen();
        }   
    }
         
    /**
     * Zeitmessung: Wertet den Lauf aus
     * 1./2. erhalten Qualifikationsvermerk
     */
    public void zeitMessung()
    {
        Laeufer erster;       
        Laeufer zweiter;
        Laeufer letzter;
        Laeufer vorletzter;
        
        if (laeuferfeld[0].getZeit()<laeuferfeld[1].getZeit()){
            erster = laeuferfeld[0];
            zweiter = laeuferfeld[1];
        }
        else {
            erster = laeuferfeld[1];
            zweiter = laeuferfeld[0];
        }        
        
        for (int i=2;i<8;i++){
            if (laeuferfeld[i].getZeit()<zweiter.getZeit()){
                if (laeuferfeld[i].getZeit()<erster.getZeit()){
                    zweiter = erster;
                    erster = laeuferfeld[i];
                }
                else{
                    zweiter = laeuferfeld[i];
                }
            }
        } 
        
        if (laeuferfeld[0].getZeit()>laeuferfeld[1].getZeit())
        {
            vorletzter = laeuferfeld[0];
            letzter = laeuferfeld[1];
        }
        else
        {
            vorletzter = laeuferfeld[1];
            letzter = laeuferfeld[0];
        }
        
        for (int i=2;i<8;i++){
            if (laeuferfeld[i].getZeit()>vorletzter.getZeit()){
                if (laeuferfeld[i].getZeit()>letzter.getZeit()){
                    letzter = vorletzter;
                    vorletzter = laeuferfeld[i];
                }
                else {
                    letzter = laeuferfeld[i];
                }
            }
        } 
        
        erster.setQualifiziert(true);
        ersterPlatz = erster.getName();
        zweiter.setQualifiziert(true);
        zweiterPlatz = zweiter.getName();
        
        vorletzterPlatz = letzter.getName();
        letzterPlatz = vorletzter.getName();        
    }
       
    private void Durchschnittszeit() // Credits to @lm-development
    {
        double a;
        double b=0;
        
        for (int c=0; c<laeuferfeld.length; c++)
        {
            a = laeuferfeld[c].getZeit();
            b = a + b;
        }
        
        durchschnittszeit = b/laeuferfeld.length;
    }
   
    /**
     * Ausgabe der Ergebnisse
     * 
     */
    public void ausgabe()    
    {
        zeitMessung();
        Durchschnittszeit();
        System.out.print('\u000C');
        for (int i=0;i<8;i++){
            System.out.println(laeuferfeld[i].getName()+" "+laeuferfeld[i].getZeit()+" "+laeuferfeld[i].getQualifiziert());
        }
        System.out.println("Erster Platz:" +ersterPlatz);
        System.out.println("Zweiter Platz:" +zweiterPlatz);
        System.out.println("Vorletzter Platz:" +vorletzterPlatz);
        System.out.println("Letzter Platz:" +letzterPlatz);
        System.out.println("Durchschnittszeit:" +durchschnittszeit);              
    }        
    
    /**
     * Generiert einen Zufallsstring der Länge 8!
     * 
     */
    private String zufallsString()
    {
        String erlaubteZeichen ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        return generiereZufallsString(erlaubteZeichen,random);
            
    }
 
    private String generiereZufallsString(String pErlaubteZeichen, Random pRandom)
    {
        int max = pErlaubteZeichen.length();
        StringBuffer buffer = new StringBuffer(8);
        for (int i=0; i<8; i++) {
            int value = pRandom.nextInt(max);
            buffer.append(pErlaubteZeichen.charAt(value));
        }
        return buffer.toString();
    } 
}
