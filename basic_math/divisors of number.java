// brute force 
// TC : O(N)
// SC : O(1)

class Main {
    public static void main(String[] args) {
        int n = 12;
        java.util.List<Integer> listOfDivisors = new java.util.ArrayList<>();
        for(int i = 1; i <= n ; i++){
            if(n % i == 0){
                listOfDivisors.add(i);
            }
        }
        System.out.println("Divisors of number " + n + " are : " + listOfDivisors);
    }

// optimal approach
// TC : O(sqrt(N))
// SC : O(1)

class Main {
    public static void main(String[] args) {
        int n = 12;
        java.util.List<Integer> listOfDivisors = new java.util.ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                listOfDivisors.add(i);
                if(n / i != i){
                    listOfDivisors.add(n / i);
                }
            }
        }
        java.util.Collections.sort(listOfDivisors);
        System.out.println("Divisors of number " + n + " are : " + listOfDivisors);
    }
}
