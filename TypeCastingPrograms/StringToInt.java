

public class StringToInt {

    public static void main (String[] args){

        //first method
        String myString="965";
        int size=Integer.parseInt(myString);
        System.out.println(size);

        //second method
        String application="98788";
        int noOfApplications =Integer.valueOf(application);
        System.out.println(noOfApplications);


        // for printing datatype of the variables
        Object [] variables ={size,noOfApplications,application};

        for(Object variable:variables){
            String dataType=variable.getClass().getSimpleName();
            System.out.println(dataType);

        }


    }

}



