// Last updated: 1/5/2026, 11:24:51 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                result.add("FizzBuzz");
            }
            else if(i%3 == 0){
                result.add("Fizz");
            }else if(i%5 ==0) {
                result.add("Buzz");
                }else{
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}