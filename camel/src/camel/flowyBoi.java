package camel;

public class flowyBoi {
	
	public static int level=-1;
	public static int sublvl=0;
	
	public static boolean sidequest=false;
	
	public double levelcompletion=0.0;
	
	public static void gameFlowControl() {
		switch(level) {
		case 0:
			if(!sidequest) {
				main.cp.imgQueue.add(img.bkg[0][0]);
				main.cp.imgQueue.add(img.cml[0][0]);
				
			}
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}
	
	//l0							TUTORIAL
	//l1								|
	//l1						start in africa  -- -- \\
	//l1								|				|
	//l1								|		side quest (sand dealers)
	//l1								|				|
	//l1					local carnival ride job -- //
	//l1						|						|	
	//l1						|						|	
	//l2				MIDDLE EAST						|
	//l2				|			|					|	
	//l2			walking	 --  delivery jobs	--	--	//								
	//l2				|				|				|			
	//l3				EAST ASIA		\\	--	--	turkish rug sellers					
	//l3				|		|								|			
	//l3			walking	<->	work at local farm	<-->	stow away on export truck	- - - - - - - - - - \\			
	//l3				|																					 |
	//l3				|																					 |
	//l4			------RUSSIA-----																		 |
	//l4			|				|																		 |
	//l4	  keep walking	join the army --	--	--	--> submarine side quest - - - - - - - - -\\	 |							
	//l4			|												|				|				   | 	 |
	//l4			|											start WWIII		game end "sub camel"   |	 |
	//l5		EUROPE (west) - -\\ 					<--	 (goto WWIII table)						   |	 |
	//l5			|		 	 |																	   |	 | 
	//l5			|			 |																// - > EUROPE (east)  (game save point/checkpoint)
	//l5		keep walking	sell potatoes													 |			|
	//l5			|			 |																 |			|
	//l5			\\-	-	-	-|	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	//			|
	//l5						potato promotion														(choose country with RNG)
	//  			  					|						
	//			  						|						
	//l6			UK/BRITAIN			IRELAND						SPAIN							AFRICA (not Europe I know)				ITALY										
	//l6				|					|					  |			|								|								  |
	//l6			get a job			lol more 'tats			bullfight	Siesta						game end "home sweet home"			get a job (food boi)
	//l6				|					|								|								|								  |
	//l6			fly to 'merica		boat with potatoes					game end "lax camel"		prestige-like opportunity			game end "Camellovallo" (Caciocavallo, a cheese) 
	//l6				|							|																							
	//l6			game end "business commute"	game end "(idk ill think later)"										
	//  															
	//	  	ALL GAME ENDS SO FAR ARE POSITIVE ASIDE FROM SIDE QUESTS AND WWIII							
	//		  												
	//		  america minigame???												
	//										
	//														
	//														
	//																	
}
