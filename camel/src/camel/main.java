package camel;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class main {
	
	public static Exception crashCause=null;
	
	public static scrn Screen;
	public static camelPanel cp;
	// integration hell here we go
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		load.images();
		//load.gameData();
		
		//screen opens
		Screen = new scrn();
		cp = new camelPanel();
		cp.setSize(500,500);
		//cp.imgQueue = load.timp;
		//cp.imgLoc = load.timl;
		//cp.imgSize = load.tims;
		//cp.setVisible(true);
		//add images to queue
		boolean t=true;
		
		flowyBoi.gameFlowControl();
		
		Runtime.getRuntime().addShutdownHook(new Thread()
	    {
	      public void run()
	      {
	        System.out.print("shutdown is");
	        if(crashCause==null) {System.out.print("n't");}
	        System.out.println(" caused by exception");
	      }
	    });
		
	}
	
	public static boolean verboseOperations=false;
	public static boolean verboseLoading = true;
	public static boolean variableWindow = false;
	
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
}
