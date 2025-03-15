package taskmanagement;

import observer.Subject;

public class Task extends Subject {
    private String taskName;
    private String status;

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Not Started";
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers("Task [" + taskName + "] changed to: " + newStatus);
    }
}
