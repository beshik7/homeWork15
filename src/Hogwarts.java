abstract class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String studentName;


    public Hogwarts(int magicPower, int transgressionDistance, String studentName) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.studentName = studentName;

    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public String getStudentName() {
        return studentName;
    }

    public abstract int getTotalPoints();


    public void displayStudentInfo(String studentName, String houseName, int[] houseQualities) {
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + studentName);
        System.out.println("Факультет: " + houseName);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
        System.out.println("Качества факультета:");

        for (int i = 0; i < houseQualities.length; i++) {
            System.out.println("Качество " + (i + 1) + ": " + houseQualities[i]);
        }
    }



    @Override
    public String toString() {
        return "Мощность магии: " + magicPower + ", Расстояние трансгрессии: " + transgressionDistance;
    }
}