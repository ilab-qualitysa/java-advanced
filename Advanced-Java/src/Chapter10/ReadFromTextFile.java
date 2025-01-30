package Chapter10;

import java.io.*;

public class ReadFromTextFile {
    public static void main(String[] args) {
        String filePath = "src/Chapter10/resources/read_example.txt";
        File myFile = null;
        String data = null;

        try {
            myFile = new File(filePath);
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);
            while ((data = read.readLine()) != null) {
                System.out.println(data);
            }

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read from file");
        }
        System.out.println("==================================================");
        readNumbers();
    }

    static void readNumbers() {
        String filePath = "src/Chapter10/resources/numbers.txt";
        File myfile = null;
        String numbersLine = null;

        try {
            myfile = new File(filePath);
            FileReader reader = new FileReader(myfile);
            BufferedReader read = new BufferedReader(reader);
            numbersLine = read.readLine();
            String[] arrNumbers = numbersLine.split(",");
            for(String num : arrNumbers) {
                if(Integer.parseInt(num) % 2 == 0) {
                    System.out.println(num);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
    }
}
