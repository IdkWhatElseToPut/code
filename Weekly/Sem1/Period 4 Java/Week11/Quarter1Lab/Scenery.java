import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel {
    //make variables to make select scenery
    private String timeOfDay, season;

    //set variables from what is passed in by user
    public Scenery(String timeOfDay, String season) {
        this.timeOfDay = timeOfDay;
        this.season = season;
    }
    //make window/set window size
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
    //select corerct scenery based on what is passed in by user then calls the season and day scenery method
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("spring")) {
            springDay(g);
        } else if (timeOfDay.equalsIgnoreCase("night") && season.equalsIgnoreCase("spring")) {
            springNight(g);
        } else if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("fall")) {
            fallDay(g);
        } else if (timeOfDay.equalsIgnoreCase("night") && season.equalsIgnoreCase("fall")) {
            fallNight(g);
        } else if (timeOfDay.equalsIgnoreCase("day") && season.equalsIgnoreCase("winter")) {
            winterDay(g);
        } else if (timeOfDay.equalsIgnoreCase("night") && season.equalsIgnoreCase("winter")) {
            winterNight(g);
        }else {
            System.out.println("Please enter 'Day' or 'Night' and then 'Winter', 'Spring', or 'Fall'.");
            System.exit(0);
        }
    }

    //methods to call each item to draw
    private void springNight(Graphics g){
        nightSkySpring(g);
        stars(g);
        Moon(g);
        nightGroundSpring(g);
        springTree(g, 80, 400);
        springTree(g, 200, 400);
        springTree(g, 320, 400);
        cabin(g);
        springFlower(g, 100, 500);
        springFlower(g, 200, 500);
        springFlower(g, 300, 500);
        duck(g,675,525);
        racoon(g,500,500);
    }
    private void springDay(Graphics g){
        daySkySpring(g);
        sun(g);
        dayGroundSpring(g);
        springTree(g, 80, 400);
        springTree(g, 200, 400);
        springTree(g, 320, 400);
        cabin(g);
        springFlower(g, 100, 500);
        springFlower(g, 200, 500);
        springFlower(g, 300, 500);
        duck(g,675,525);
        racoon(g,500,500);
    }
    private void fallNight(Graphics g){
        nightSkySpring(g);
        stars(g);
        Moon(g);
        nightGroundFall(g);
        cabin(g);
        duck(g,675,525);
        fallTree(g,80,400);
        fallTree(g,200,400);
        fallTree(g,320,400);
        racoon(g,500,500);
        fallFlower(g, 100, 500);
        fallFlower(g, 200, 500);
        fallFlower(g, 300, 500);
    }
    private void fallDay(Graphics g){
        daySkySpring(g);
        sun(g);
        dayGroundfall(g);
        duck(g,675,525);
        fallTree(g,80,400);
        fallTree(g,200,400);
        fallTree(g,320,400);
        cabin(g);
        racoon(g,500,500);
        fallFlower(g, 100, 500);
        fallFlower(g, 200, 500);
        fallFlower(g, 300, 500);
    }
    private void winterNight(Graphics g){
        nightSkyWinter(g);
        nightGroundWinter(g);
        snowFlakes(g);
        winterTreeNight(g, 80, 400);
        winterTreeNight(g, 200, 400);
        winterTreeNight(g, 320, 400);
        cabin(g);
        winterFlower(g, 100, 500);
        winterFlower(g, 200, 500);
        winterFlower(g, 300, 500);
        duck(g,675,525);
        snowCoverNight(g);
        racoon(g,500,500);
    }
    private void winterDay(Graphics g){
        daySkyWinter(g);
        dayGroundWinter(g);
        snowFlakes(g);
        winterTreeDay(g, 80, 400);
        winterTreeDay(g, 200, 400);
        winterTreeDay(g, 320, 400);
        cabin(g);
        winterFlower(g, 100, 500);
        winterFlower(g, 200, 500);
        winterFlower(g, 300, 500);
        duck(g,675,525);
        snowCoverDay(g);
        racoon(g,500,500);
    }


