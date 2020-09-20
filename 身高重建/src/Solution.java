import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people.length==0)
            return people;
        List<int[]> list=new ArrayList();
//        for(int i=0;i<people.length;i++)
//        {
//            int[] num=people[i];
//            int index=i-1;
//            while(index>=0&&num[0]>=people[index][0])
//            {
//
//                if(num[0]==people[index][0]&&num[1]<people[index][1])
//                {
//                    people[index+1]=people[index];
//                }
//                else
//                    people[index+1]=people[index];
//                index--;
//            }
//            people[index+1]=num;
//        }

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });

        for(int[] p:people)
        {
            list.add(p[1],p);
        }
//        int i=0;
//        for(int[] p:list)
//        {
//            people[i]=p;
//            i++;
//        }
//        return people;

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] arr=new int[][]{new int[]{7,0},new int[]{4,4},new int[]{7,1},new int[]{5,0},new int[]{6,1},new int[]{5,2}};
        System.out.println(s.reconstructQueue(arr));
    }
}
