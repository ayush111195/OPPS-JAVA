//1.

//class student {
//    int i;
//
//    public void rollno(int i) {
//        this.i = i;
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        student s=new student();
//        s.rollno(12);
//    }
//}


//"2.this keyword can be use to invoke current class method"--
//
//class human{
//     public void display(){
//        System.out.println(" jay shri ram");
//    }
//    public void show(){
//
//
//       this. display() ;         // {yhan dispaly ke aage by default this keywordl gya h}
//    }
//
//    public static void main(String[] args) {
//        human h=new human();
//        h.display();
//   }
//}

//3. "this()" keyword can we use to invoke current class constructor;--

//class students {
//    students(){
//      //  this(10);          // agr yhan this() lga rahe to neeche wala call ho gya but uske sath veriable
//                              //  ke value bhi likhni pdti h
//        System.out.println("jay shri raam");
//    }
//    students(int a){
//     this();                  //  agr yhan this() lga rahe to upr wala  call ho jayega
//        System.out.println(a+"jay shri krishna");
//    }
//    public static void main(String[] args) {
//    //System.out.println();
//    students s1=new students(10);
//     //   students s1=new students();
//
//
//        //  {students object agr khali rehta h to bass jay shri ram print hoga
//                                      //  agr ismain int ki value put kar de to a+jay shri krihna print hoga}\
//
//           //  note=agr hum jay shri ram and jay shri krishna dono print karwana chahte h to use the {("this()")}
//    }
//}
//// 4.=this keyword refer's to the current class trance variable--
class a{
    int a=10;
}
class b extends a{
    int a=20;
          void show (int a){
        // System.out.println(a);//===30
         System.out.println(super.a);//====10
              System.out.println(this.a);
    }

    public static void main(String[] args) {
        b ayush=new b();
        ayush.show(50);
       // ayush.show();
    }
}