//brute force 
// TC : O(N)
// SC : O(1)

class Main {
    public static void main(String[] args) {
        int n = 3;
        boolean isPrime = checkPrimeNumber(n);
        if(isPrime){
            System.out.println("Is prime");
        }else {
            System.out.println("Not prime");
        }
    }
    
    public static boolean checkPrimeNumber(int n){
        int cnt = 0;
        for(int i =1; i <= n; i++){
            if(n % i == 0){
                cnt += 1;
            }
        }
        if(cnt == 2){
            return true;
        }
        return false;
    }
}


// Optimal approach 
// TC : O(sqrt(N))
// SC : O(1)

class Main {
    public static void main(String[] args) {
        int n = 9;
        boolean isPrime = checkPrimeNumber(n);
        if(isPrime){
            System.out.println("Is prime");
        }else {
            System.out.println("Not prime");
        }
    }
    
    public static boolean checkPrimeNumber(int n){
        int cnt = 0;
        for(int i =1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                cnt += 1;
                if(n / i != i){
                    cnt += 1;
                }
            }   
        }
        return cnt == 2;
    }
}
