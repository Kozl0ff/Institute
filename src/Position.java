public enum Position {

    DEKAN(0),PROFESSOR(1),DOCENT(2),ASPIRANT(3);
    private int position;

    Position(int position) {
        this.position = position;
    }

    public int getPosition(){
        return position;
    }
}
