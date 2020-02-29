import java.util.ArrayList;

/**
 * Created by S10080586 on 2/21/2017.
 */
public class Permutations {
    private static ArrayList<Integer> randNum = new ArrayList<Integer>();

    public static void nextPermutations(){
        for(int i=1;i<=10;i++){
            randNum.add(i);
        }
        for(int k=1;k<=10;k++){
            int index = (int)(Math.random()*randNum.size());
            System.out.print(randNum.get(index)+" ");
            randNum.remove(index);
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        for(int l=1;l<=10;l++){
            System.out.print("List "+ l+": ");
            nextPermutations();
        }
    }
}
