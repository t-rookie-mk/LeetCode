import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution {

    private volatile int a=0;
    Lock lock=new ReentrantLock();

    public List<List<Integer>> subsets(int[] nums) {
        lock.notifyAll();
        lock.lock();
        lock.unlock();
        List all=new ArrayList();
        all.add(new ArrayList());
        find_tree(nums,-1,0,new ArrayList(),all);
        return all;

    }


    public void find_tree(int[] nums,int current,int row,List num,List all){

        if(row== nums.length+1)
        {
            return ;
        }
        if(row!=0)
        {
            num.add(nums[current]);
            all.add(new ArrayList<>(num));
        }

        for(int i=current+1;i<nums.length;i++){
            find_tree(nums,i,row+1,num,all);
            num.remove(num.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a=new int[]{1,2,3,4};
        System.out.println(s.subsets(a));

    }
}