//------------------------------------------------------------------------------------------------------------------------------------------------------------

    //sky
    private void daySkySpring(Graphics g) {
        Color colorDaySky = new Color(145, 223, 239);//blue sky
        g.setColor(colorDaySky);
        g.fillRect(0, 0, 800, 400);
    }
    private void nightSkySpring(Graphics g) {
        Color colorNightSky = new Color(11, 10, 33);//dark blue sky
        g.setColor(colorNightSky);
        g.fillRect(0, 0, 800, 400);
    }
    private void daySkyWinter(Graphics g) {
        Color colorClouds = new Color(192, 192, 192);//hazy winter cloud white
        g.setColor(colorClouds);
        g.fillRect(0, 0, 800, 600); 
    
        Color colorSun = new Color(255, 255, 255, 50); //low opacity so sun is visible but barely
        g.setColor(colorSun);
        g.fillOval(50, 50, 100, 100); 
    }
    private void nightSkyWinter(Graphics g) {
        Color darkCloudColor = new Color(202,202,202);//hazy winter cloud white - darker white
        Color moonColor = new Color(253, 248, 215, 50); //low opacity so moon is barely visible
        g.setColor(darkCloudColor);
        g.fillRect(0, 0, 800, 600);
    
        
        g.setColor(moonColor);
        g.fillOval(50, 50, 100, 100);

        g.setColor(darkCloudColor);
        g.fillOval(75,35, 200, 125);
    }
    
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------


    //GROUND
    private void nightGroundSpring(Graphics g){
        Color colorNightGround = new Color(7, 50, 21); //dark green
        g.setColor(colorNightGround);
        g.fillRect(0, 400, 800, 200);
    }
    private void dayGroundSpring(Graphics g){
        Color colorDayGround = new Color(12, 105, 43);//green
        g.setColor(colorDayGround);
        g.fillRect(0, 400, 800, 200);
    }
    private void nightGroundWinter(Graphics g){
        Color snowNight = new Color(232,232,232);//darkish white
        g.setColor(snowNight);
        g.fillRect(0, 400, 800, 200);
    }
    private void dayGroundWinter(Graphics g){
        Color snowDay = new Color(255,255,255);//white
        g.setColor(snowDay);
        g.fillRect(0, 400, 800, 200);
    }
    private void nightGroundFall(Graphics g){
        Color fallGroundNight = new Color(132,111,73);//dark brown
        Color nightRed = new Color (100,2,2); //dark red
        Color nightOrange = new Color(204,102,0); //darker orange
        g.setColor(fallGroundNight);
        g.fillRect(0, 400, 800, 200);

        //random location leaves
        int xLeafOrange,xLeafRed,yLeafOrange,yLeafRed;
        int amount = 0;
        while(amount < 1000){ //keeps running until reaches set amount of leaves
            //random location coordinate that will print a leaf and run again unitl amount is greater than 1000
            xLeafRed =(int) (Math.random()*800+1);
            yLeafRed =(int) (Math.random()*600+400);
            xLeafOrange =(int) (Math.random()*800+1);
            yLeafOrange =(int) (Math.random()*600+400);
            amount++;
            
        g.setColor(nightRed);
        g.fillOval(xLeafRed, yLeafRed, 6, 6);

        g.setColor(nightOrange);
        g.fillOval(xLeafOrange, yLeafOrange, 6, 6);
        }
    }
    private void dayGroundfall(Graphics g){
        Color fallGroundDay = new Color(179,150,101);//brown
        Color dayRed = new Color (255,0,0);//red
        Color dayOrange = new Color(255,128,0);//orange
        g.setColor(fallGroundDay);
        g.fillRect(0, 400, 800, 200);

        //random leaves location
        int xLeafOrange,xLeafRed,yLeafOrange,yLeafRed;
        int amount = 0;
        while(amount < 1000){ //amount of leaves
            //random location coordinate that will print a leaf and run again unitl amount is greater than 1000
            xLeafRed =(int) (Math.random()*800+1);
            yLeafRed =(int) (Math.random()*600+400);
            xLeafOrange =(int) (Math.random()*800+1);
            yLeafOrange =(int) (Math.random()*600+400);
            amount++;
            
        g.setColor(dayRed);
        g.fillOval(xLeafRed, yLeafRed, 6, 6);

        g.setColor(dayOrange);
        g.fillOval(xLeafOrange, yLeafOrange, 6, 6);
        }
    }



