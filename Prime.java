public class Prime {
    public static void main(String[] args){
        int n = 100;
        boolean[] prime = new boolean[n];
        for(int i = 2; i < n; i++){
            prime[i] = true;
        }
        for(int i = 2; i < n; i++){
            if(prime[i] == true){
                for(int j = i+i; j < n; j+=i){
                    prime[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(prime[i] == true) {
                System.out.println(i);
            }
        }
    }
}
