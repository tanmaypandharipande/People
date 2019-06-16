package in.peopleinteractive.model.pojo;

/**
 * Created by tanmay on 16/06/19.
 */

public class Timezone {
    private String offset;
    private String description;

    public Timezone(String offset, String description) {
        this.offset = offset;
        this.description = description;
    }

    public Timezone() {
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Timezone{" +
                "offset='" + offset + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
