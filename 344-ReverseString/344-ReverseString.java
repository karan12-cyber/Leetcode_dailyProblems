// Last updated: 1/5/2026, 11:24:52 PM
class Solution{
public void reverseString(char[]s){
int left=0,right=s.length-1;
while(left<right){
char temp=s[left];
s[left]=s[right];
s[right]=temp;
left++;
right--;
}
}
}