// Last updated: 1/23/2026, 10:14:07 AM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3      
4    Set seen = new HashSet(), repeated = new HashSet();
5    for (int i = 0; i + 9 < s.length(); i++) {
6        String ten = s.substring(i, i + 10);
7        if (!seen.add(ten))
8            repeated.add(ten);
9    }
10    return new ArrayList(repeated);
11}   
12        
13    }
14