/* PlayRPS.java - plays Rock, Paper, Scissors */ 
 
public class PlayRPS      {     
  public static void main (String[] args)     {           
    
    RPS compPick = new RPS();     // RPS objects, so computer can pick R,P,orS
    RPS comp2Pick = new RPS();
    
    int [] gameOutcomes = new int [100];
    
    int compWin=0, comp2Win=0, tieOutcomes = 0;   // win counts
    
    int i = 0;
	int gameNum = 1;
    
    char computer2Pick;			// the player's pick of R,P,orS           
    char computerPick;			// the computer's pick (from compPick.getValueRPS() )                          
    for (i=0; i<100; i++)		// play 5 rounds of RPS           
    {                              
      comp2Pick.pick();
      compPick.pick();
      
      // have computer pick R,P,orS                
      computerPick = compPick.getValueRPS();
      computer2Pick = comp2Pick.getValueRPS();

	if ( computerPick == computer2Pick )   // tie                
		{                     
			System.out.print ("Tie ");  
			gameOutcomes[i] = 0;
			tieOutcomes ++;	}                
	else if ((computerPick=='R' && computer2Pick=='S') ||    // Rock vs. Scissors - R win                          
         (computerPick=='S' && computer2Pick=='P') ||    // Scissors vs. Paper – S win                          
         (computerPick=='P' && computer2Pick=='R'))     // Paper vs. Rock - P win                
	{                     
		System.out.print ("1st Computer Win ");                     
		compWin++;        // add one to computer win    
		gameOutcomes[i] = 1;	}                
	else  // user win                
	{                     
		System.out.print ("2nd Computer Win ");                     
		comp2Win++;        // add one to player win   
		gameOutcomes[i] = 2;	}
		System.out.print(" -- " + gameOutcomes[i] + " -- game: " + gameNum + "\n ");
		gameNum++;	}
    
    System.out.print ("\n\t 1st Computer Total Wins: " + compWin + "\n");           
    System.out.print ("\n\t 2nd Computer Total Wins: " + comp2Win + "\n"); 
    System.out.print ("\n\t Total Tie's: " + tieOutcomes + "\n");
    
    if ( compWin == comp2Win )	{
    	System.out.println ("Tie game. No Winner");	}
    else if (compWin > comp2Win )	{
    	System.out.println ("\n\t 1st Computer Final Winner!");	}
    else	{
    	System.out.println ("\n\t 2nd Computer Final Winner!");	}
  }// end of main()       
}// end of class