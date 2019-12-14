
public class Containerschiff
{
    private int maxheight; //maximale Turmhöhe in Containern
   
    private int n;  //Anzahl Container insgesamt auf Schiff 
    Stack T1 = new Stack<Container>();
    Stack T2 = new Stack<Container>();
    Stack T3 = new Stack<Container>();
    Stack T4 = new Stack<Container>();
    
    public Containerschiff(int pMaxheight){
    maxheight =pMaxheight;
    LadungAnzeigen();
    
    
    
}

public void Schiffbeladen(int pMenge) {
  for(int i=0; i<pMenge; i++){aufSchiffLaden();}
  
} 

public int getLadungsmenge(){return n;}

private void aufSchiffLaden()
     {
          if(T1.getlength()==maxheight && T2.getlength()==maxheight && T3.getlength()==maxheight && T4.getlength()==maxheight)
        {System.out.println("Schiff bereits voll beladen");
         }
         if(T1.getlength()== maxheight && T2.getlength()==maxheight && T3.getlength()==maxheight && T4.getlength()<maxheight)
        {T4.push(new Container());
            n++;
            
            LadungAnzeigen();
         }
          if(T1.getlength()==maxheight && T2.getlength()== maxheight && T3.getlength()<maxheight)
        {T3.push(new Container());
            n++;
            LadungAnzeigen();
         }
         if(T1.getlength()==maxheight && T2.getlength()<maxheight)
        {T2.push(new Container());
            n++;
            LadungAnzeigen();
         }
        if(T1.getlength()<maxheight)
         {T1.push(new Container());
             n++;
             LadungAnzeigen();
         }
        
    }

public void LadungAnzeigen(){
System.out.print('\u000C');
System.out.println("|"+T1.getlength()+ "|"+T2.getlength()+"|"+T3.getlength()+"|"+T4.getlength()+"|");}
    
public void LadungLöschen(){

for(int i=0; i<maxheight; i++){T1.pop();}
for(int i=0; i<maxheight; i++){T2.pop();}
for(int i=0; i<maxheight; i++){T3.pop();}
for(int i=0; i<maxheight; i++){T4.pop();}
LadungAnzeigen();
}
}
    
