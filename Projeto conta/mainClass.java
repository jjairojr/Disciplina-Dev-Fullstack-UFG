import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class mainClass {

    public static void main(String[] args) throws Exception, IOException {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.mainMenu(sc);
    }
}