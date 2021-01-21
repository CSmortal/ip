package main.java;

public class Deadline extends Task {
    private String doneBy;

    public Deadline(String description, String doneBy) {
        super(description);
        this.doneBy = doneBy;
    }

    public Deadline(String description, String doneBy, boolean isDone) {
        super(description, isDone);
        this.doneBy = doneBy;
    }

    @Override
    public Deadline markAsDone() {
        return new Deadline(description, doneBy, true);
    }

    @Override
    public String toString() {
        return "[D][" + getStatusIcon() + "] " + description + " (by: " + doneBy + ")";
    }

}