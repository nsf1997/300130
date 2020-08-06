class A {
    int i=0;
    private void f(){ i=1; };
    void g(){ i=11; };
    A() { f(); }  // this f() can't be overridden
    A(boolean x) { g(); } // this g() can be overwritten
}

class B extends A {
    void f(){ i=9; }; // no overriding!
    public void g(){ i=99; };  // overriding
    public int h() { return i;}
    B() { super(); }
    B(boolean x) { super(x); }
}

class C {
    static B b1=new B(), b2=new B(), b3=new B(true);
    public static void main(String[] args) {
        b2.f();  // overloading: can't see A.f()
        System.out.println(b1.h()+","+b2.h()+","+b3.h());
    } // output of "java C": 1,9,99
}
