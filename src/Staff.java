public class Staff {
    private String name;
    private Task task;
    private Staff staff;
    private Position position;

    public Staff(Position position) {
        this.position = position;
    }

    public void doIt(Staff staff){
        if(position.getPosition() >= staff.position.getPosition()){
            throw new IllegalArgumentException("LALALLALALA");
        }
        this.staff = staff;
    }

    public void giveTask(Task task){
        if(task.getTask().getPosition() < position.getPosition()){
            throw new IllegalArgumentException("!");
        }

        if (task.getTask().getPosition() > position.getPosition()){
            if (staff!= null){
                staff.giveTask(task); return;
            }
            System.out.println(position + ": ");
            task.justDoIt();
        }
    }
}
