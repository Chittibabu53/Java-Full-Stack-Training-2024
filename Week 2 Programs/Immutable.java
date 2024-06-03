public class Immutable {
        public static void main(String[] args) {



                    String s="Sachin";
                    System.out.println(System.identityHashCode(s));
                   s= s.concat(" Tendulkar");//concat() method appends the string at the end
                    System.out.println(System.identityHashCode(s));//will print Sachin because strings are immutable objects

            int num=10;

            System.out.println(System.identityHashCode(num));

            num=num/2;


            System.out.println(System.identityHashCode(num));



                }
            }












