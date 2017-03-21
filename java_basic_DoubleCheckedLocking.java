//#Patterns: java_basic_DoubleCheckedLocking

public class Foo {
    Object baz;
    //#Warn: java_basic_DoubleCheckedLocking
    Object bar() {
        if (baz == null) { // baz may be non-null yet not fully created
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }
}