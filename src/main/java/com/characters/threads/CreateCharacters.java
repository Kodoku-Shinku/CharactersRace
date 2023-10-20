package com.characters.threads;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

import com.characters.gui.CharactersGUI;

public class CreateCharacters implements Runnable{

	private String name;
	private int goal = 0;
	private static int position = 0;
	private JLabel positionLabel;
	private static final Logger LOG = Logger.getLogger("com.characters.threads.CreateCharacters");

	// to stop the thread
    private boolean exit;
	
	Random rand = new Random();
	int randomSpeed = rand.nextInt(20-5+1)+5;//generamos numero aleatorio entre 5 y 20 

	public CreateCharacters(String name, JLabel positionLabel){
		CreateCharacters.position = 0;
		this.name = name;
		this.positionLabel = positionLabel;
		this.exit = false;
	}


	/**
	 * 
	 */
	public void characterRun(){
		positionLabel.setText("");
		if(goal < CharactersGUI.getMainJFrameSize()){
			positionLabel.setLocation(positionLabel.getX()+1, positionLabel.getY());
			goal++;			
		}
		else{
			Thread.currentThread().setName(name);
			position += 1;
			positionLabel.setIcon(null);
			positionLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Set the desired font and size
			positionLabel.setForeground(Color.BLUE); // Set the desired foreground color
			positionLabel.setBounds(0, 0, 420, 110);
			positionLabel.setText(Thread.currentThread().getName()+" has reached the goal in the position: " +position);
			LOG.info("Stopped...");
			setExit(true);
			
		}
	}

	@Override
	public void run(){
		do{
			try{
				Thread.sleep(randomSpeed);
			}catch (InterruptedException ex){
				LOG.log(Level.SEVERE, null, ex);
				Thread.currentThread().interrupt();
			}
			characterRun();
		}while(!exit);
	}

	/**
	 * Stops the current thread
	 * @param exit
	 */
	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
	/**
	 * Verify if current thread has ended is job
	 * @return returns the state of current thread true/false
	 */
	public boolean isExit() {
		return exit;
	}
	
	/**
	 * Obtain the position of label each time position has changed
	 * @return int value of position
	 */
	public static int getPosition()
	{
		return position;
	}

}
