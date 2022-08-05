package Recursion;

import java.util.Stack;

public class ReverseASttackUisngReversurion {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack");

        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }

    static void reverse(Stack<Integer> st)
    {
        if(st.size() > 0)
        {
            Integer x = st.peek();
            st.pop();
            reverse(st);
            insert_at_bottom(st,x);
        }
    }

    static void insert_at_bottom(Stack<Integer> st, Integer x)
    {
        if(st.isEmpty()) st.push(x);
        else
        {
            Integer a = st.peek();
            st.pop();
            insert_at_bottom(st, x);
            st.push(a);
        }
    }
}
