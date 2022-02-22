package camel;

public class animation {
	
	public static byte shortTimer;
	public static byte bounce;
	public static double longTimer;
	
	public static void ut() {
		shortTimer++;
		longTimer+=.5;
		if(bounce>0) {bounce=0;}else {bounce=1;}
	}
	
	
	
	
}
