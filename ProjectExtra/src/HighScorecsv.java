import java.nio.file.FileSystems;
import java.nio.file.Path;

public class HighScorecsv {
    static String absPath= System.getProperty("user.dir");
    static class Snake{
        public static void method(){
            HighScoreGui.textField.setText("Snake is sending");
            Path path = FileSystems.getDefault().getPath(absPath+"\\ProjectExtra\\lib\\Snake.csv");
            String scoreboard= csv_Array.readin(path);
            HighScoreGui.textField.setText(scoreboard);
        }
    }
    static class Mario{
        public static void method(){
            HighScoreGui.textField.setText("Mario is sending");
            Path path = FileSystems.getDefault().getPath(absPath+"\\ProjectExtra\\lib\\Snake.csv");
            String scoreboard= csv_Array.readin(path);
            HighScoreGui.textField.setText(scoreboard);

        }
    }
    static class PacMan{
        public static void method(){
            HighScoreGui.textField.setText("PacMan is sending");
            Path path = FileSystems.getDefault().getPath(absPath+"\\ProjectExtra\\lib\\PacMan.csv");
            String scoreboard= csv_Array.readin(path);
            HighScoreGui.textField.setText(scoreboard);

        }
    }
    static class Galega{
        public static void method(){
            HighScoreGui.textField.setText("Galega is sending");
            Path path = FileSystems.getDefault().getPath(absPath+"\\ProjectExtra\\lib\\Galega.csv");
            String scoreboard= csv_Array.readin(path);
            HighScoreGui.textField.setText(scoreboard);

        }
    }
}
