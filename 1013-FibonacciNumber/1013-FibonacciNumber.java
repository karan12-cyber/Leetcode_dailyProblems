// Last updated: 1/5/2026, 11:24:33 PM
class Solution {
    public int fib(int n) {
//         if (n<=1){
//             return n;
//         }
        
//         if (n==2){
//             return 1;

//         }
//         return fib (n-1) + fib (n-2);
//     }
// }

// if (n==0) return n=0;
// int [] dp =new int [n+1];
// dp[0]=0;
// dp[1]=1;
// for(int i=2;i<=n;i++){
//     dp[i] = dp[i-1] +dp[i-2];
// }
// return dp[n];
//     }
// }

if(n<=1){
    return n;

}if (n==2){
    return 1;

}
int current=0;
int prev1=1;
int prev2=1;
for(int i=3;i<=n;i++){
    current =prev1 + prev2;
    prev1=prev2;
    prev2=current;

}
return current;
    }
}

