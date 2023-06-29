package HandlingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadOperation {

	public static void main(String[] args) {
		try {
            FileReader fr = new FileReader("F:\\demo.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

	}

}
