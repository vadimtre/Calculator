package calculator;

import static org.junit.Assert.assertEquals;

public class ContextTest {

    @org.junit.Test
    public void run() {
        Context context = new Context();
        int actual = context.run("C2+3=");
        int expect=5;
        assertEquals(expect,actual);

        assertEquals(0,context.run("C"));
        assertEquals(2,context.run("C2"));
        assertEquals(25,context.run("C25"));
        assertEquals(257452,context.run("C257452"));
        assertEquals(257452,context.run("C257452="));
        assertEquals(777,context.run("C123+654="));
        assertEquals(8,context.run("C2+2*2="));
        assertEquals(10,context.run("C5+="));
        assertEquals(20,context.run("C100/5="));
        assertEquals(56,context.run("C7*8="));
        assertEquals(2025,context.run("C45*45="));
        assertEquals(5625,context.run("C75*75="));
        assertEquals(57,context.run("C45-7*3/2="));
        assertEquals(1,context.run("C9/5="));
        assertEquals(0,context.run("C7575*000="));
        assertEquals(125,context.run("C25+-/*5="));
    }
}