import org.code.theater.*;
import java.lang.Math;

public class TheaterRunner {

  /* 
  From lines 11-14, I load all of the txt files with contain all the info of the names of the assets
  which I use in the app.
  */
  public static void main(String[] args) {
    String[] past_images = FileReader.toStringArray("lastYearImages.txt");
    String[] past_names = FileReader.toStringArray("pastYearNames.txt");
    String[] past_numbers = FileReader.toStringArray("numbersPastAnim1.txt");
    String[] past_assets = FileReader.toStringArray("assets_extra.txt");
    
    LastYear lastYear = new LastYear(past_images, past_names, past_numbers, past_assets);
    ThisYear thisYear = new ThisYear(past_assets);
    
    // Call top level methods
    lastYear.drawScene();
    thisYear.drawScene();
    
    // Play scenes (in order of arguments)
    Theater.playScenes(lastYear,thisYear);
  }
}
