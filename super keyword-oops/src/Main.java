                                  // super keyword==
// super keyword is a reference variable whic is used to refer immediate parent class object
//                                  class a{
//                                  int a=10;
//                                  }
//                                  class b extends a{
//                                      int a=20;
//                                      void show (int a){
//                                          //  System.out.println(a);===30
//                                          // System.out.println(super.a);====10
//                                          System.out.println(this.a); //===20
//                                      }
//
//                                      public static void main(String[] args) {
//                                          b ayush=new b();
//                                          ayush.show(30);
//                                          // ayush.show();
//                                      }
//                                  }

// 2."super" keyword can be used to invoke immediate parent class method.
//class a1{
//    void m1(){
//        System.out.println("my name is lakhan");
//    }
//}
//class b1 extends a1{
//    void m1(){
//        System.out.println("may name is ram");
//    }
//    void show() {
//        m1();// my name is lakhan
//        super.m1();//my name is ram
//    }
//
//    public static void main(String[] args) {
//        b1 arpit=new b1();
//        arpit.show();
//    }
//}

// 3.="super()" can be used to invoke immediate parent class constructor==

class a{
    a(){
        System.out.println("may name is puspa ");
    }
}
class b extends a {
    b(){
        System.out.println("my name  is kamal");
    }
}
public class Main {
    public static void main(String[] args) {
        b ay=new b();
    }
}