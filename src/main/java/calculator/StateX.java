package calculator;

public class StateX extends State {
    void clear(Context context) {   //1:38:00 давайте ми реалізуємо кнопку сбросу
        context.x = 0;
        context.y = 0;
        context.o = '+';    //1:38:45 щоб вже якась дія вже була записана
    }

    void digit(Context context, char key) { //1:40:40 якщо ми натиснули цифру - нам її потрібно прикліяти до Context
        //context.x += key;                                         //it`s rude and wrong
        //context.x = context.x * 10 + (key - '0');                      //the 1st way love in C to use
        context.x = context.x * 10 + Character.getNumericValue(key);     //there is a more competent way

    }

    void arifm(Context context, char key) {
        //1:55:00 коли ми натискуємо на операцію, що трапляється - зміна стану Context
        context.state = new StateAction(); // !!!ми кажемо, що потрібно йти в інший кабінет

        //context.press(key);
        context.state.arifm(context, key);  //ці 2-і дії роблять одне й те ж

    }

    void equal(Context context) {
        //1:58:28 реалізуємо натиснення знака "="
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
