/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Griffin Kirschke
 */
class DrawingEnvironment extends Environment {
    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/52679.png");
        this.setBackground(Color.WHITE);
    }
    Image logo = null;

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        graphics.drawOval(160, 200, 50, 50);
//        graphics.setColor(Color.red);
//        graphics.drawOval(200, 200, 50, 50);
//        graphics.setColor(Color.blue);
//        graphics.drawOval(120, 200, 50, 50);
//        graphics.setColor(Color.CYAN);
//        graphics.drawOval(140, 220, 50, 50);
//        graphics.setColor(Color.YELLOW);
//        graphics.drawOval(180, 220, 50, 50);

        // Venn Diagram
//        
//        graphics.setColor(new Color(255, 0, 0, 120));
//        graphics.fillOval(140, 220, 100, 100);
//        graphics.setColor(new Color(0, 255, 0, 120));
//        graphics.fillOval(200, 220, 100, 100);
//        graphics.setColor(new Color(0, 0, 255, 120));
//        graphics.fillOval(170, 160, 100, 100);
//        graphics.drawRect(600, 300, 50, 100);
//        graphics.fillRect(500, 300, 75, 140);
        
        // AlienWare Project
        
        graphics.setFont(new Font("Calibri", Font.BOLD, 55));
        graphics.drawString("AlienWare Master Race", 650, 900);
        
        if (logo != null) {
            graphics.drawImage(logo, 430, 250, 1000, 500, this);
            
            graphics.setColor(new Color(255, 0, 0, 120));
            graphics.fillOval(640, 220, 100, 100);
            graphics.setColor(new Color(255, 50, 100, 120));
            graphics.fillOval(400, 1260, 100, 100);
            graphics.setColor(new Color(250, 0, 0, 120));
            graphics.fillOval(640, 500, 100, 100);
            graphics.setColor(new Color(25, 250, 80, 120));
            graphics.fillOval(690, 700, 100, 100);
            graphics.setColor(new Color(0, 250, 0, 120));
            graphics.fillOval(1400, 600, 100, 100);
            graphics.setColor(new Color(20, 0, 255, 120));
            graphics.fillOval(750, 600, 100, 100);
            graphics.setColor(new Color(255,0, 0, 120));
            graphics.fillOval(1300, 360, 100, 100);
            graphics.setColor(new Color(25, 0, 250, 120));
            graphics.fillOval(650, 420, 100, 100);
            graphics.setColor(new Color(5, 180, 0, 120));
            graphics.fillOval(1120, 220, 100, 100);
            graphics.setColor(new Color(90, 0, 180, 120));
            graphics.fillOval(825, 60, 100, 100);
            graphics.setColor(new Color(70, 120, 240, 120));
            graphics.fillOval(575, 900, 100, 100);
            graphics.setColor(new Color(60, 225, 0, 120));
            graphics.fillOval(700, 80, 100, 100);
            graphics.setColor(new Color(150, 0, 255, 120));
            graphics.fillOval(1200, 400, 100, 100);
            graphics.setColor(new Color(255, 0, 0, 120));
            graphics.fillOval(1100, 700, 100, 100);
            graphics.setColor(new Color(80, 0, 255, 120));
            graphics.fillOval(1035, 800, 100, 100);
            graphics.setColor(new Color(255, 0, 0, 120));
            graphics.fillOval(400, 500, 100, 100);
            graphics.setColor(new Color(5, 50, 200, 120));
            graphics.fillOval(800, 700, 100, 100);
            graphics.setColor(new Color(255, 0, 255, 120));
            graphics.fillOval(1000, 900, 100, 100);
            graphics.setColor(new Color(0, 255, 0, 120));
            graphics.fillOval(600, 1100, 100, 100);
            graphics.setColor(new Color(120, 0, 70, 120));
            graphics.fillOval(1000, 500, 100, 100);
            graphics.setColor(new Color(255, 70, 0, 120));
            graphics.fillOval(1400, 430, 100, 100);
            graphics.setColor(new Color(255, 0, 0, 120));
            graphics.fillOval(800, 900, 100, 100);
            graphics.setColor(new Color(5, 190, 90, 120));
            graphics.fillOval(320, 875, 100, 100);
            graphics.setColor(new Color(25, 0, 0, 120));
            graphics.fillOval(400, 500, 100, 100);
        }

    }

}
