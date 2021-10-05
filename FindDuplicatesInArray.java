import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicatesInArray {
//find duplicates in  an array
    public static void main(String[] args) {
        int[] num = {1,4,7,3,5,3,4};
        //findDuplicateWithBruteForce(num);
       // findDuplicateWithHashMap(num);
        occuranceOfDuplicate(num);
    }

//find number of duplicates in a array
    private static void occuranceOfDuplicate(int[] num) {
        HashMap<Integer,Integer> mapDup = new HashMap<>();
        int count = 0;
        for (int i = 0; i < num.length ; i++) {
            if(mapDup.containsKey(num[i])){
                mapDup.put(num[i],mapDup.get(num[i])+1);
            }else{
                mapDup.put(num[i],1);
            }
        }

        for (int x: mapDup.keySet()) {
            if(mapDup.get(x)>1)
            System.out.println("duplicate element==>  " + x + " occurs==> " +  mapDup.get(x) + " times");
        }

    }

    private static void findDuplicateWithHashMap(int[] num) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length ; i++) {
            if(map.containsKey(num[i])){
                System.out.println("duplicate element is"+ num[i]);
            }else{
                map.put(num[i],i);
            }
        }
    }


    private static void findDuplicateWithBruteForce(int[] num) {
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] == num[j])
                {
                    System.out.println("duplicate element is"+ num[i]);
                }
            }
        }
    }



}
