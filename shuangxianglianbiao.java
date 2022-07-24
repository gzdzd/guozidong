package lianbiaolei;
import java.util.LinkedList;
import java.util.List;

class ListNode {
    public int value;        //当前节点中的数值
    public ListNode prev;  //前节点的地址
    public ListNode next;  //后节点的地址
     public ListNode(){}//无参构造
    public ListNode(int value){
        this.value = value;
    }
}
class DoubleLinkedList {
    //头插法
    private ListNode head;
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        //创建一个新节点
        ListNode node = new ListNode(data);
        //处理空链表的情况
        if(this.head == null){
            this.head = node;
        }else{
            //正常情况
            ListNode cur = this.head;
            //遍历找到最后一个节点
            while(cur.next != null){
                cur = cur.next;
            }
            //真正进行处理
            cur.next = node;
            node.prev = cur;
        }
    }
    //插入某个位置
    public boolean addIndex(int index,int data){
        //判断是否是空链表

        if(this.head == null){
            return false;
        }
        //判断坐标是否合法
        if(index > size() || index < 0){
            return false;
        }
        //在0位置插入
        if(index == 0){
            //头插法
            addFirst(data);
            return true;
        }
        //在末尾插入
        if(index == size()){
            //尾插法
            addLast(data);
            return true;
        }
        //循环遍历找到index指向的节点
        ListNode node=new ListNode(data);
        ListNode cur = this.head;
        while(index > 0){
            cur = cur.next;
            index--;
        }
        //插入新节点
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
        return true;
    }
    //删除所有值为key的节点
    public void removeAll(int key){
        //判断是否为空链表
        if(this.head == null){
            return;
        }
        //先处理正常情况
        ListNode cur = this.head.next;
        //循环遍历链表
        while(cur != null){
            //找到了
            if(cur.value == key){
                //先判断是不是尾节点
                if(cur.next == null){
                    //是尾节点，进行处理
                    cur.prev.next = null;
                    cur.prev = null;
                }else{
                    //不是尾结点，就这样处理
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;   //该节点是与不是都要往后走
        }
        //处理头节点的情况
        if(this.head.value == key){
            this.head = this.head.next;
            //判断头节点处理完毕后是不是成了一个空链表
            if(this.head != null){
                this.head.prev = null;
            }
        }
    }
    //得到双链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印双链表
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        //换一下行
        System.out.println();
    }



}
