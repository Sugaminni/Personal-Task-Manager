package TaskManager.comparator;
import TaskManager.model.Task;

import java.util.Comparator;

//Comparator to compare completion status
public class CompletionStatusComparator implements Comparator <Task>{

    @Override
    public int compare(Task t1, Task t2) {
        return Boolean.compare(t1.isComplete(), t2.isComplete());
    }
}
