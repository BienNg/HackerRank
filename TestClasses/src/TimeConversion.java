import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String[] times = input.split(":");
        String hour = times[0];
        String minute = times[1];
        String second = times[2].charAt(0)+""+ times[2].charAt(1);
        String daytime = times[2].charAt(2)+ "" +times[2].charAt(3);
        int hourInt = Integer.parseInt(hour);

        if(daytime.equals("PM")){
            if(hourInt != 12){
                hourInt += 12;
                hour = hourInt+"";
            }
        }else{
            if(hourInt == 12){
                hour = "00";
            }
        }
        System.out.println(hour +":"+ minute + ":" + second);
    }
}
