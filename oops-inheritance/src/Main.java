// inheritance -parents class ke properties and behaviour child class main a jana ...
// iske leye hum log -(extends)- keyword ka use karte h ....


class animal{  // parents class
    String name;

    public void det(String a ){
        name=a;
        System.out.println("the name is -"+name);
    }
}
class dog extends animal{    // child class               & extends keyword ka use --

}
public class Main {
    public static void main(String[]args){
        dog d1=new dog();
        d1.det("harry");


//        ( agar hum yan par dog class ka object  bna kr usmain animal class ka-
//           object ko call karenge to calll nhi hoga )
//                                 --to hum logo ko dog class main -(extends)+ uske sath uss class ko bhi likhte h
//                                 jiska method call karna h  ka use karna padega

//note- inheritance=  (parents and child class ke beech main )2 class ke beech main "ia a " relantion ko bnata h
        // dog "is a " animal.
    }
}

//type of inheritance-

// 1.single inheritance-

//class a{
//    String name;
//    public void  ayu (String x){
//        name=x;
//        System.out.println(name);
//    }
//}
//
//class b extends a{
//}
//public class Main {
//
//    public static void main(String[] args) {
//        b print=new b();
//        print.ayu("harry");
//
//    }
//}
//  {note- inheritance ka use "constructor" wale case main nhi hota}
//  {note2- inheritance ka use "private method" wale case main nhi hota}

// 2.multilaved inheritance-

//class a{
//    String name;
//    public void  ayu (String x){
//        name=x;
//        System.out.println(name);
//    }
//}
//
//class b extends a{
//
//}
//
//class c extends b{
//
//}
//public class Main {
//
//    public static void main(String[] args) {
//        c print = new c();
//        b prints=new b();
//        print.ayu("harry");
//        prints.ayu("ayush");
//    }
//}

//3.hernical inheritance=

/*class a{
    String name;
    public void  ayu (String x){
        name=x;
        System.out.println(name);
    }
}

class b extends a{

}

class c extends a  {

}
public class Main {

    public static void main(String[] args) {
        c print = new c();
        b prints = new b();
        print.ayu("harry");
        prints.ayu("ayush");
    }
}*/