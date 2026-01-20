import org.code.theater.*;
import org.code.media.*;
import java.lang.Math;


public class LastYear extends Scene {
  /* 
  Setting up the private instance variables
  */
  private String[] images;
  private String[] names;
  private String[] numbers;
  private String[] assets;

  /* 
  setting up the parameterized constructor
  */
  public LastYear(String[] images, String[] names, String[] numbers, String[] assets) {
    this.images = images;
    this.names = names;
    this.numbers = numbers;
    this.assets = assets;
  }
  //drawscene method
  public void drawScene(){
    //enhanced for loop that draws every single image from the "numbersPastAnim1.txt" file, makes a cool effect
    for(String image : numbers){
      drawImage(image, 100, 130, 200);
      pause(0.1);
      blankScreen();
    }

    setTextHeight(60);
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextColor(new Color(0,0,0));
    drawText("2025",150,47);
    pause(1);
    blankScreen();
    pause(1);
    
    setTextHeight(30);
    for(int l = 0; l < 15; l++){
      drawText("Recap", 140, 180);
      pause(0.1);
      setTextColor(new Color(generateNumber(1,255),generateNumber(1,255),generateNumber(1,255)));
      //using the custom made number generator to generate random colors as a part of my animation. 
    }
    resetText();

    //makes the "1, 2, 3" countdown, uses regular for loop
    for(int m = 1; m <4; m++){
      blankScreen();
      drawText("" + m,200,160);
      pause(1);
    }
    pause(0.5);
    blankScreen();

    //a regular for loop that iterates through "lastYearImages.txt", it draws out every single place I have been to in 2025.
    for(int j = 0; j < images.length; j++){
      drawImage(images[j], 80, 100, 250);
      drawText(names[j], 100,56);
      pause(1.5);
      blankScreen();
    }

    //displays my favorite video game
    drawText("My favorite game:", 100,56);
    pause(1);
    drawAsset(0, 80, 100, 200);
    pause(2);
    blankScreen();
    pause(1);

    //displays my favorite restaurant
    blankScreen();
    drawText("My favorite restaurant:", 50,56);
    pause(1);
    drawAsset(1, 80, 100, 200);
    pause(1);
    blankScreen();

    //displays my greatest accomplishments of 2025
    drawText("My accomplishments:", 50,56);
    pause(1);
    drawText("Good grades", 130,140);
    pause(1);
    drawText("Played roblox for 900 hours", 1,170);
    pause(1);
    blankScreen();
  }
  

  /* 
  Helps me draw assets from "assets_extra.txt", in an easier way
  */
  public void drawAsset(int index, int x, int y, int s){
    drawImage(assets[index], x, y, s);
  }
  /* 
  This method just makes the screen go white, makes the code look more clean :)
  */
  public void blankScreen(){
    clear("white");
  }
  /* 
  generateNumber is a method that takes a minimum value and a maximum value and generates a number in the range of the two numbers.
  */
  public int generateNumber(int min, int max) {
    int range = max - min + 1;
    return (int)(Math.random() * range) + min;
  }
  /* 
  This method sets the attributes of the text to the default values for my app. 
  */
  public void resetText(){
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextColor(new Color(0,0,0));
  }
  
}
