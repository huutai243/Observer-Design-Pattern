package taskmanagement;

import observer.Observer;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received task update: " + message);
    }
}
