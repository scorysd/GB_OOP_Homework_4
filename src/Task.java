import java.io.IOException;

interface Task {
    void addTask();
    void delTask(int num);
    void save()throws IOException;
    void load() throws IOException;
    void setPriority(int num, Priority priority);
}
