class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;
    private String studentName;


    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty, String studentName) {
        super(magicPower, transgressionDistance, studentName);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.studentName = studentName;
    }
    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public String getStudentName() {
        return studentName;
    }


    @Override
    public int getTotalPoints() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй {" + super.toString() + ", трудолюбие: " + diligence + ", верность: " + loyalty + ", честность: " + honesty + '}';
    }
}
