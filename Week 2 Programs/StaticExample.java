
    class Counter {
        static int count = 0;

//        Counter() {
//            count++;
//        }

        static void displayCount() {
            System.out.println("Number of instances created: " + count);
        }
    }

    public class StaticExample {
        public static void main(String[] args) {
//            Counter obj1 = new Counter();
//            Counter obj2 = new Counter();
//            Counter obj3 = new Counter();

//            Counter.displayCount();


            System.out.println( Counter.count);




        }
    }



