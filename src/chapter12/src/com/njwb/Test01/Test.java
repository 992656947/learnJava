package chapter12.src.com.njwb.Test01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Card<String, Integer> card1 = new Card<>("张三", 1234567890);
        Card<String, Integer> card2 = new Card<>("李四", 1234567890);
        Card<String, Integer> card3 = new Card<>("王五", 1234567890);
//        System.out.println(card1);

        ArrayList<Card<String, Integer>> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        for(Card<String, Integer> a:cardList){
            System.out.println(a);
        }
        System.out.println("----------------------------");
        cardList.remove(card3);
        for(Card<String, Integer> a:cardList){
            System.out.println(a);
        }

    }
}
