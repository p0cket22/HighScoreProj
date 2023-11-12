import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVParser;

public class csv_Array {
    public static String readin(Path path){
        Path Patha = path;
        CSVParser csvparser;

        String Name = JOptionPane.showInputDialog("Enter your name");
        String Score = JOptionPane.showInputDialog("Enter your score"); 
        //String[] values;
        //values[] = (Name+" ("+Score+")");
        ///List<String[]> rows = new ArrayList<>();
        StringBuilder formattedString = new StringBuilder();
        try {
            BufferedReader reader  = Files.newBufferedReader(path);
            String line;
        while((line = reader.readLine()) != null){

            String[] values = line.split(",");
            
            if (values.length ==2){
                String scoreboard = String.format("%s (%s)%n", values);
                formattedString.append(scoreboard);
                formattedString.append(System.lineSeparator());
                System.out.println(formattedString);
            }

        }


    }catch(IOException e){
        e.printStackTrace();
    }
    
    return formattedString.toString();

}
    public static void Readout(Path path){
        
        

    }
}
