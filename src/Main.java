public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor(90, 100, 85, 95, 92, "Гермиона");
        Gryffindor ron = new Gryffindor(80, 90, 70, 80, 75, "Рон");
        Hufflepuff zacharias = new Hufflepuff(85, 95, 88, 91, 89, "Захария");
        Hufflepuff cedric = new Hufflepuff(95, 110, 90, 92, 93, "Седрик");
        Ravenclaw cho = new Ravenclaw(92, 102, 97, 98, 95, 96, "Чжоу");
        Ravenclaw padma = new Ravenclaw(89, 99, 94, 93, 92, 91, "Падма");
        Slytherin draco = new Slytherin(88, 98, 85, 86, 87, 88, 89, "Драко");
        Slytherin gregory = new Slytherin(82, 92, 80, 79, 78, 77, 76, "Грегори");

        hermione.displayStudentInfo("Гермиона", "Гриффиндор", new int[]{hermione.getNobility(), hermione.getHonor(), hermione.getBravery()});
        System.out.println();
        ron.displayStudentInfo("Рон", "Гриффиндор", new int[]{ron.getNobility(), ron.getHonor(), ron.getBravery()});
        System.out.println();
        zacharias.displayStudentInfo("Захария", "Пуффендуй", new int[]{zacharias.getDiligence(), zacharias.getLoyalty(), zacharias.getHonesty()});
        System.out.println();
        cedric.displayStudentInfo("Седрик", "Пуффендуй", new int[]{cedric.getDiligence(), cedric.getLoyalty(), cedric.getHonesty()});
        System.out.println();
        cho.displayStudentInfo("Чжоу", "Когтевран", new int[]{cho.getIntelligence(), cho.getWisdom(), cho.getWit(), cho.getCreativity()});
        System.out.println();
        padma.displayStudentInfo("Падма", "Когтевран", new int[]{padma.getIntelligence(), padma.getWisdom(), padma.getWit(), padma.getCreativity()});
        System.out.println();
        draco.displayStudentInfo("Драко", "Слизерин", new int[]{draco.getCunning(), draco.getDetermination(), draco.getAmbition(), draco.getResourcefulness(), draco.getThirstForPower()});
        System.out.println();
        gregory.displayStudentInfo("Грегори", "Слизерин", new int[]{gregory.getCunning(), gregory.getDetermination(), gregory.getAmbition(), gregory.getResourcefulness(), gregory.getThirstForPower()});
        System.out.println();

        compareGryffindorStudents(hermione, ron);
        compareHufflepuffStudents(zacharias, cedric);
        compareRavenclawStudents(cho, padma);
        compareSlytherinStudents(draco, gregory);

        compareMagicPowerAndTransgressionDistance(hermione, draco);
        compareMagicPowerAndTransgressionDistance(zacharias, padma);
    }
        public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
            int totalPoints1 = student1.getNobility() + student1.getHonor() + student1.getHonor();
            int totalPoints2 = student2.getNobility() + student2.getHonor() + student2.getHonor();
            if (totalPoints1 > totalPoints2) {
                System.out.println(student1.getStudentName() + " лучший Гриффиндорец.");
            } else if (totalPoints1 < totalPoints2) {
                System.out.println(student2.getTotalPoints() + " лучший Гриффиндорец.");
            } else {
                System.out.println("Оба ученика Гриффиндора имеют одинаковые баллы.");
            }
            System.out.println();
        }

        public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
            int totalPoints1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
            int totalPoints2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
            if (totalPoints1 > totalPoints2) {
                System.out.println(student1.getStudentName() + " лучший Пуффендуй.");
            } else if (totalPoints1 < totalPoints2) {
                System.out.println(student2.getStudentName() + " лучший Пуффендуй.");
            } else {
                System.out.println("Оба ученика Пуффендуя имеют одинаковые баллы.");
            }
            System.out.println();
        }

        public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
            int totalPoints1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
            int totalPoints2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
            if (totalPoints1 > totalPoints2) {
                System.out.println(student1.getStudentName() + " лучший Когтевранец.");
            } else if (totalPoints1 < totalPoints2) {
                System.out.println(student2.getStudentName() + " лучший Когтевранец.");
            } else {
                System.out.println("Оба ученика Когтеврана имеют одинаковые баллы.");
            }
            System.out.println();
        }

        public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
            int totalPoints1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
            int totalPoints2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
            if (totalPoints1 > totalPoints2) {
                System.out.println(student1.getStudentName() + " лучший Слизеринец.");
            } else if (totalPoints1 < totalPoints2) {
                System.out.println(student2.getStudentName() + " лучший Слизеринец.");
            } else {
                System.out.println("Оба ученика Слизерина имеют одинаковые баллы.");
            }
            System.out.println();
        }

    public static void compareMagicPowerAndTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        int totalPoints1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int totalPoints2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (totalPoints1 > totalPoints2) {
            System.out.println(student1.getStudentName() + " сильнее в магии и менее склонен к нарушениям правил.");
        } else if (totalPoints1 < totalPoints2) {
            System.out.println(student2.getStudentName() + " сильнее в магии и менее склонен к нарушениям правил.");
        } else {
            System.out.println("Оба ученика имеют одинаковую силу магии и склонность к нарушениям правил.");
        }
    }

            }
