package cn.gracebxp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一个不重复的字符
 *
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Offer53 {

    private int[] count=new int[256];
    private Queue<Character> queue=new LinkedList<>();

    public void Insert(char ch)
    {
        count[ch]++;
        queue.add(ch);
        while (!queue.isEmpty()&&count[queue.peek()]>1){
            queue.poll();
        }
    }


    public char FirstAppearingOnce()
    {
        return queue.isEmpty()?'#':queue.peek();
    }



}
