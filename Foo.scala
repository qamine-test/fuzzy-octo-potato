public class Foo {

    public boolean myBoolean = false;

    void bar() {
        //#Warn: java_basic_ForLoopShouldBeWhileLoop
        for (;true;) true; // No Init or Update part, may as well be: while (true)
    }
}
