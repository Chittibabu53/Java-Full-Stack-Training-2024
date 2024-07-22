import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class WildCardsNumbwr {


    public static void main(String[] args) {


        Integer [] array={3,3,1};

        Map<Integer,Integer> map=new HashMap<>();

        for(int l = 0 ; l< array.length; l++){

            if(!map.containsKey(array[l])){
                map.put(array[l],1);
            }
            else{
                map.put(array[l], map.get(array[l])+1);

            }
        }

        for(Map.Entry<Integer,Integer> maps: map.entrySet()){

            if(maps.getValue()==2){
                System.out.println(maps.getKey());
            }


    }}}


