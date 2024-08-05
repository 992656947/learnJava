package chapter12.src.com.njwb.exec;

public class Linkman {
    private String name;
    private String phoneNumber;

    public Linkman() {
    }

    public Linkman(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(obj instanceof Linkman) {
            Linkman linkman = (Linkman) obj;
            if(linkman.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "联系人："+this.name+",联系电话："+this.phoneNumber;
    }
}
