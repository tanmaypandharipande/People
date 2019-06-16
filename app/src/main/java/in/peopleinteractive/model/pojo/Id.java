package in.peopleinteractive.model.pojo;

/**
 * Created by tanmay on 16/06/19.
 */

public class Id {
    private String name;
    private String value;

    public Id(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Id() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Id{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

