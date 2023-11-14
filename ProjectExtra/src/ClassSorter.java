

public class ClassSorter {
    //static Path p= Paths.get()
    static String absPath= System.getProperty("user.dir");
    static class Snake{
        public static void method() throws Exception{
            /*
             * uses the abs path to allow it so im not hard coding the location of the file
             * then sends it to the proper array class it should work 
             * its still a bit messy might try and find a different way to get the files 
             * worst comes to worst i can just generate the files on the user device and then 
             * can call off of those
             */
            HighScoreGui.textField.setText("Snake HighScores:\n");
            String path = (absPath+"\\ProjectExtra\\lib\\Snake.csv");
            csv_Array.readin(path);

        }
    }
    static class Mario{
        public static void method() throws Exception{
            HighScoreGui.textField.setText("Mario HighScores:\n");
            String path = (absPath+"\\ProjectExtra\\lib\\Mario.csv");
            csv_Array.readin(path);


        }
    }
    static class PacMan{
        public static void method() throws Exception{
            HighScoreGui.textField.setText("PacMan HighScores:\n");
            String path = (absPath+"\\ProjectExtra\\lib\\PacMan.csv");
            csv_Array.readin(path);


        }
    }
    static class Galega{
        public static void method() throws Exception{
            HighScoreGui.textField.setText("Galega HighScores:\n");
            String path = (absPath+"\\ProjectExtra\\lib\\Galega.csv");
            csv_Array.readin(path);

        }
    }
}
