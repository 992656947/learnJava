package chapter12.src.com.njwb.Test01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Card<T,K> {
    private T name;
    private K phone;

    public Card() {
    }

    public Card(T name, K phone) {
        this.name = name;
        this.phone = phone;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public K getPhone() {
        return phone;
    }

    public void setPhone(K phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
