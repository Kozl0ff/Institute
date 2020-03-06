public class MyClass {
    public static void main (String[] args){
        Staff staff = new Staff(Position.PROFESSOR);
        Staff staff1 = new Staff(Position.ASPIRANT);
        Staff staff3 = new Staff(Position.DEKAN);
        Staff staff2 = new Staff(Position.DOCENT);
        staff.doIt(staff1);
        staff2.doIt(staff1);

        staff2.giveTask(new Task("LALALA",Position.ASPIRANT));

    }
}
