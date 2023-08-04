import java.util.Stack;

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        
        if(s.isEmpty()||s.size()==1){
            return;
        }
        
        int temp=s.pop();
        reverse(s);
        insertatbottom(s,temp);
    }
    
    
    static void insertatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
        }
        
        else{
            int temp=s.pop();
            insertatbottom(s,data);
            
            s.push(temp);
        }
    }
}