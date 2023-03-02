package audio1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;


public class Audio1 {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
      Scanner sc = new Scanner(System.in);
		
	  File file = new File("Till.wav");
      AudioInputStream audiostream =  AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audiostream);	

      String response = "";
         
      while(!response.equals("Q")) {
    	  
    	  System.out.println("P -> Play\nS -> Stop\nR -> Reset\nQ -> Quit ");
    	  System.out.println("Enter your choice : ");
    	  
    	  
          response = sc.next();
          response = response.toUpperCase();
          
          switch(response){
        	  
        	  case("P") :
        		  clip.start();
        	  break;
        	  
        	  case("S") : 
        		  clip.stop();
        	  break;
        	  
        	  case("Q") : 
        		  clip.close();
        	  break;
        	  
        	  case("R") :
        		  clip.setMicrosecondPosition(0);  
        	  break;
        	  
              default : System.out.println("Enter a valid choice");
          }
    	  
      }      
	
	}

}
