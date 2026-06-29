// Last updated: 6/29/2026, 9:34:45 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int count=0;
4        StringBuilder result=new StringBuilder("");
5        for(char i :s.toCharArray()){
6            if(i=='('){
7                count++;
8                if(count>1){
9                    result.append(i);
10
11                }
12            }
13                else{
14                    count--;
15                    if(count>0){
16                        result.append(i);
17
18                    
19                }
20            }
21
22        }
23        return result.toString();
24        
25    }
26}