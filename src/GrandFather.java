public class GrandFather {
    private int age;
    private String name;
    private Occupation occupation;
    private Country country;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public Country getCountry() {
        return country;
    }

    public GrandFather(int age, String name, Occupation occupation, Country country) {
        this.age = age;
        this.name = name;
        this.occupation = occupation;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Name " + name + " Age is " + age + " occupation is " + occupation + " from country " + country.getCountryName()+ " city " + country.getCity();
    }
}
