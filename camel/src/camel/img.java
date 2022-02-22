package camel;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class img {

	// struct main
	public static BufferedImage[][] bkg;
	public static BufferedImage[][] cml = new BufferedImage[6][];
	public static BufferedImage[][] sprite;
	
	// struct side
	public static BufferedImage[][] sideChar;
	public static BufferedImage[][] sideQuestBkg;
	public static BufferedImage[][] sideSprite;

	// struct scrns
	public static BufferedImage[] bkgScrns;

	public static String struct;
	public static int arrayIndex = 0;

	public static void setImg(String imgnm, BufferedImage[] imgList) {

		switch (imgnm) {
		case "camel":
			cml[arrayIndex] = new BufferedImage[imgList.length];
			cml[arrayIndex]=imgList;
			break;
		case "scene":
			bkgScrns= imgList;
			break;
		/*case "":
			break;
		case "":
			break;
		case "":
			break;
		case "":
			break;
		case "":
			break;
		case "":
			break;
		case "":
			break;
		case "":
			break;
		 */
		}

	}

}
