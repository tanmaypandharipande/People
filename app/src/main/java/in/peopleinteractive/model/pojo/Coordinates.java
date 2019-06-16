package in.peopleinteractive.model.pojo;

/**
 * Created by tanmay on 16/06/19.
 */

public class Coordinates {
    private String latitude;
    private String longitude;

    public Coordinates(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinates() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
