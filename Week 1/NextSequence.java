public class NextSequence {

    public static void main (String[] args) {

        String sequence = "ABC";
        String nextSequence = sequenceMethod(sequence);
        System.out.println(nextSequence);
    }

   public static String sequenceMethod( String value){
       char[] charArray = value.toCharArray();

       for (int i = 0; i <= charArray.length-1; i++) {
                if (charArray[i] == 'z') {
                    charArray[i] = 'a';
                } else if (charArray[i] == 'Z') {
                    charArray[i] = 'A';
                } else {
                    charArray[i] = (char) (charArray[i] + 1);
                }
            }
            return new String(charArray);
        }
    }



