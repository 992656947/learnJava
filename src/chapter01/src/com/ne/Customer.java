package chapter01.src.com.ne;

public class Customer {
    private int cid;
    private String name;
    private String gender;
    private int age;
    private String email;

    public Customer(int cid, String name, String gender, int age, String email) {
        this.cid = cid;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}