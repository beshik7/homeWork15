class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    private String studentName;


    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower, String studentName) {
        super(magicPower, transgressionDistance, studentName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        this.studentName = studentName;

    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
    public String getStudentName() {
        return studentName;
    }



    @Override
    public int getTotalPoints() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Слизерин {" + super.toString() + ", хитрость: " + cunning + ", решительность: " + determination + ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + thirstForPower + '}';
    }
}

