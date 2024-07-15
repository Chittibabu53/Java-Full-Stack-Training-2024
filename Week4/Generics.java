  class Sample<T,K>{

    public Sample(T item,K item2){
           this.item=item;
           this.item2=item2;
       }
      public T item;
      public K item2;


      public void setItem(){
          System.out.println(item);
          System.out.println(item2);

      }

      public  T getItem(){
          return item;
      }

}


public class Generics {

    public static void main(String [] args){

        Sample<Integer,String> obj=new Sample<>(1,"jimmy");

        obj.setItem();

        System.out.println(ClassLoader.getPlatformClassLoader());



    }
}
