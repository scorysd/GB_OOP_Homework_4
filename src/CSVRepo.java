import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVRepo extends DBTask{
    public CSVRepo(ArrayList<String> tasks) {
        super(tasks);
    }
    @Override
    public void save() throws IOException {
        FileWriter csvWriter = new FileWriter("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_4/src/data.csv");
        for (String s: tasks) {
            csvWriter.append(s);
            csvWriter.append('\n');
        }
        csvWriter.flush();
        csvWriter.close();
    }
    @Override
    public void load() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("/Users/romanversinin/IdeaProjects/GB_OOP_Homework_4/src/data.csv"));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            tasks.add(Arrays.toString(data));
        }
        csvReader.close();
        System.out.println(tasks);
    }
}
