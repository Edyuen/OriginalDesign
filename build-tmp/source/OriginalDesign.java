import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int starX = (int)(Math.random()*350)+20;
int starY = (int)(Math.random()*150)+30;
int starX1 = (int)(Math.random()*350)+20;
int starY1 = (int)(Math.random()*150)+30;
int starX2 = (int)(Math.random()*350)+20;
int starY2 = (int)(Math.random()*150)+30;
int starX3 = (int)(Math.random()*350)+20;
int starY3 = (int)(Math.random()*150)+30;
int starX4 = (int)(Math.random()*350)+20;
int starY4 = (int)(Math.random()*150)+30;
int starX5 = (int)(Math.random()*350)+20;
int starY5 = (int)(Math.random()*150)+30;
int starX6 = (int)(Math.random()*350)+20;
int starY6 = (int)(Math.random()*150)+30;
int starX7 = (int)(Math.random()*350)+20;
int starY7 = (int)(Math.random()*150)+30;
int starX8 = (int)(Math.random()*350)+20;
int starY8 = (int)(Math.random()*150)+30;
int starX9 = (int)(Math.random()*350)+20;
int starY9 = (int)(Math.random()*150)+30;
int starXa = (int)(Math.random()*350)+20;
int starYa = (int)(Math.random()*150)+30;
int starXb = (int)(Math.random()*350)+20;
int starYb = (int)(Math.random()*150)+30;
int starXc = (int)(Math.random()*350)+20;
int starYc = (int)(Math.random()*150)+30;
int starXd = (int)(Math.random()*350)+20;
int starYd = (int)(Math.random()*150)+30;
int starXe = (int)(Math.random()*350)+20;
int starYe = (int)(Math.random()*150)+30;
int starXf = (int)(Math.random()*350)+20;
int starYf = (int)(Math.random()*150)+30;
int starXg = (int)(Math.random()*350)+20;
int starYg = (int)(Math.random()*150)+30;
int starXh = (int)(Math.random()*350)+20;
int starYh = (int)(Math.random()*150)+30;
int starXi = (int)(Math.random()*350)+20;
int starYi = (int)(Math.random()*150)+30;
int starXj = (int)(Math.random()*350)+20;
int starYj = (int)(Math.random()*150)+30;
int starXk = (int)(Math.random()*350)+20;
int starYk = (int)(Math.random()*150)+30;
int starXl = (int)(Math.random()*350)+20;
int starYl = (int)(Math.random()*150)+30;
int starXm = (int)(Math.random()*350)+20;
int starYm = (int)(Math.random()*150)+30;
int starXn = (int)(Math.random()*350)+20;
int starYn = (int)(Math.random()*150)+30;
int starXo = (int)(Math.random()*350)+20;
int starYo = (int)(Math.random()*150)+30;
int starXp = (int)(Math.random()*350)+20;
int starYp = (int)(Math.random()*150)+30;
int starXq = (int)(Math.random()*350)+20;
int starYq = (int)(Math.random()*150)+30;
int starXr = (int)(Math.random()*350)+20;
int starYr = (int)(Math.random()*150)+30;
int starXs = (int)(Math.random()*350)+20;
int starYs = (int)(Math.random()*150)+30;
int starXt = (int)(Math.random()*350)+20;
int starYt = (int)(Math.random()*150)+30;
int starXu = (int)(Math.random()*350)+20;
int starYu = (int)(Math.random()*150)+30;
int starXv = (int)(Math.random()*350)+20;
int starYv = (int)(Math.random()*150)+30;
int starXw = (int)(Math.random()*350)+20;
int starYw = (int)(Math.random()*150)+30;
int starXx = (int)(Math.random()*350)+20;
int starYx = (int)(Math.random()*150)+30;
int starXy = (int)(Math.random()*350)+20;
int starYy = (int)(Math.random()*150)+30;
int starXz = (int)(Math.random()*350)+20;
int starYz = (int)(Math.random()*150)+30;
int starXA = (int)(Math.random()*350)+20;
int starYA = (int)(Math.random()*150)+30;
int starXB = (int)(Math.random()*350)+20;
int starYB = (int)(Math.random()*150)+30;
int starXC = (int)(Math.random()*350)+20;
int starYC = (int)(Math.random()*150)+30;
int starXD = (int)(Math.random()*350)+20;
int starYD = (int)(Math.random()*150)+30;
int starXE = (int)(Math.random()*350)+20;
int starYE = (int)(Math.random()*150)+30;
int starXF = (int)(Math.random()*350)+20;
int starYF = (int)(Math.random()*150)+30;
int starXG = (int)(Math.random()*350)+20;
int starYG = (int)(Math.random()*150)+30;
int starXH = (int)(Math.random()*350)+20;
int starYH = (int)(Math.random()*150)+30;
int starXI = (int)(Math.random()*350)+20;
int starYI = (int)(Math.random()*150)+30;
int starXJ = (int)(Math.random()*350)+20;
int starYJ = (int)(Math.random()*150)+30;
int starXK = (int)(Math.random()*350)+20;
int starYK = (int)(Math.random()*150)+30;
int starXL = (int)(Math.random()*350)+20;
int starYL = (int)(Math.random()*150)+30;
int starXM = (int)(Math.random()*350)+20;
int starYM = (int)(Math.random()*150)+30;
int starXN = (int)(Math.random()*350)+20;
int starYN = (int)(Math.random()*150)+30;
int starXO = (int)(Math.random()*350)+20;
int starYO = (int)(Math.random()*150)+30;
int starXP = (int)(Math.random()*350)+20;
int starYP = (int)(Math.random()*150)+30;
int starXQ = (int)(Math.random()*350)+20;
int starYQ = (int)(Math.random()*150)+30;
int starXR = (int)(Math.random()*350)+20;
int starYR = (int)(Math.random()*150)+30;
int starXS = (int)(Math.random()*350)+20;
int starYS = (int)(Math.random()*150)+30;
int starXT = (int)(Math.random()*350)+20;
int starYT = (int)(Math.random()*150)+30;
int starXU = (int)(Math.random()*350)+20;
int starYU = (int)(Math.random()*150)+30;
int starXV = (int)(Math.random()*350)+20;
int starYV = (int)(Math.random()*150)+30;
int starXW = (int)(Math.random()*350)+20;
int starYW = (int)(Math.random()*150)+30;
int starXX = (int)(Math.random()*350)+20;
int starYX = (int)(Math.random()*150)+30;
int starXY = (int)(Math.random()*350)+20;
int starYY = (int)(Math.random()*150)+30;



