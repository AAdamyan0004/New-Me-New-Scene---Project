import org.code.theater.*;
import org.code.media.*;


public class ThisYear extends Scene {
  private String[] assets;
  private int[] images;
  private String[] texts;

  public ThisYear(String[] assets) {
        this.assets = assets;
        images = new int[2];
        images[0] = 2;
        images[1] = 3;
        texts = new String[2];
        texts[0] = "Get very good grades";
        texts[1] = "Play roblox for 1800 hours";
  }

  public void drawScene(){
    setTextHeight(40);
    drawText("My goals for 2026!", 40, 180);
    pause(2);
    blankScreen();
    setTextHeight(30);
    //uses for loop to draw out my 2026 goals
    for(int i = 0; i < images.length; i++){
      pause(1);
      drawAsset(images[i],100,180, 200);
      drawText(texts[i], 10, 70);
      pause(1);
      blankScreen();
    }
    endProgram();
  }
  

  public void drawAsset(int index, int x, int y, int s){
    drawImage(assets[index], x, y, s);
  }
  public void blankScreen(){
    clear("white");
  }
  public void endProgram(){
    blankScreen();
    pause(1);
    drawText("The end :)", 40, 180);
    pause(1);
    blankScreen();
  }
  
}
