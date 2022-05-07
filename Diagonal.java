import java.util.*;

public class Diagonal {
    public static void main(String[] args) {
        
        
        //declare & initializing 2D arrayList (integer array)

        List<List<Integer>> array = new ArrayList<List<Integer>>()
        {{
            add(Arrays.asList(1));
            add(Arrays.asList(1,2,3));
            add(Arrays.asList(4,5,6));
            add(Arrays.asList(7,8,9));
        }};

        System.out.println("Difference between diagonals \n");

        // declare some variable to store the sum;

        int right_diagonal=0, left_diagonal=0, differ=0, l=array.size()-1;

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(i).size(); j++) {

                if(i==j)
                {
                    right_diagonal += array.get(i).get(i);
                }
                if((i+j)==array.size()-1){
                    left_diagonal += array.get(i).get(l-1);
                }
                
            }
            
        }

        System.out.println("using only for loop ");
        System.out.println(" right diagonal sum is " + right_diagonal);
        System.out.println(" left diagonal sum is " + left_diagonal);

        differ=Math.abs(right_diagonal-left_diagonal);
        System.out.println(differ);
     }

}