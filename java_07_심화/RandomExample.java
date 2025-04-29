package java_07_심화;

import java.util.ArrayList;

public class RandomExample {
    public static void main(String[] args) {
        ArrayList<Integer> select = new ArrayList<>();
        ArrayList<Integer> hit = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            while (select.size() == i){
                int rand = (int) (Math.random() * 45) + 1;
                if (!select.contains(rand)){
                    select.add(rand);
                }
            }
            while (hit.size() == i){
                int rand = (int) (Math.random() * 45) + 1;
                if (!hit.contains(rand)){
                    hit.add(rand);
                }
            }
        }
        select.sort(Integer::compareTo);
        hit.sort(Integer::compareTo);
        System.out.println(select);
        System.out.println(hit);

        if (select.equals(hit)){
            System.out.println("1등입니다.");
        } else {
            System.out.println("1등이 이납니다.");
        }
    }
}
