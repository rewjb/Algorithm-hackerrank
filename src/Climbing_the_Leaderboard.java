import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Climbing_the_Leaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int scoresSize = scores.length;
        int aliceSize = alice.length;
        ArrayList<Integer> result = new ArrayList<>();

        Integer[] tem = (Integer[])result.toArray();

        int rank = 0;

        LinkedList<int[]> rankCriteria = new LinkedList<>();

        for (int i = 0; i < scoresSize; i++) {

            if( i-1 <0){
                rankCriteria.add(new int[] { scores[i] , ++rank});
                continue;
            }

            if( scores[i-1] != scores[i]){
                rankCriteria.add(new int[] { scores[i] , ++rank});
            }

        }


        for (int i = 0; i < aliceSize; i++) {
            
        }

        return  new int[]{};
    }

    public static void main(String[] args) {

        int[] scores = {100,100,50,40,40,20,10};
        int[] alice = {5,25,50,120};

        int result[] = climbingLeaderboard( scores, alice);
        int size = result.length;

        for (int i = 0; i < size; i++) {
            System.out.println(result[i]);
        }

    }

}
