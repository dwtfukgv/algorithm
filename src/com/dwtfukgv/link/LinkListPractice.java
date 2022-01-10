package com.dwtfukgv.link;

/**
 * @author qinpeifa
 */
public class LinkListPractice {

    /**
     * 判断链表中是否存在环
     * @param head 链表
     * @return 是否存在环
     */
    public static boolean hasCircle(LinkList head){
        if(head == null || head.next == null)  return false;

    }


    final static class LinkList {
        public int val;
        public LinkListPractice next;
    }
}
