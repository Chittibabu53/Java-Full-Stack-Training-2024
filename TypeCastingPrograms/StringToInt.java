

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
        Object [] variables ={myString,application,noOfApplications,size};
        int i=0;
        for(Object variable:variables){
            String dataType=variable.getClass().getSimpleName();
            for (int num=i;num<=variables.length-1;num++){
                System.out.println(variables[i]+" is "+dataType);
              break;
            }
           i++;

//            System.out.println(dataType+"");

        }


    }

}



