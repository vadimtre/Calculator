package calculator;

public class StateAction extends State {

    void clear(Context context) {
        //2:01:50 ми повинні змінити Context
        context.state = new StateX();
        context.state.clear(context);
    }

    void digit(Context context, char key) {

    }

    void arifm(Context context, char key) {
//2:04:50 ми залишаємось на місті єдина ми встановлюємо клавішу
        context.o=key;
    }

    void equal(Context context) {

    }
}
