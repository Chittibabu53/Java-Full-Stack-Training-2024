public class IntToString {
    public static void main(String[] args){



        //first method toString();
        int number=333;
        String document=Integer.toString(number);
        System.out.println(document);

        //second method valueOf();
        int roomNo=678;
        String classRooms=String.valueOf(roomNo);
        System.out.println(classRooms);

        //third method using concatenation ;
        int noOfTeachers=15;
        String teachers=""+number;


//        printing dataTypes
        Object [] values={number,roomNo,noOfTeachers};

        for(Object obj:values) {
            String dataType=obj.getClass().getSimpleName();
            System.out.println(dataType);
        }

    }

}
