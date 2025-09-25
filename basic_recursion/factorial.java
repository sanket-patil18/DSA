// find factorial of number using recursion
// TC : O(N^2) basically O(N^2) exponential
// SC : O(N)

class Solution {
    public int fib(int n) {
        return printFibonacci(n);
    }

    public int printFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}
