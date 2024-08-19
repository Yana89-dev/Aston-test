import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i ; // перейти к  классу - CTRL + N
        //System.out.println(i);
        System.out.println(Object.class.getClassLoader());
        System.out.println(String.class.getClassLoader());

        System.out.println(DriverManager.class.getClassLoader()); // по работе с базами данных
        System.out.println(Main.class.getClassLoader());

    }
}