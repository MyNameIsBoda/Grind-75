import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args)
    {
        //-------- Two Sum --------
//        int[] args = {0, 1, 2};
//        runFile("./test-data/twoSum.txt", args);
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static void runFile(String path, int[] args)
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