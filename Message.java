package Exception;

import java.util.Locale;
import java.util.Scanner;

public class Message {
    public void Moodanalyzer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = sc.nextLine();
        String mood = analyzwMood(message);
        System.out.println("you seem" + mood + "!");
    }

    public static String analyzwMood(String message) {
        String[] happyKeywords = {"happy", "joy", "excited", "awesome", "good", "amazing", "fantastic", "mindblowing"};
        String[] sadKeywords = {"sad", "unhappy", "disappointed", "bad", "lonely"};
        for (String keyward : happyKeywords) {
            if (message.toLowerCase().contains(keyward)){
                return "happy";
            }
        }
        for (String keyword : sadKeywords) {
            if (message.toLowerCase().contains(keyword)){
            return "sad";
            }
        }
        return "neutral";
    }
        public static void main (String[]args){
            Message obj = new Message();
            obj.Moodanalyzer();
        }

}