public void setup()
{
	size(400,350);
}

public void draw()
{
	background(-mouseY+150, -mouseY+200, -mouseY+250);
	Sun();
	Moon();
	Ground();
	stars();
	
}

public void Ground()
{
	fill(178, 113, 69,200);
	rect(0, 250, 400, 180);
}

public void Sun ()
{
	noStroke();
	fill(255, 196, 58,-mouseY+280);
	ellipse(330, mouseY, 50, 50);
	
}

public void Moon()
{
	noStroke();
	fill(255,255,255, mouseY-50);
	ellipse(70, 350-mouseY, 50,50);
}

public void stars()
{

	int mouzeY=mouseY;
	if (mouzeY>150) {
		fill(255,255,255);
	ellipse(starX,starY, 3, 3);
	}

	if (mouzeY>170) {
		fill(255,255,255);
	ellipse(starX1,starY1, 3, 3);
	ellipse(starX2,starY2, 3, 3);
	ellipse(starX3,starY3, 3, 3);
	}
	
	if (mouzeY>190){
		fill(255,255,255);
		ellipse(starX4,starY4, 3, 3);
		ellipse(starX5,starY5, 3, 3);
		ellipse(starX6,starY6, 3, 3);
		ellipse(starX7,starY7, 3, 3);
		ellipse(starX8,starY8, 3, 3);

	}	

	if (mouzeY>210){
		fill(255,255,255);
		ellipse(starXb,starYb, 3, 3);
		ellipse(starXc,starYc, 3, 3);
		ellipse(starXd,starYd, 3, 3);
		ellipse(starXe,starYe, 3, 3);
		ellipse(starXf,starYf, 3, 3);
		ellipse(starXg,starYg, 3, 3);
		ellipse(starXh,starYh, 3, 3);
		ellipse(starXi,starYi, 3, 3);
	}

	if (mouzeY>230) {
		fill(255,255,255);
		
		ellipse(starXk,starYk, 3, 3);
		ellipse(starXl,starYl, 3, 3);
		ellipse(starXm,starYm, 3, 3);
		ellipse(starXn,starYn, 3, 3);
		ellipse(starXo,starYo, 3, 3);
		ellipse(starXp,starYp, 3, 3);
		ellipse(starXq,starYq, 3, 3);
		ellipse(starXr,starYr, 3, 3);
		ellipse(starXs,starYs, 3, 3);
		ellipse(starXt,starYt, 3, 3);
		ellipse(starXu,starYu, 3, 3);
		ellipse(starXv,starYv, 3, 3);
	}

	if (mouzeY>250){
		ellipse(starXB,starYB, 3, 3);
		ellipse(starXB,starYB, 3, 3);
		ellipse(starXC,starYC, 3, 3);
		ellipse(starXC,starYD, 3, 3);
		ellipse(starXD,starYE, 3, 3);
		ellipse(starXD,starYN, 3, 3);
		ellipse(starXD,starYM, 3, 3);
		ellipse(starXE,starY, 3, 3);
		ellipse(starXE,starY, 3, 3);
		ellipse(starXF,starYF, 3, 3);
		ellipse(starXF,starYF, 3, 3);
		ellipse(starXG,starYG, 3, 3);
		ellipse(starXH,starYH, 3, 3);
		ellipse(starXI,starYI, 3, 3);
		ellipse(starXJ,starYJ, 3, 3);
		ellipse(starXK,starYL, 3, 3);
		ellipse(starXM,starYM, 3, 3);
		ellipse(starXN,starYN, 3, 3);
		ellipse(starXO,starYO, 3, 3);
		ellipse(starXP,starYP, 3, 3);

	}

}

public void mouseClicked()
{
	

}

public void meteorImage()
{

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
