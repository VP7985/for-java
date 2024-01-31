//Problem 455 . Assign Cookies 
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren=0;
        int childIdx=0;
        int cookieIdx=0;

        while(childIdx<g.length && cookieIdx<s.length){
            if(s[cookieIdx] >= g[childIdx]){
                contentChildren++;
                childIdx++;
            }
            cookieIdx++;
        }
        return contentChildren;
    }
}
