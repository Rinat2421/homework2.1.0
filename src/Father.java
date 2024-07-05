public class Father extends GrandFather{

    String work;

    public String getWork() {
        return work;
    }

    public Father(int age, String name, Occupation occupation, Country country, String work) {
        super(age, name, occupation, country);
        this.work = work;
    }

    public void whatAreYouDoingToday() {
        System.out.println("I'm working");
    }

    final public void whatAreYouDoingToday(String whatIdo) {
        System.out.println(whatIdo);
    }

    @Override
    public String toString() {
        return super.toString() + " working " + work;
    }




}
