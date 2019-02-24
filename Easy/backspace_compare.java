class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        return builder(S).equals(builder(T));
    }
    public String builder(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack); 
    }
}