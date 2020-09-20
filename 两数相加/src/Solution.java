public class Solution {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        add(l1,l2,l3,0);
        return l3;
    }
    public  void add(ListNode l1, ListNode l2,ListNode l3,int num)
    {
        if(l1==null&&l2==null&&num==0)
            return;
        l3.val= l1==null?0:l1.val+(l2==null?0:l2.val)+num;
        if(l3.val>=10)
            num=1;
        else num=0;

        if(l1!=null||l2!=null||num!=0)
            add(l1.next,l2.next,l3.next,num);
    }
}
