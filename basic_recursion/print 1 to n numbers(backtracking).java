// backward recursion (backtracking)
// TC & SC (same as forward recursion)

class Main {
    public static void main(String[] args) {
        int n = 5;
       printInt(n);
    }
    public static void printInt(int n){
        if(n < 1) return;
        printInt(n - 1);
        System.out.println(n);
    }
}
