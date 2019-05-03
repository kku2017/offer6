import java.util.ArrayList;
import java.util.Stack;

/**
 * @author xukai
 * @date 2019/5/2 - 23:58
 *输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *使用栈实现：先入后出。全部入栈，依次出栈，顺序即为从尾到头。
 */
public class PrintListNode {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        //使用栈来实现
        Stack<Integer>  stack = new Stack<>();
        ArrayList<Integer>  arrayList =  new ArrayList<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode =  listNode.next;

        }
        while (! stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return  arrayList;
    }

}



//  用递归实现

public ArrayList<Integer> printListFromTailToHead(ListNode listnode){
    ArrayList<Integer> arrayList = new ArrayList<>();
    if(listnode != null) {
        arrayList.addAll(printListFromTailToHead(listNode.next));
        arrayList.add(listnode.val);
    }
}