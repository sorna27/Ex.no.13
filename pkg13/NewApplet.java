/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
/**
 *
 * @author asus
 */

public class NewApplet extends Applet implements MouseMotionListener
{
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
 public void init()
 {
    // TODO start asynchronous download of heavy resources
    addMouseMotionListener(this);  
    setBackground(Color.green); 
 }  
 public void mouseDragged(MouseEvent me)
 {  
 Graphics g=getGraphics();  
 
 g.setColor(Color.black);  
 g.fillOval(me.getX(),me.getY(),30,30); 
 }  
 public void mouseMoved(MouseEvent me)
 {
     
 }
 // TODO overwrite start(), stop() and destroy() methods
}
