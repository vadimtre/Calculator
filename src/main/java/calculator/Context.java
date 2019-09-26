package calculator;

public class Context {
    int x;
    int y;
    char o;
    State state;

    public Context() {  //1:42:40 нам потрібно state створити в конструкторі класа
        state = new StateX();
        state.clear(this);
        //1:43:45 створити конструктор Context, який присвоює початкове значення для цієї зміной

    }

    public void press(char key) {
        switch (key) {  //1:30:20
            case 'c':
            case 'C':
                state.clear(this);
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                state.digit(this, key);
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                state.arifm(this, key);
                break;
            case '=':
                state.equal(this);


        }
    }

    public int run(String keys) {    //C2+3=
        for (char key : keys.toCharArray())
            press(key);
        return x;
    }

    /*1:48:15 шоб так не виводило ми реалізуємо функцію, яка буде виводити не те що на екрані, а весь стан калькулятора
        Welcome to integer Calculator!
        5
        calculator.Context@154617c */
    @Override //1:52:00 --> @Override
    public String toString() {
        return "x=" + x + "" +
                "   y=" + y +
                "   op=" + o +
                "    state=" + state.getClass().getName();
    }

}
