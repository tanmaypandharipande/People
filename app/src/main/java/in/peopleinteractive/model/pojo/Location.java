package in.peopleinteractive.model.pojo;

/**
 * Created by tanmay on 16/06/19.
 */

public class Location {
    private String street;
    private String city;
    private String state;
    private String postcode;
    private Coordinates coordinates;
    private Timezone timezone;

    public Location(String street, String city, String state, String postcode, Coordinates coordinates, Timezone timezone) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }

    public Location() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postcode=" + postcode +
                ", coordinates=" + coordinates +
                ", timezone=" + timezone +
                '}';
    }
}
