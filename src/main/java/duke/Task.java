package main.java.duke;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String fileFormat() {
        return this.getClass().toString() + " | " + (isDone ? "1 | " : "0 | ") + this.description;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public Task markAsDone() {
        return new Task(description, true);
    }

    @Override
    public String toString() {
        return description;
    }
}