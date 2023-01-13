                  //  how to create class,object,methods,=

    //object ko initialization karna =

    //1.by refrance variable-

 /*   class animal {
        String  color;
        String name;
        String  type;
        int age;
        public void printDetails(){
            System.out.println("name is -"+name);
            System.out.println("the type -"+type);
            System.out.println("the color is-"+color);
            System.out.println("the age is-"+age);
        }
    }
    public class Main {

        public static void main(String[] args) {
            animal dog = new animal();
            dog.name = "harry";
            dog.age = 8;
            dog.color = "white";
            dog.type = "indian";
            dog.
            printDetails();
        }
    }*/

    //2.by method variable-

class animal{
    String  color;
    String name;
    String  type;
    int age;
    public void printDetails(String a,String b,String c,int d){
        String color=a;
        String name=b;
        String type=c;
        int age=d;
        System.out.println("name is -"+name);
        System.out.println("the type -"+type);
        System.out.println("the color is-"+color);
        System.out.println("the age is-"+age);
    }
}
    public class Main {

        public static void main(String[] args){
            animal dog=new animal();

            dog.printDetails("white","harry","indian",18);

}
}



    //3.by useing  constuctors-

  /*  class animal{
               String  name;
               String color;
               String  type;
               int age;
     animal(String name , String color , String type , int age ){
        this.name=name;
        this.color=color;
        this.type=type;
        this.age=age;

            }
    }

    public class Main {

        public static void main(String[] args) {
            animal d1 = new animal("harry", "black", "indian", 12);

            System.out.println(d1.name+  d1.color  +  d1.type +  d1.age);
        }

    }*/






