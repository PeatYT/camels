package camel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.JPanel;

public class camelPanel extends JPanel implements MouseWheelListener, ActionListener, KeyListener {

	public ArrayList<BufferedImage> imgQueue = new ArrayList<BufferedImage>();
	public ArrayList<Point> imgLoc = new ArrayList<Point>();
	public ArrayList<Dimension> imgSize = new ArrayList<Dimension>();

	public camelPanel() {
	}

	public void paint(Graphics g) {

		for (int i = 1; i < imgQueue.size(); i++) {
			if (i == 0) {
				g.drawImage(imgQueue.get(0), 0, 0, scrn.WIDTH, scrn.HEIGHT, Color.black, null);
			} else {
				g.drawImage(imgQueue.get(i), imgLoc.get(i).x, imgLoc.get(i).y, imgSize.get(i).width,
						imgSize.get(i).height, Color.black, null);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse go brrr");
	}

}
