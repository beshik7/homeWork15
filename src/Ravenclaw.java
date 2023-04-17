class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    private String studentName;


    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity, String studentName) {
        super(magicPower, transgressionDistance, studentName);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        this.studentName = studentName;

    }
    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
    public String getStudentName() {
        return studentName;
    }


    @Override
    public int getTotalPoints() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return "Когтевран {" + super.toString() + ", ум: " + intelligence + ", мудрость: " + wisdom + ", остроумие: " + wit + ", творчество: " + creativity + '}';
    }
}