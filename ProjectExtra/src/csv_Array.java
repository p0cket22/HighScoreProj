import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class csv_Array {
    public static String readin(Path path){
        Path Path = path;

        ///List<String[]> rows = new ArrayList<>();
        StringBuilder formattedString = new StringBuilder();
        try {
            BufferedReader reader  = Files.newBufferedReader(path);
            String line;
        while((line = reader.readLine()) != null){

            String[] values = line.split(",");
            
            if (values.length ==2){
                String scoreboard = String.format("[%s, %s]%n", values);
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
}
