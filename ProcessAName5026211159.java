import java.util.Scanner;

public class ProcessAName5026211159 {

    public static void main(String[] args) {
        Scanner namadepan = new Scanner(System.in);
        System.out.println("Type Your Name here ==>");

        String namabelakang = namadepan.nextLine();
        int x  = namabelakang.indexOf (' ');

        String Format;
        Format = namabelakang.substring(x + 1) + "," + namabelakang.charAt(0)+ ".";

        System.out.println("Your name is ==>" + Format);

    }

}