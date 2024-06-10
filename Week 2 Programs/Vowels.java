public class Vowels {


    public static void main(String [] args){

        char [] array={'a','e','i','o','u'};

        String example= """
                hi bro how are you
                """;
        int count=0;

        for(int i=0;i<example.length();i++){
            for(int j=0;j<array.length;j++){

              if(example.charAt(i)==array[j]){
                  count++;
              }

            }
        }
        System.out.println(count);
    }
}
