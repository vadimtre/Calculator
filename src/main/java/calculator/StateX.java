package calculator;

public class StateX extends State {
    void clear(Context context) {
        context.x = 0;
        context.y = 0;
        context.o = '+';
    }

    void digit(Context context, char key) {

    }

    void arifm(Context context, char key) {

    }

    void equal(Context context) {

    }
}
