public class Task {
    private String task;
    private Position position;

    public Task(String task, Position position) {
        this.task = task;
        this.position = position;
    }

    public void justDoIt(){
        System.out.println(task);
    }
    public Position getTask(){
        return position;
    }
}
