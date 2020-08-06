 class MyEx extends Exception { }
 class MyExTest {
     static int i=0;

     static void f() throws MyEx {
         if(i==7) throw new MyEx(); }

     public static void main(String[] args) {
         do {
           try { f(); }
           catch(MyEx e) {
                System.out.println("i="+i);
                e.printStackTrace();     }
            }
         while (i++<10);
    }
  }
