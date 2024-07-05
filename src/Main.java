public class Main {
    public static void main(String[] args) {
        Country country = new Country("Kyrgyzstan", "Bishkek");

        Father father = new Father(47, "Amir", Occupation.Employee, country, "Yes");
        Son firstSon = new Son(22, "Karim", Occupation.Student, country, "No", "KGTK");
        Son secondSon = new Son(19, "Ruslan", Occupation.Student, country, "No", "KGIPI");

        System.out.println(father);
        System.out.println(firstSon);
        System.out.println(secondSon);

        System.out.println("-------------");

        father.whatAreYouDoingToday("I'm going to vacation");

        firstSon.whatAreYouDoingToday();
        secondSon.whatAreYouDoingToday();
    }
}

