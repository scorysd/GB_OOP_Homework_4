import java.io.IOException;
import java.util.ArrayList;
class DBTask implements Task {
    protected ArrayList<String> tasks;
    protected Priority priority;

    public DBTask(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
    @Override
    public void addTask() {

    }
    @Override
    public void delTask(int num) {
        tasks.remove(tasks.get(num));
    }
    @Override
    public void save() throws IOException {
    }
    @Override
    public void load() throws IOException {

    }
    @Override
    public void setPriority(int num, Priority priority) {
        tasks.get(num);
        this.priority = priority;
        System.out.println("Необходимо срочно выполнить - " + tasks.get(num));
    }
}
