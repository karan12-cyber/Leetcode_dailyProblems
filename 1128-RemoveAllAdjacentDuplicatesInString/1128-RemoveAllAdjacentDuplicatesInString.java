// Last updated: 1/5/2026, 11:24:31 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char element = s.charAt(i);
            if (!s2.isEmpty() && s2.peek()==element){
                s2.pop();
            }else {
                s2.push(element);
            }
          } 
        StringBuilder sb=new StringBuilder();
        while(!s2.isEmpty()){
        sb.append(s2.pop());
        }
        sb.reverse();
        return sb.toString(); 
}
}