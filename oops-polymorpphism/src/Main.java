//                            polymorphism-
//                                 |
//                             many forms
//1.water=solid,liqued,gas
//2.shapes=circuler,triangle,rectangle

//       type of polymorphism--

//1.compile time polymorphism(static polymorphism)
//  we can achieve that by= "mathod overloading"
//  isko compiler handle karta h

//2.run time polymorphism(dynamic polymorphism)
//we can achieve that by="matod overriding"
// isko jvm handle karta h



// "method overloading"            |      "method overriding"
//  1.same name                    |       1.same name
//  2.same class                   |       2.diff class
//  3.diff arguments               |       3.same arguments-
//  -no of arguments-              |          -no of arguments
//  -sequence of arguments         |          -sequence of arguments
//  -type of arguments             |          -type of arguments
//                                          4.inheritancce (is_a relasonship)

//                                  " method overloading"--

// 1. no of arguments are diff-

//
//class student {
//    public void dit(String a){
//        System.out.println(a);
//    }
//    public void dit(String a,String b){
//        System.out.println(a+"  "+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student s=new student();
//        s.dit("ayush");
//        s.dit("ayush","arpit");
//    }
//}

 //2. sequence of arguments -


//class student {
//    public void dit(String b,int a){
//        System.out.println(b+" "+a);
//    }
//    public void dit(int a,String b){
//        System.out.println(a+"  "+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student s=new student();
//        s.dit("ayush",13);
//        s.dit(24,"arpit");
//    }
//}

//3. type of arguments-

//class student {
//    public void dit(int a,int b){
//        System.out.println(b+" "+a);
//    }
//    public void dit(int a,String b){
//        System.out.println(a+"  "+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student s=new student();
//        s.dit(15,13);
//        s.dit(24,"arpit");
//    }
//}

//                                 method overriding--

//1.no of arguments--

class student{

    public void dit(){

        System.out.println("ayush");
    }
}
class student1 extends student{

    public void dit(){

        System.out.println("arpit");
    }
}
public class Main {
    public static void main(String[] args) {
        student s1=new student();
        s1.dit();
        student1 s2=new student1();
        s2.dit();

    }
}

// 2.type of arguments--

//class student{
//
//    public void dit(String a){
//
//        System.out.println(a);
//    }
//}
//class student1 extends student{
//
//    public void dit(String b){
//
//        System.out.println(b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student s1=new student();
//        s1.dit("ayush");
//        student1 s2=new student1();
//        s2.dit("arpit");
//
//    }
//}

//3.sequence of arguments--

//
//class student{
//
//    public void dit(String a,int b){
//
//        System.out.println(a+" "+b);
//    }
//}
//class student1 extends student{
//
//    public void dit(String a,int b){
//
//        System.out.println(a+" "+b);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        student s1=new student();
//        s1.dit("ayush",121);
//        student1 s2=new student1();
//        s2.dit("arpit",124);
//
//    }
//}
