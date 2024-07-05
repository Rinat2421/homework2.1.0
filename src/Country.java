public class Country {
    private String countryName;
    private String city;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country(String countryName, String city) {
        this.countryName = countryName;
        this.city = city;
    }
}
