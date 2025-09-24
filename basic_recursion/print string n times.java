// base condition required to avoid stackoverflow
// TC : O(N) Each recursive call does O(1) work (just printing + increment).
// SC : O(N) Because recursion uses the call stack, each recursive call stays on the stack until it returns.
class Main {
    public static void main(String[] args) {
       printName(10,0,"recursion basics");
    }
    public static void printName(int n, int cnt, String str){
        if(cnt == n) return;
        System.out.println(str);
        cnt += 1;
        printName(n,cnt,str);
    }
}