//------------------------------------------------------------------------------------------------------------------------------------------------------------

    //SUN & MOON & STARS
    private void sun(Graphics g){
        Color colorSun  = new Color(247,247,65);//yellow
        g.setColor(colorSun);
        g.fillOval(50, 50, 100, 100);
    }
    private void Moon(Graphics g){
        Color moon = new Color(253,248,215);//yellowish
        Color colorNightSky = new Color(11, 10, 33);
        g.setColor(moon);
        g.fillOval(50, 50, 100,100);

        g.setColor(colorNightSky);
        g.fillOval(75,35, 200, 125); 
    }
    private void stars(Graphics g){
        Color stars = new Color(255,255,255);//white
        int xStarBig,yStarBig,xStarSmall,yStarSmall;
        int amount = 0;
        while(amount < 125){ //the number of stars
            //random coordiantes for stars, repeats and makes different coordantes unitl amount is greater than 125
            xStarBig =(int) (Math.random()*800+1);
            yStarBig =(int) (Math.random()*600+1);
            xStarSmall =(int) (Math.random()*800+1);
            yStarSmall =(int) (Math.random()*600+1);
            amount++;

        g.setColor(stars);
        g.fillOval(xStarSmall, yStarSmall, 2, 2);
        g.fillOval(xStarBig, yStarBig, 4, 4);
        }
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------
    //CABIN
    private void cabin(Graphics g) {
        //colors
        Color cabinOutside = new Color(139,69,19);
        Color roof = new Color(176,33,33);
        Color door = new Color(102,51,0);
        Color doorKnob = new Color(0,0,0);

        //cabin body
        g.setColor(cabinOutside);
        g.fillRect(500, 300, 150, 150); 

        //roof
        g.setColor(roof);
        int[] roofX = { 475, 675, 575 };
        int[] roofY = { 300, 300, 250 };
        g.fillPolygon(roofX, roofY, 3);

        //door
        g.setColor(door);
        g.fillRect(555, 375, 45, 75);

        g.setColor(doorKnob);
        g.fillOval(585, 410, 10, 10);

        //windows
        if (timeOfDay.equalsIgnoreCase("night")) {

            g.setColor(Color.yellow);
        } else {

            g.setColor(Color.white);
        }
        g.fillRect(520, 325, 30, 30);
        g.fillRect(600, 325, 30, 30);

        
    }



//------------------------------------------------------------------------------------------------------------------------------------------------------------

    //TREES FLOWERS
    private void springTree(Graphics g, int x, int y) {
        Color treeTrunk = new Color(139,69,19);
        Color treeLeaves = new Color(0,153,0);

        g.setColor(treeTrunk); 
        g.fillRect(x - 12, y, 25, 100); 

        
        g.setColor(treeLeaves);
        g.fillOval(x - 40, y - 65, 80, 80); //bottom leaves
        g.fillOval(x - 30, y - 85, 60, 60); //middle leaves
        g.fillOval(x - 20, y - 105, 40, 40); //top leaves
    }
    private void springFlower(Graphics g, int x, int y) {
        Color stem = new Color(0,128,0);
        Color flowerPetal = new Color(225,192,203);

        g.setColor(stem); 
        g.fillRect(x-1, y, 5, 40); 
       

        g.setColor(flowerPetal);
        g.fillOval(x + 4, y - 5, 15, 15); //right petal
        g.fillOval(x - 6, y + 5, 15, 15); //bottom petal
        g.fillOval(x - 16, y - 5, 15, 15); //left petal
        g.fillOval(x - 6, y - 15, 15, 15); //top petal
       
        //Center of the flower
        g.setColor(Color.yellow);
        g.fillOval(x - 6, y - 5, 15, 15);
    }
    private void fallTree(Graphics g,int x,int y){
        Color treeTrunk = new Color(139,69,19);
        Color treeLeaves = new Color(255,128,0);

        g.setColor(treeTrunk); 
        g.fillRect(x - 12, y, 25, 100); 
    

        g.setColor(treeLeaves);
        g.fillOval(x - 40, y - 65, 80, 80); //bottom leaves
        g.fillOval(x - 30, y - 85, 60, 60); //middle leaves
        g.fillOval(x - 20, y - 105, 40, 40); //top leaves
    }
    private void fallFlower(Graphics g, int x, int y) {
        Color stem = new Color(0, 128, 0);
        //different petal colors for fall
        Color petalColor1 = new Color(255, 140, 0); //orange
        Color petalColor2 = new Color(255, 215, 0); //yellow


        g.setColor(stem);
        g.fillRect(x - 1, y, 5, 40);

        g.setColor(petalColor1);
        g.fillOval(x + 4, y - 5, 15, 15); // Right petal
        g.fillOval(x - 16, y - 5, 15, 15); // Left petal

        g.setColor(petalColor2);
        g.fillOval(x - 6, y + 5, 15, 15); // Bottom petal
        g.fillOval(x - 6, y - 15, 15, 15); //top petal

        g.setColor(Color.yellow);
        g.fillOval(x - 6, y - 5, 15, 15); // Center of the flower
    }

    private void winterTreeDay(Graphics g, int x, int y){
        Color treeTrunk = new Color(139,69,19);
        Color snowDay = new Color(255,255,255);

        //tree
        g.setColor(treeTrunk); 
        g.fillRect(x - 12, y-100, 25, 200);//trunk
        g.fillRect(x - 35, y - 20, 70, 15);//bottom branch
        g.fillRect(x - 25, y - 60, 50, 15);//middle branch
        g.fillRect(x - 16, y - 90, 33, 10);//top branch

        //snow cover
        g.setColor(snowDay);
        g.fillRect(x-35, y-25, 70, 5);//snow bottom branch
        g.fillRect(x-25, y-65, 50, 5);//snow middle branch
        g.fillRect(x-16, y-95, 33, 5);//snow top branch
        g.fillRect(x-12, y-105, 25, 5);//snow top tree
    }
    private void winterTreeNight(Graphics g, int x, int y){
        Color treeTrunk = new Color(139,69,19);
        Color snowNight = new Color(232,232,232);

        //tree
        g.setColor(treeTrunk); 
        g.fillRect(x - 12, y-100, 25, 200);//trunk
        g.fillRect(x - 35, y - 20, 70, 15);//bottom branch
        g.fillRect(x - 25, y - 60, 50, 15);//middle branch
        g.fillRect(x - 16, y - 90, 33, 10);//top branch

        //snow cover
        g.setColor(snowNight);
        g.fillRect(x-35, y-25, 70, 10);//snow bottom branch
        g.fillRect(x-25, y-65, 50, 10);//snow middle branch
        g.fillRect(x-16, y-95, 33, 10);//snow top branch
        g.fillRect(x-12, y-105, 25, 10);//snow top tree

    }
    private void winterFlower(Graphics g, int x, int y) {
        Color stem = new Color(216,216,216); //gray stem
        Color flowerPetal = new Color(197,218,232); //blueish petals

        //steam
        g.setColor(stem);
        g.fillRect(x - 1, y, 5, 40);

        //petals
        g.setColor(flowerPetal);
        g.fillOval(x + 4, y - 5, 15, 15); // Right petal
        g.fillOval(x - 6, y + 5, 15, 15); // Bottom petal
        g.fillOval(x - 16, y - 5, 15, 15); // Left petal
        g.fillOval(x - 6, y - 15, 15, 15); // Top petal

        //center of flower
        g.setColor(Color.yellow); //yellow center
        g.fillOval(x - 6, y - 5, 15, 15);
    }

    

//------------------------------------------------------------------------------------------------------------------------------------------------------------

    //WEATHER
    private void snowFlakes(Graphics g) {
        int amount = 0;
        while (amount < 75) { //kepp running the loop when there are less than 75 snowflakes
            int xSnowFlake = (int) (Math.random() * 800 + 1);
            int ySnowFlake = (int) (Math.random() * 600 + 1);
    
            g.setColor(Color.white);
    
            //snowflake made of 6 lines
            g.drawLine(xSnowFlake, ySnowFlake - 5, xSnowFlake, ySnowFlake + 5);
            g.drawLine(xSnowFlake - 5, ySnowFlake, xSnowFlake + 5, ySnowFlake);

            amount++;
        }
    }
    //puts a thin layer of snow on the house
    private void snowCoverDay(Graphics g){
        Color snowDay = new Color(255,255,255);
        g.setColor(snowDay);
        int[] xSnowRoofLeft = {475,475,575,575};
        int[] ySnowRoofLeft = {285,300,250,235};
        g.fillPolygon(xSnowRoofLeft, ySnowRoofLeft, 4);
        int[] xSnowRoofRight = {675,675,575,575};
        int[] ySnowRoofRight = {285,300,250,235};
        g.fillPolygon(xSnowRoofRight, ySnowRoofRight, 4);
        g.fillRect(500, 435, 150, 15);
        
    }
    //puts a thick layer of snow on the house
    private void snowCoverNight(Graphics g){
        Color snowNight = new Color(232,232,232);
        g.setColor(snowNight);
        int[] xSnowRoofLeft = {475,475,575,575};
        int[] ySnowRoofLeft = {270,300,250,220};
        g.fillPolygon(xSnowRoofLeft, ySnowRoofLeft, 4);
        int[] xSnowRoofRight = {675,675,575,575};
        int[] ySnowRoofRight = {270,300,250,220};
        g.fillPolygon(xSnowRoofRight, ySnowRoofRight, 4);
        g.fillRect(500, 420, 150, 30);
    }



//------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Animals
    private void duck(Graphics g, int x, int y) {
        Color beak = new Color(233, 173, 34);
        Color body = new Color(220, 220, 113);
        Color eye = new Color(0, 0, 0);


        //beak
        g.setColor(beak);
        g.fillOval(x + 30, y - 10, 25, 13);
        g.fillRect(x - 10, y + 35, 10, 20);

        //body/head
        g.setColor(body);
        g.fillOval(x - 40, y - 5, 65, 40);
        g.fillOval(x + 5, y - 20, 35, 27);
        
        //eye
        g.setColor(eye);
        g.fillOval(x + 25, y - 15, 8, 8);

        //foot
        g.setColor(beak); 
        int[] xPoints = { 685, 685, 665 };
        int[] yPoints = { 585, 570, 575 };
        g.fillPolygon(xPoints, yPoints, 3);
    }
    
    private void racoon(Graphics g, int x, int y){
        Color gray = new Color(205,194,157);
        Color black = new Color(0,0,0);
        Color darkGray = new Color(97,92,77);


        //body and head
        g.setColor(gray);
        g.fillOval(x-50,y,75,50);
        g.fillOval(x-75, y-10, 40, 35);
        g.setColor(darkGray);
        g.fillOval(x-70,y,30,10);


        //legs
        g.setColor(gray);
        g.fillRect(x-40, y+40, 7, 25);
        g.fillRect(x-30, y+40, 7, 25);
        g.fillRect(x, y+40, 7, 25);
        g.fillRect(x+10, y+40, 7, 25);


        //tail
        g.setColor(gray);
        g.fillRect(x+23, y+20, 7, 10);
        g.fillRect(x+37, y+22,7,10);
        g.fillRect(x+51, y+28,7,10);

        g.setColor(black);
        g.fillRect(x+30, y+20, 7, 10);
        g.fillRect(x+44, y+24,7,10);
    
        //eyes and nose
        g.fillOval(x-65, y+1, 7, 7);
        g.fillOval(x-55, y+1, 7, 7);
        g.fillOval(x-62, y+10, 10, 6);

        //ears
        g.setColor(gray);
        int[] leftEarX = {x-65, x-60, x-55};
        int[] leftEarY = {y-7, y-17, y-7};
        int[] rightEarX = {x-53, x-48, x-43};
        int[] rightEarY = {y-7, y-17, y-7};
        g.fillPolygon(leftEarX, leftEarY, 3);
        g.fillPolygon(rightEarX, rightEarY, 3);
    }
}