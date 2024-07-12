package SystemClassPractice;

import java.io.Console;

public class Practice1 {
    public static void main(String[] arg) {
        Console c = System.console();
        System.out.println("username : ");
        String username = c.readLine();
        System.out.println("password : ");
        char[] password = c.readPassword();
        System.out.println("username : " + username );

        for (char x : password)
            System.out.print(x);
    }
}
