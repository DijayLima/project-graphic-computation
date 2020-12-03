
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class coracao {

	 public static void main(String[] args) throws Exception {
		 
	        URL url = new URL("http://i.stack.imgur.com/i8UJD.jpg");
	        final BufferedImage bi = ImageIO.read(url);
//	        BufferedImage bi = ImageIO.read(new File("src/imagens/batimentos.jpeg"));
	        Runnable r = new Runnable() {

	            @Override
	            public void run() {
	                final BufferedImage canvas = new BufferedImage(
	                        bi.getWidth(), bi.getHeight(),
	                        BufferedImage.TYPE_INT_RGB);
	                final JLabel animationLabel = new JLabel(new ImageIcon(canvas));
	                ActionListener animator = new ActionListener() {

	                    int x = 0;

	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        Graphics2D g = canvas.createGraphics();

	                        // paint last part of image in left of canvas
	                        g.drawImage(bi, x, 0, null);
	                        // paint first part of image immediately to the right
	                        g.drawImage(bi, x + bi.getWidth(), 0, null);

	                        // reset x to prevent hitting integer overflow
	                        if (x%bi.getWidth()==0) x = 0;

	                        g.dispose();
	                        animationLabel.repaint();
	                        x--;
	                    }
	                };
	                Timer timer = new Timer(40, animator);
	                timer.start();
	                JOptionPane.showMessageDialog(null, animationLabel);
	                timer.stop();
	            }
	        };
	        // Swing GUIs should be created and updated on the EDT
	        // http://docs.oracle.com/javase/tutorial/uiswing/concurrency
	        SwingUtilities.invokeLater(r);
	    }
}

