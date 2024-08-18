import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args)
    {
        parseData("./test-data/twoSum.txt");
    }

    public static void parseData(String path)
    {
        BufferedReader reader;

        try {
            File file = new File(path);
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                String[] parts = line.split("-");
                System.out.println(Arrays.toString(parts));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}