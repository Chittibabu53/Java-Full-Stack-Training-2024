public class CountingSpecificCharachters {

    public static void  main (String [] args){
                String text = "hello world";
                char target = 'l';
                int count = 0;

                System.out.println(text.length());

                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == target) {
                        count++;
                    }
                }

                System.out.println("The character " + target + " appears " + count + " times in the string.");
            }
        }



