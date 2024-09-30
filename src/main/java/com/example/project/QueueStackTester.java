package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        if(q.length()==0){
return;
        }
        T tmp; 
        for(int i =0;i<q.length();i++){
            tmp = q.serve();
            if((i+1)%2 ==1){
oq.enqueue(tmp);
            }else{
                eq.enqueue(tmp);
            }
            q.enqueue(tmp);
        }
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
LinkedPQ<T> tmp = new LinkedPQ<>();
        if(pq.length()==0){
            return;
        }
      int count = pq.length();
       for(int i=0;i<count;i++){
       PQElement<T> e = pq.serve();
        if(p<=e.p){
            tmp.enqueue(e.data, e.p);

        }
     
       }
        count = tmp.length();
        for(int i =0;i<count;i++){
            PQElement<T> e = tmp.serve();
            pq.enqueue(e.data, e.p);
            
        }
    }
    public static <T> boolean search(Stack<T> st, T e)
    {

        if(st.empty()){
            return false;
        }
        boolean found = false;

        T top = st.pop();
        if(top.equals(e)){
            found = true;
        }else{
            found = search(st, e);
        }
        st.push(top);
        return found;
    
    }
}