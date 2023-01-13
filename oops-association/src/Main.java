
//relationship b/w classs=

//        1.inheritance                                      2.association
//                                                                  |
//                                                       1.aggregation     2.composition
//                                                          (weak)            (strong)
class student {
    String name;
    String school;
    int rollno;
    address add;            //(ye neeche wali class ko use kr liya)
    public void detalis(String a,String b,int c,address d){
        name=a;
        school=b;
        rollno=c;
        add=d;


        System.out.println("my name is" + name+"  "+"my school name is-"+ school+"  "+"my roll no is-"+rollno+" "
                + add.city+ add.state+add.pincode);
    }
}
class address{

    String city;
    String state;
    int pincode;

    address(String city,String state,int pincode){
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
}
public class Main{
    public static void main(String[] args) {
        address a=new address("orai","u.p.",285001);
        student s=new student();
        s.detalis("ayush gupta","s.v.m.",121,a);

    }

}
