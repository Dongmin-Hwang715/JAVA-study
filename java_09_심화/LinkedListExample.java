package java_09_심화;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Board> boards = new LinkedList<>();

        for (int i = 0; i < 5; i++){
            boards.add(new Board());
        }

        System.out.println(boards.size());
        System.out.println("-----------------------");

        System.out.println(boards.get(2));
        System.out.println("-----------------------");

        for (int i = 0; i < 5; i++){
            System.out.println(boards.get(i));
        }
        System.out.println("-----------------------");

        boards.remove(2);
        boards.remove(2);
        for (Board board : boards){
            System.out.println(board);
        }
    }
}
