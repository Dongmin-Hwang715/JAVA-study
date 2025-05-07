package java_10_기본;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<Message>();

        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "감자바"));

        while (!queue.isEmpty()) {
            Message message = queue.poll();
            String command = message.command;
            String to = message.to;

            if (command.equals("sendMail")) {
                System.out.println(to + "님에게 메일을 보냅니다.");
            } else if (command.equals("sendSMS")) {
                System.out.println(to + "님에게 SMS를 보냅니다.");
            } else {
                System.out.println(to + "님에게 카카오톡을 보냅니다.");
            }
        }
    }
}
