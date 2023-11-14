
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;


public class csv_Array {

    public static void readin(String path) throws Exception{
         
        
        writeToCSV(path);
        List<CSVRecord> records = readCSV(path);
        
        //sorts the records array and then reverses it so its from highest to lowest
        Collections.sort(records, Comparator.comparing(record -> Integer.parseInt(record.get("Score"))));
        Collections.reverse(records);

        //rotates through the List to print the name column and score column to the 
        //console and the textarea
        int pos=0;
        for(CSVRecord record : records){

            pos++;
            HighScoreGui.textField.append("Rank "+pos+":"+record.get("Name")+", Score:"+record.get("Score")+"\n");
            System.out.println("Name:"+record.get("Name")+", Score:"+record.get("Score"));
        }
            //System.out.println(records);
        
}
    public static List<CSVRecord> readCSV(String path) throws Exception{
        /*
         * uses csv parser to read the csv line by line into the list
         */
        List<CSVRecord> records = new ArrayList<>();
        try(FileReader fileReader = new FileReader(path);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
                records.addAll(csvParser.getRecords());
                System.out.println(records);
                
                //records.addAll(csvParser.getRecords());
            
            }
            return records;
        }
        
    
    public static void writeToCSV(String path) throws Exception{
        /*
         * takes the user inputs
         */
        String Names = JOptionPane.showInputDialog("Enter your name");
        String Score = JOptionPane.showInputDialog("Enter your score");

        /*
         * I finally figured this out was basically trying to parse the wrong data type through the 
         * printer needed to pass the new data into an array list so the delimiter would match
         */
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{Names, Score});
        try (
            CSVPrinter csvPrinter = new CSVPrinter(new FileWriter(path, true), CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            
            

            csvPrinter.printRecords(data);
            }

    }
}
