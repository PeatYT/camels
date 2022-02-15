package camel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class load {

	public static BufferedImage[][] Nbkg;
	public static BufferedImage[][] Ncml;
	public static BufferedImage[][] Nsprite;

	public static BufferedImage[][] NsideChar;
	public static BufferedImage[][] NsideQuestBkg;
	public static BufferedImage[][] NsideSprite;

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
			System.out.println("line \"" + data + "\"");
			System.out.println("  | - formatted as data: " + data.contains(": "));
			System.out.println("  | - formatted as struct: " + (data.contains("{") || data.contains("}")));
			System.out.println("  | - split at " + data.indexOf(": "));
			if (data.indexOf(": ") != -1) {
				System.out.println("  |    | - into " + data.split(": ")[0]);
				System.out.println("  |    | - and  " + data.split(": ")[1]);

				imgIndeces.add(Integer.valueOf(data.split(": ")[0]));
				fileNames.add(data.split(": ")[1]);

			}
			System.out.println();
		}

		for (int i = 0; i < imgIndeces.size(); i++) {
			System.out.println("filename for img " + imgIndeces.get(i) + " is " + fileNames.get(i));
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
			System.out.println("line \"" + data + "\"");
			System.out.println("  | - formatted as data: " + data.contains(": "));
			System.out.println("  | - formatted as struct: " + (data.contains("{") || data.contains("}")));
			System.out.println("  | - split at " + data.indexOf(": "));
			if (data.indexOf(": ") != -1) {
				System.out.println("  |    | - into " + data.split(": ")[0]);
				System.out.println("  |    | - and  " + data.split(": ")[1]);

				String leftover = data.split(": ")[1];

				dataIndeces.add(Integer.valueOf(data.split(": ")[0]));

				if (leftover.contains(" //")) {
					System.out.println("  |    | - contains comment");

					value.add(leftover.split(" //")[0]);
					comment.add(leftover.split(" //")[1]);
				} else {
					value.add(leftover);
					comment.add(null);
				}
			} else {
				System.out.println("  | - line presumed empty, skipping");
			}

			System.out.println();
		}

		for (int i = 0; i < dataIndeces.size(); i++) {
			System.out.print("value for data " + dataIndeces.get(i) + " is " + value.get(i));
			if (comment.get(i) != null) {
				System.out.println(" with comment " + comment.get(i));
			} else {
				System.out.println();
			}
		}
	}

}
