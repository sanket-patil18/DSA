// print numbers in reverse using recursion
// TC and SC same as recursion

class Main {
    public static void main(String[] args) {
        int n = 5;
       printInt(n);
    }
    public static void printInt(int n){
       if(n < 1) return;
       System.out.println(n);
       printInt(n - 1);
    }
}
