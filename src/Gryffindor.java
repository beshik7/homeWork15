class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private String studentName;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int courage, String studentName) {
        super(magicPower, transgressionDistance, studentName);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.studentName = studentName;

    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return courage;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    @Override
    public int getTotalPoints() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return "Гриффиндор {" + super.toString() + ", благородство: " + nobility + ", честь: " + honor + ", храбрость: " + courage + '}';
    }
}