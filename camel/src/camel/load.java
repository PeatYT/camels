package camel;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class load {

	public static BufferedImage[][] Nbkg;
	public static BufferedImage[][] Ncml;
	public static BufferedImage[][] Nsprite;

	public static BufferedImage[][] NsideChar;
	public static BufferedImage[][] NsideQuestBkg;
	public static BufferedImage[][] NsideSprite;

	public static ArrayList<BufferedImage> timp = new ArrayList<BufferedImage>();
	public static ArrayList<Point> timl = new ArrayList<Point>();
	public static ArrayList<Dimension> tims = new ArrayList<Dimension>();

	public static void images() {

		ArrayList<Integer> imgIndeces = new ArrayList<Integer>();
		ArrayList<String> fileNames = new ArrayList<String>();

		File myObj = new File("imageres");
		Scanner myReader = null;

		try {
			myReader = new Scanner(myObj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();

			if (main.verboseLoading) {
				System.out.println("line \"" + data + "\"");
				System.out.println("  | - formatted as data: " + data.contains(": "));
				System.out.println("  | - formatted as struct: " + (data.contains("{") || data.contains("}")));
				System.out.println("  | - split at " + data.indexOf(": "));
			}
			if (data.indexOf(": ") != -1) {
				if (main.verboseLoading) {
					System.out.println("  |    | - into " + data.split(": ")[0]);
					System.out.println("  |    | - and  " + data.split(": ")[1]);
				}
				imgIndeces.add(Integer.valueOf(data.split(": ")[0]));
				fileNames.add(data.split(": ")[1]);
			}

			if (data.contains("{")) {
				if (main.verboseLoading) {
					System.out.println("  |    | - length (struct) " + data.split(" ").length);
					System.out.println("  |    | - into (struct)   " + data.split(" ")[0]);
				}
				img.struct = data.split(" ")[0];

				try {
					if (main.verboseLoading) {
						System.out.println("  |    | - and (struct)    " + data.split(" ")[1]);
					}
				} catch (Exception e) {
					if (main.verboseLoading) {
						System.out.println("well, a thing happened");
					}
				}
			}

			if (data.contains("}")) {

				for (int i = 0; i < imgIndeces.size(); i++) {
					if (main.verboseLoading) {
						System.out.println("filename for img " + imgIndeces.get(i) + " is " + fileNames.get(i));
					}
					try {

						timp.add(ImageIO.read(new File(fileNames.get(i))));
					}catch(Exception e) {}
						timl.add(new Point(10 * i, 10 * i));
						tims.add(new Dimension(timp.get(timp.size() - 1).getWidth() / 2,
											   timp.get(timp.size() - 1).getHeight() / 2));
						
						BufferedImage[] temp = new BufferedImage[timp.size()];
						
						for(int j=0;j<timp.size();j++) {
							temp[j]=timp.get(j);
						}
						
						img.setImg(img.struct, temp);
						
						
					//} catch (Exception e) {
					//	if (main.verboseLoading) {
					//		e.printStackTrace();
					//	}
					//}
					if (main.verboseLoading) {
						System.out.println("img loaded");
					}
				}

				img.struct = null;
			}
			if (main.verboseLoading) {
				System.out.println();
			}

		}

		// I hate labels!
		// I agree !!
		
		if(main.verboseOperations) {
			System.out.println();
			
			System.out.println("following images loaded:");
			for(int i=0;i<timp.size();i++) {
				System.out.println(timp.get(i));
			}
			System.out.print(";");
			
		}

	}

	public static void gameData() {
		ArrayList<Integer> dataIndeces = new ArrayList<Integer>();
		ArrayList<String> value = new ArrayList<String>();
		ArrayList<String> comment = new ArrayList<String>();

		File myObj = new File("gameres");
		Scanner myReader = null;

		try {
			myReader = new Scanner(myObj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			if (main.verboseLoading) {
				System.out.println("line \"" + data + "\"");
				System.out.println("  | - formatted as data: " + data.contains(": "));
				System.out.println("  | - formatted as struct: " + (data.contains("{") || data.contains("}")));
				System.out.println("  | - split at " + data.indexOf(": "));
			}
			if (data.indexOf(": ") != -1) {
				if (main.verboseLoading) {
					System.out.println("  |    | - into " + data.split(": ")[0]);
					System.out.println("  |    | - and  " + data.split(": ")[1]);
				}
				String leftover = data.split(": ")[1];

				dataIndeces.add(Integer.valueOf(data.split(": ")[0]));

				if (leftover.contains(" //")) {
					if (main.verboseLoading) {
						System.out.println("  |    | - contains comment");
					}
					value.add(leftover.split(" //")[0]);
					comment.add(leftover.split(" //")[1]);
				} else {
					value.add(leftover);
					comment.add(null);
				}
			} else {
				if (main.verboseLoading) {
					System.out.println("  | - line presumed empty, skipping");
				}
			}
			if (main.verboseLoading) {
				System.out.println();
			}
		}

		for (int i = 0; i < dataIndeces.size(); i++) {
			if (main.verboseLoading) {
				System.out.print("value for data " + dataIndeces.get(i) + " is " + value.get(i));
				if (comment.get(i) != null) {
					System.out.println(" with comment " + comment.get(i));
				} else {
					System.out.println();
				}
			}
		}
	}

}
