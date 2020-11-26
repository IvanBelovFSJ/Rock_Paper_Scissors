public class RPS 
{      
  private char valueRPS;  
// current value picked (R,P,S)            
//-----------------------------------------------------------------      
//  Constructor: Sets the initial face value of this die.      
//-----------------------------------------------------------------      
  public RPS()      
  {           
    pick(); // randomly pick R,P,S      
  }// end of RPS()            
//-----------------------------------------------------------------      
//  Computes a R,P,S      
//-----------------------------------------------------------------      
  public void pick()      
  {           
    int randVal = (int)(Math.random() * 3)+1; // random: 1,2,3                      
    switch (randVal)           
    {                
      case 1:                     
      valueRPS = 'R';                    
      break; 
      
      case 2:                     
      valueRPS = 'P';                    
      break;   
      
      case 3:                     
      valueRPS = 'S';                    
      break;           
    }      
  }// end of pick()
  
 //-----------------------------------------------------------------      
//  Pick value mutator. The pick value is not modified if the      
//  specified value is not valid.      
//-----------------------------------------------------------------      
  public void setValueRPS(char pickP)      
  {           
    if ( pickP=='R' || pickP=='P' || pickP=='S')  // if valid R,P,S               
      valueRPS = pickP;      
  }// end of setValueRPS()            
//-----------------------------------------------------------------      
//  Pick value accessor.     
  //-----------------------------------------------------------------      
  public char getValueRPS()      
  {           
    return valueRPS;      
  }            
//-----------------------------------------------------------------      
//  Returns a string representation of this die.      
//-----------------------------------------------------------------      
  public String toString()      
  {           
    String ret = "";                      
    switch (valueRPS)          
    {               
      case 'R':                   
      ret = "Rock";                   
      break;               
      case 'P':                   
      ret = "Paper";                
      break;               
      case 'S':               
      ret = "Scissors";                  
      break;           
    }                      
    return (ret);      
  }// end of toString()      
}// end of class 