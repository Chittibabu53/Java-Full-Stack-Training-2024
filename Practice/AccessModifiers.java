


class Jimson  {

    private String name;
    private int age;



    Jimson(){
       this("jimk",66);
        System.out.println("empty");

 }
 Jimson(String name,int age){
     this.age=age;
     this.name=name;
     System.out.println("parameterized");
 }

 String method(){
     return name;

 }

 int method1(){

        return  age;
 }

Jimson(int cool){

}

    Jimson(Jimson another){
        this(another.name,another.age);
        System.out.println("copy");
 }

}




public  class AccessModifiers   {

    public static void main(String[] args) {

//   new Jimson();

     Jimson obj= new Jimson("subbu",12);



//    Jimson obj2= new Jimson(obj);


     String jimmy=obj.method();

        System.out.println(jimmy);



      

    }
}
