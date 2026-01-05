// Last updated: 1/5/2026, 11:24:02 PM
class Solution {
public:
    bool calc(int i, vector<int>&cur, vector<bool>&vis, int n) {
        int sz = cur.size();
        if (i == sz) return true; // Base case: sequence completed
        
        // Find next empty position
        while (i < sz && cur[i] != -1) i++;
        if (i == sz) return true;

        // Try placing numbers from n to 1 (lexicographically largest first)
        for (int j = n; j > 0; j--) {
            if (!vis[j]) {
                if (j != 1 && (i + j >= sz || cur[i + j] != -1)) continue;
                
                // Place number j
                cur[i] = j;
                if (j != 1) cur[i + j] = j;
                vis[j] = true;
                
                // Recur for next position
                if (calc(i + 1, cur, vis, n)) return true;
                
                // Backtrack
                cur[i] = -1;
                if (j != 1) cur[i + j] = -1;
                vis[j] = false;
            }
        }
        return false;
    }

    vector<int> constructDistancedSequence(int n) {
        vector<int> cur(2 * n - 1, -1); // Initialize sequence with -1
        vector<bool> vis(n + 1, false); // Track used numbers
        calc(0, cur, vis, n);
        return cur;
    }
};