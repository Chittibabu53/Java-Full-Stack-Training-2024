public class Strings {

    public static void  main(String [] args){

        //length of the String
        String name="mahesh";
        int length=name.length();
        System.out.println(length);

        //returning the value of  specified  index of a string
        char ch=name.charAt(2);
        System.out.println(ch);

        //converting all the characters in the string  to the upper case
        String upperCase=name.toUpperCase();
        System.out.println(upperCase);


        //converting to lowercase
        String lowercase=name.toLowerCase();
        System.out.println(lowercase);



        //way to return substring
        String subString=name.substring(1,4);
        System.out.println(subString);


        //returning the index of the first occurence
        int index =name.indexOf("he");
        System.out.println(index);


        //checking whether the index starts with string or not;
        boolean startingWith=name.startsWith("ma");
        System.out.println(startingWith);


        //endswith
        boolean endsWith=name.endsWith("u");
        System.out.println(endsWith);

        //trim
        String person="   subhash ";

        String trimmed=person.trim();
        System.out.println(person+""+(person.length()));
        System.out.println(trimmed);

        //replace
        String actor="I love kajol and kajol love me";
        String hero="mahesh";
        String result=actor.replace("kaj",hero);
        System.out.println(result);

        //replaceAll
        String batsmen="virat kohli is the best batsmen";
        String regex="s";
        String replacement=batsmen.replaceAll(regex,"l");
        System.out.println(replacement);



    }

}
