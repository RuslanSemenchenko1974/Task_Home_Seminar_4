import java.util.Scanner;
public class InputNamber {
    public static int InputN() {
        Boolean check = true;
        int str = 0;
        while(check){
    try{
        Scanner  scan = new Scanner(System.in);
        System.out.print("Введите размерность LinkedList:");
        str = scan.nextInt();
        check = false;
        return str;
        }
    catch (Exception ex){
        System.out.println("Ошибка ввода!");
        System.out.println(ex);
        }
        }
        return str;
    }
    public static int InputNam() {
        Boolean check = true;
        int str = 0;
        while(check){
    try{
        Scanner  scan = new Scanner(System.in);
        System.out.print("Введите целое число:");
        str = scan.nextInt();
        check = false;
        return str;
        }
    catch (Exception ex){
        System.out.println("Ошибка ввода!");
        System.out.println(ex);
        }
        }
        return str;
    }
    public static float InputFloat() {
        Boolean check = true;
        Float str = 0.0f;
        while(check){
    try{
        Scanner  scan = new Scanner(System.in);
        str = scan.nextFloat();
        check = false;
        return str;
        }
    catch (Exception ex){
        System.out.println("Ошибка ввода!");
        System.out.println(ex);
        System.out.print("Введите число: ");
        }
        }
        return str;
    }
}
