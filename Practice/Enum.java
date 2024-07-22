
  enum Currency123 {
     INR(80),
     USD(1),
     IQD(1310),
     KD(0.30);

     private double rate; // Instance variable to hold rate
     private Object jimmy;

     // Constructor to initialize rate for each enum constant
     Currency123(double rate) {
         this.rate = rate;
     }

//     Currency123(int jimmy) {
//         this.jimmy = jimmy;
//     }


//     public int getJImmy() {
//         return jimmy;
//     }

     // Getter method to retrieve the rate for each currency
     public double getRate() {
         return rate;
     }


//      public int jimmy() {
////          System.out.println("jyothika");
//          return jimmy;
//      }
  }

    public class Enum {


        public static void main(String[] args) {

//            System.out.println(Currency123.INR.getRate());
//            System.out.println(Currency123.KD.getRate());
//            System.out.println(Currency123.IQD.getRate());
//            System.out.println(Currency123.USD.getRate());

         for(Currency123 val:Currency123.values()){
             System.out.println(val.getRate());
         }



        }
    }

