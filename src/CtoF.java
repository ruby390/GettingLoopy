import java.util.Scanner;
public class CtoF {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String trash ="";
            int celciusTemp = 0;
            double farenheightTemp = 0;
            System.out.println("Enter a temperature in celcius");
            if(in.hasNextInt())
            {
                celciusTemp = in.nextInt();
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the temperature was " + trash);
                System.out.println("Run the program again enter a valid ammount.");
                System.exit(0);
            }
            farenheightTemp = celciusTemp - 32 * 0.556;
            System.out.println(celciusTemp + " in farenheight is " + farenheightTemp);
        }
}
