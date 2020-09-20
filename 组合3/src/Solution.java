import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arraylist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(arraylist,k,n,1,list,1);
        return arraylist;
    }

    public void dfs(List<List<Integer>> arraylist,int k, int n,int current,List<Integer> list,int start)
    {
        if(n<0)
            return;
        if(current==k+1) {
            if (n == 0) {
                List<Integer> newlist=new ArrayList<>(list);
                arraylist.add(newlist);
                return;
            }
            else{
                return;
            }
        }
        for(int i=start;i<10;i++) {
            list.add(i);
            dfs(arraylist, k, n-i, current + 1, list,i+1);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        List<List<Integer>> arraylist=s.combinationSum3(3,12);
        System.out.println(arraylist);
    }
}
