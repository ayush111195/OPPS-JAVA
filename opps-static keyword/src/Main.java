//static keyword ka use =
//1.variable(class level){local variable ke sath use nhi kar skte}
//2.methods
//3.block
//4.inner class(nested class)

                                //            1.variable=
//jab kisse variable ke sath static lga dete hto wo static variable bn jata h....
// class level variable hi static variable main change ho skte h local variable nhi...


//class a{
//    static int i=500; //=== ye class level ka variable h iska static bna skte h .
//    void m1(){
//       int b=400; //=== ye local variable h iska static nhi bna skte.
//    }
//}

 class a{
    static int i=1000;
}
class b{
 public static void main(String[] args) {
  System.out.println(a.i);// *{static variable direct  class se blong karte h inko hum bina object bnaye call kar skte
                          // class ki help se}
 }
}

//                                 "" without static key""

//
//class employe{
//    int empid;
//    String compname;
//    String name;
//    employe(int empid,String compname,String name){
//        this.compname=compname;
//        this.empid=empid;
//        this.name=name;
//    }
//    void show(){
//        System.out.println(compname+"  "+name+"  "+empid);
//    }
//
//    public static void main(String[] args) {
//        employe e1=new employe(2315,"gupta's","ayushgupta" );
//        e1.show();
//        employe e2=new employe(1453,"gupta's","shivam");
//        e2.show();
//    }
//}
//**** iss program main sabi employee ki leye company ka name to same hi rehne wala h to usko baar baar kyun etner karta
//        iske leye we use "final keyword"


//                                     "" use of static key""

//class employe {
//    int empid;
//    static String compname = "gupta's"; //compname ka static variable bna diya
//    String name;
//
//    employe(int empid, String name) {       //yhan se string compname hta diya
//        this.empid = empid;
//        this.name = name;
//    }
//
//    void show() {
//        System.out.println(compname + "  " + name + "  " + empid);
//    }
//
//    public static void main(String[] args) {
//        employe e1 = new employe(2315, "ayushgupta");
//        e1.show();
//        employe e2 = new employe(1453, "shivam");
//        e2.show();
//    }
//}
//
//                                 //  2.methods
//static methods belongs to the class not  an object.


//                  jab method same class se call karna ho----

                                   //with out static key===

//class a{
//     void show(){
//        System.out.println("ramu");
//    }
//
//    public static void main(String[] args) {
//         a ay=new a();
//         ay.show();
//     }
//}
                            //with static key===
//  jab method same class se call karna ho....to direct kr skte h ..use with "static key"===


//class a{
//    static void show(){
//        System.out.println("ramu");
//    }
//
//    public static void main(String[] args) {
//        show();                               // method ko direct call kar skte h use with static key
//    }                                               objrct bnane ki need nhi h ..
//}

//jab method ko call karna ho child class se....

                           //""without static key""===

//class a {
//    void show(){
//   System.out.println("shyamu");
//    }
//}
//    class b extends a{
//    void show2(){
//
//        System.out.println("nandi");
//    }
//
//    public static void main(String[] args) {
//        b display =new b();
//        display.show2();
//    }
//
//}

//        class a {
//        static void show(){
//        System.out.println("shyamu");
//        }
//        }
//class b extends a{
//      static void show2(){
//
//        System.out.println("nandi");
//    }
//
//    public static void main(String[] args) {
//        a.show();
//        b.show2();     // agr dusri class main call karwana  ho to hum direct class ka=== "naam.method "
//        // likh kr call karwa skte h
//    }
//
//}