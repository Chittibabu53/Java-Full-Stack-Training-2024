import java.util.Comparator;
import java.util.TreeMap;

public class LeetCode {


    public static void main(String[] args) {

        String[] names={"Mary","John","Emma"};
        int [] heights={180,165,170};

        TreeMap<Integer,String> treeMap=new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < names.length; i++) {
            treeMap.put(heights[i],names[i]);
        }
        System.out.println(treeMap.values());
    }
}
