public class Laeufer
{
    private String name;
    private double zeit = 10 + (double)(Math.random()*10);
    private boolean qualifiziert;

    public Laeufer(String pName)
    {
        pName=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getZeit()
    {
        return zeit;
    }
    
    public boolean getQualifiziert()
    { 
        if(zeit>19)
        {
            return true;
        }
    return false;   
    }
    
    public void setName(String pName)
    {
        pName = name;
    }
    
    public void setZeit(double pZeit)
    {
        pZeit = zeit;
    }
}