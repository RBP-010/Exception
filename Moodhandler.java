package Exception;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Moodhandler {
    public  void mood(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mood:");
        String mood = sc.nextLine();
        String result = handlemood(mood);
        System.out.println("Mood:" +result);
    }
    public static String handlemood(String mood){
        try {
            if (mood == null){
                return "happy";
            }
            if (mood.equalsIgnoreCase("happy")||
            mood.equalsIgnoreCase("sad")||
            mood.equalsIgnoreCase("angry")){
                return mood.toLowerCase();
            }else {
                return "happy";
            }
        }catch (Exception e){
            return "happy";
        }
    }

    public static void main(String[] args) {
        Moodhandler obj = new Moodhandler();
        obj.mood();
    }
}
