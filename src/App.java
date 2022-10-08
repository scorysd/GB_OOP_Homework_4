import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
    DBTask a = new CSVRepo(new ArrayList<>());
    a.load();
    a.delTask(1);
    a.setPriority(0, Priority.HI);
    a.save();
    }
}

