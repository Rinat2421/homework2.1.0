final public class Son extends Father{
    private String college;

    public Son(int age, String name, Occupation occupation, Country country, String work, String college) {
        super(age, name, occupation, country, work);
        this.college = college;
    }

    @Override
    public void whatAreYouDoingToday() {
        System.out.println("I'm going studying to in " + college);
    }
}
