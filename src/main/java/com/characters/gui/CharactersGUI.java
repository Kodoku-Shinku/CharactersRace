package com.characters.gui;

import java.awt.EventQueue;

import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.characters.threads.CreateCharacters;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CharactersGUI {

	private static JFrame frame;
	private static final Logger LOG = Logger.getLogger("com.characters.gui.CharactersGUI");
	private String animeTrackfield = "src/main/resources/background/anime_trackfield.png";
	private String animeCrowdStadium = "/background/anime_cheering_crowd.gif";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharactersGUI window = new CharactersGUI();
					CharactersGUI.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CharactersGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		/************* Start Background Stadium ****************/
		
		JLayeredPane backgroundStadium = new JLayeredPane();
		backgroundStadium.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		backgroundStadium.setBorder(null);
		backgroundStadium.setBounds(0, 94, 1264, 164);
		frame.getContentPane().add(backgroundStadium);
		
		JLabel stadiumBlechers = new JLabel("");
		stadiumBlechers.setBounds(0, 0, backgroundStadium.getBounds().width, backgroundStadium.getBounds().height);
		String imgStadium = "src/main/resources/background/anime_stadium_blechers.png";
		ImageIcon stadiumIcon = getResizedImgIcon(imgStadium, stadiumBlechers.getBounds().width, stadiumBlechers.getHeight());
		stadiumBlechers.setIcon(stadiumIcon);
		
		backgroundStadium.add(stadiumBlechers);
		
		JLayeredPane peopleAnimeStadium1 = new JLayeredPane();
		peopleAnimeStadium1.setBounds(0, 0, 250, 94);
		frame.getContentPane().add(peopleAnimeStadium1);
		peopleAnimeStadium1.setLayout(null);
		
		JLabel people1Label = new JLabel("");
		people1Label.setIcon(new ImageIcon(CharactersGUI.class.getResource(animeCrowdStadium)));
		people1Label.setBounds(0, 0, 250, 94);
		peopleAnimeStadium1.add(people1Label);
		
		JLayeredPane peopleAnimeStadium2 = new JLayeredPane();
		peopleAnimeStadium2.setBounds(250, 0, 250, 94);
		frame.getContentPane().add(peopleAnimeStadium2);
		peopleAnimeStadium2.setLayout(null);
		
		JLabel people2Label = new JLabel("");
		people2Label.setIcon(new ImageIcon(CharactersGUI.class.getResource(animeCrowdStadium)));
		people2Label.setBounds(0, 0, 250, 94);
		peopleAnimeStadium2.add(people2Label);
		
		JLayeredPane peopleAnimeStadium3 = new JLayeredPane();
		peopleAnimeStadium3.setBounds(500, 0, 250, 94);
		frame.getContentPane().add(peopleAnimeStadium3);
		peopleAnimeStadium3.setLayout(null);
		
		JLabel people3Label = new JLabel("");
		people3Label.setIcon(new ImageIcon(CharactersGUI.class.getResource(animeCrowdStadium)));
		people3Label.setBounds(0, 0, 250, 94);
		peopleAnimeStadium3.add(people3Label);
		
		JLayeredPane peopleAnimeStadium4 = new JLayeredPane();
		peopleAnimeStadium4.setBounds(750, 0, 250, 94);
		frame.getContentPane().add(peopleAnimeStadium4);
		peopleAnimeStadium4.setLayout(null);
		
		JLabel people4Label = new JLabel("");
		people4Label.setIcon(new ImageIcon(CharactersGUI.class.getResource(animeCrowdStadium)));
		people4Label.setBounds(0, 0, 250, 94);
		peopleAnimeStadium4.add(people4Label);
		
		JLayeredPane peopleAnimeStadium5 = new JLayeredPane();
		peopleAnimeStadium5.setBounds(1000, 0, 264, 94);
		frame.getContentPane().add(peopleAnimeStadium5);
		peopleAnimeStadium5.setLayout(null);
		
		JLabel people5Label = new JLabel("");
		people5Label.setIcon(new ImageIcon(CharactersGUI.class.getResource(animeCrowdStadium)));
		people5Label.setBounds(0, 0, 264, 94);
		peopleAnimeStadium5.add(people5Label);
		
		/************* End Background Stadium ****************/
		
		/************* Start Track 1 *************************/
		JLayeredPane laneTrack1 = new JLayeredPane();
		laneTrack1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		laneTrack1.setBorder(null);
		laneTrack1.setBounds(0, 259, 1264, 128);
		frame.getContentPane().add(laneTrack1);
		
		JLabel track1 = new JLabel("");
		track1.setBounds(0, 0, backgroundStadium.getBounds().width, 128);
		String imgTrack1 = animeTrackfield;
		ImageIcon track1Icon = getResizedImgIcon(imgTrack1, track1.getBounds().width, track1.getHeight());
		track1.setIcon(track1Icon);
		
		laneTrack1.add(track1);
		
		JLabel homuraLabel = new JLabel("");
		laneTrack1.setLayer(homuraLabel, 1);
		homuraLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		homuraLabel.setBounds(0, 0, 128, 128);
		String imgHomura = "src/main/resources/images/homura.gif";
		ImageIcon homuraIcon = new ImageIcon(imgHomura);
		
		laneTrack1.add(homuraLabel);
		
		/************* End Track 1 *************************/
		
		/************* Start Track 2 *************************/
		JLayeredPane laneTrack2 = new JLayeredPane();
		laneTrack2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		laneTrack2.setBorder(null);
		laneTrack2.setBounds(0, 388, 1264, 128);
		frame.getContentPane().add(laneTrack2);
		
		JLabel track2 = new JLabel("");
		track2.setBounds(0, 0, backgroundStadium.getBounds().width, 128);
		String imgTrack2 = animeTrackfield;
		ImageIcon track2Icon = getResizedImgIcon(imgTrack2, track2.getBounds().width, track2.getHeight());
		track2.setIcon(track2Icon);
		
		laneTrack2.add(track2);
		
		JLabel kyokoLabel = new JLabel("");
		laneTrack2.setLayer(kyokoLabel, 1);
		kyokoLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		kyokoLabel.setBounds(0, 0, 128, 128);
		String imgKyoko = "src/main/resources/images/kyoko.gif";
		ImageIcon kyokoIcon = new ImageIcon(imgKyoko);
		
		laneTrack2.add(kyokoLabel);
		
		/************* End Track 2 *************************/
		
		/************* Start Track 3 *************************/
		JLayeredPane laneTrack3 = new JLayeredPane();
		laneTrack3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		laneTrack3.setBorder(null);
		laneTrack3.setBounds(0, 517, 1264, 128);
		frame.getContentPane().add(laneTrack3);
		
		JLabel track3 = new JLabel("");
		track3.setBounds(0, 0, backgroundStadium.getBounds().width, 128);
		String imgTrack3 = animeTrackfield;
		ImageIcon track3Icon = getResizedImgIcon(imgTrack3, track3.getBounds().width, track3.getHeight());
		track3.setIcon(track3Icon);
		
		laneTrack3.add(track3);
		
		JLabel sayakaLabel = new JLabel("");
		laneTrack3.setLayer(sayakaLabel, 1);
		sayakaLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		sayakaLabel.setBounds(0, 0, 128, 128);
		String imgSayaka = "src/main/resources/images/sayaka.gif";
		ImageIcon sayakaIcon = new ImageIcon(imgSayaka);
//		
		
		laneTrack3.add(sayakaLabel);
		
		/************* End Track 3 *************************/
		
		/************* Start Race Button *******************/
		
		JLayeredPane eventPane = new JLayeredPane();
		eventPane.setBorder(null);
		eventPane.setBounds(0, 644, 1264, 35);
		frame.getContentPane().add(eventPane);
		
		JLabel buttonBackground = new JLabel("");
		buttonBackground.setBounds(0, 0, eventPane.getBounds().width, eventPane.getBounds().height);
		String imgBackButton = "src/main/resources/background/grass.png";
		ImageIcon backButtonIcon = getResizedImgIcon(imgBackButton, buttonBackground.getBounds().width, buttonBackground.getHeight());
		buttonBackground.setIcon( backButtonIcon);
		
		eventPane.add(buttonBackground);
		
		JButton startButton = new JButton("Start Race");
		eventPane.setLayer(startButton, 1);
		startButton.setToolTipText("Start Characters threads race");
		startButton.setBounds(572, 6, 120, 23);
		eventPane.add(startButton);
		
		/************* End Start Race Button ****************/
		
		
		/******************* RACE START *********************/
		
		//Creacion de los hilos para usarlos en el gui y mover etiquetas
		Thread homura = new Thread( new CreateCharacters("Homura", homuraLabel));
		Thread kyoko = new Thread( new CreateCharacters("Kyoko",  kyokoLabel));
		Thread sayaka = new Thread( new CreateCharacters("Sayaka",  sayakaLabel));
		
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//al presionar el boton se inicializan los hilos y las imagenes se ponen en posicion
					homura.start();
					kyoko.start();
					sayaka.start();
					homuraLabel.setIcon(homuraIcon);
					kyokoLabel.setIcon(kyokoIcon);
					sayakaLabel.setIcon(sayakaIcon);
				} catch (Exception e2) {
					if(startButton == e.getSource() && CreateCharacters.getPosition() != 3) {
						LOG.info("Current race on progress...");
						infoBox("Current race on progress...", "Race Status");
					}
					else if(startButton == e.getSource() && CreateCharacters.getPosition() == 3)
					{
						LOG.info("Race restarted...");
						Thread homura = new Thread( new CreateCharacters("Homura", homuraLabel));
						Thread kyoko = new Thread( new CreateCharacters("Kyoko",  kyokoLabel));
						Thread sayaka = new Thread( new CreateCharacters("Sayaka",  sayakaLabel));
						homura.start();
						kyoko.start();
						sayaka.start();
						homuraLabel.setIcon(homuraIcon);
						kyokoLabel.setIcon(kyokoIcon);
						sayakaLabel.setIcon(sayakaIcon);
					}
				}
				
			}
		
	});
	}
	
	
	/**
	 * Returns a buffered image with a width and height given
	 * @param image
	 * @param width
	 * @param height
	 * @return the resized buffered image
	 */
	public static BufferedImage resize(BufferedImage image, int width, int height) {
		
	    BufferedImage bufferedImg = new BufferedImage(width, height, Transparency.TRANSLUCENT);
	    Graphics2D g2d = bufferedImg.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bufferedImg;
	}
	
	/**
	 * Returns a image icon
	 * @param imgPath
	 * @param width
	 * @param height
	 * @return the resized image icon
	 */
	public static ImageIcon getResizedImgIcon(String imgPath, int width, int height) {
		ImageIcon imageIcon = new ImageIcon();
		try {
			BufferedImage bufferedImg = ImageIO.read(new File(imgPath));
			BufferedImage resizedImage=resize(bufferedImg, width, height);
			imageIcon = new ImageIcon(resizedImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageIcon;
	}
	
	
	/**
	 * Obtain the JFrame of application
	 * @return jframe
	 */
	public static JFrame getFrame() {
		
		return frame;
	}
	
	public static  int getMainJFrameSize() {
		
		int width = 0;
		try {
			width = getFrame().getBounds().width - 128;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return width;
	}
	
	/**
	 * Shows a message if current race is in progress
	 * @param infoMessage
	 * @param titleBar
	 */
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(getFrame(), infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
	
}

