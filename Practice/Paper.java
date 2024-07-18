interface Number1{

    void method(int x);
}


public class Paper {

    static void twice(int[] arr,StringBuffer variable){

        for(int i = 0;i < arr.length;i++){
            arr[i] = arr[i] * 2;
        }
        variable=variable.append("jimsonn");


    }

    public static void main(String[] args) {
        int[] arr = {10,11,12};
        StringBuffer variable =new StringBuffer("jimk");
        twice(arr,variable);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println(variable);

        Number1 obj=( int x)-> System.out.println(x+3);
        obj.method(3);
    }

}
