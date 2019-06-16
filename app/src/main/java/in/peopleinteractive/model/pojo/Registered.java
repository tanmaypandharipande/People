package in.peopleinteractive.model.pojo;

/**
 * Created by tanmay on 16/06/19.
 */

public class Registered {
    private String date;
    private int age;

    public Registered(String date, int age) {
        this.date = date;
        this.age = age;
    }

    public Registered() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dob{" +
                "date='" + date + '\'' +
                ", age=" + age +
                '}';
    }
}
