
public class Bahngleis {
    Stack Gleis3 = new Stack<Integer>();
    Stack Gleis1 = new Stack<Integer>();
    int  n; //länge
    int c_1; //länge gleis3
    int c_2; //länge gleis1

    public Bahngleis(int pLänge){
    n =pLänge;
    }
    
    
    
    public void Wagongs_einfahren(){
     for(int z=0 ; z<n ; z++)
      {
        int zahl = (int)(Math.random() * 100)+5; 
        Gleis1.push(zahl);
        c_1++;
      }
    }
        
        
        
        
    public void Umschichten(){
     for(int z=0 ; z<n ; z++)
     {
       Gleis3.push(Gleis1.top());
       c_2++;
       Gleis1.pop();
       c_1--;
    }
    }
    
    public void Wagons_ausfahen(){
     System.out.print('\u000C');
     for(int z=0 ; z<=n-1 ; z++)
     {
      System.out.print(Gleis3.top()+"|");
      Gleis3.pop();
      c_2--;
      }
     }
}
    
    
    
    
    
    
