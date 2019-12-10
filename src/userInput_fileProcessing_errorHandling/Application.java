package userInput_fileProcessing_errorHandling;

// need to import library with Scanner class in it
import java.io.FileNotFoundException;
import java.util.Scanner;

// need to import library with the File class in it
import java.io.File;

public class Application {

    public static void main(String[] args) {

        // get user input
        // getInput();

        // read from a .txt file
        readFile();

        try {
            int result = subtract10FromNumber(10);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public static void getInput() {
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter some Text:");
            String enteredText = input.nextLine();
            System.out.println(enteredText);
        }
    }

    public static void readFile() {
        try {
            File file = new File("file.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int subtract10FromNumber(int number) throws Exception {
        if(number < 10) {
            throw new Exception("Number must be 10 or larger");
        }
        return (number - 10);
    }

}
