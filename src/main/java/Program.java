import calculator.Context;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {    //1:45:00 --> throws IOException
        //1:44:10 має сенс створити ітерактивний тест на клавіатурі
        System.out.println("Welcome to integer Calculator!"); //1:44:30 Hello -->
        //1:45:00
        Context calc = new Context();
        while (true) {
            char key = (char) System.in.read();
            if (key >= ' ') { //щоб не оброблялась клава Enter !!!
                calc.press(key);
                System.out.println(calc);
            }
        }

    }
}
