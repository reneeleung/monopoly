import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import java.awt.Font.*;

public class bankrupt extends JPanel{
  BufferedImage bcg = null;

  // methods
  public void paintComponent(Graphics g){
    Graphics2D graphic = (Graphics2D)g;
    graphic.drawImage(bcg,0,0,null);

  }

  // constructor
  public bankrupt(){
    super();
    try{
      bcg = ImageIO.read(getClass().getResource("images/bankrupt.png"));  


    }
    catch(IOException e){
    }
  }
}
