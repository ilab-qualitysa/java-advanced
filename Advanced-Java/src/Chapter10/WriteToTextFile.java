package Chapter10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class WriteToTextFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Tumelo Maphalla\\Desktop\\Training.txt";
        //create a file class object
        File myFile = null;

        try{
            myFile = new File(filePath);
            PrintStream pen = new PrintStream(myFile);
            //create the file

            if(myFile.exists()) {
                //pen = new PrintStream(myFile);
                pen.append("Today is Thursday");
            } else {
                myFile.createNewFile();
                pen.println("==============30-01-2025============");
                pen.println("Thursday");
                pen.println("iLAB Training");
                pen.println("Advanced Java Course");
            }
            pen.close();
        } catch (IOException e) {
            System.err.println("File not created");
        }

    }
}
