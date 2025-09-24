// base condition required to avoid stackoverflow

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
