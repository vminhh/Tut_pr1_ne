package Class.tut8;

public class PrimeProbability {
    public static void main(String[] args) {
        int total = 100;
        int primeCount = 0;

        for (int i=0 ; i<total; i++){
            int randomNumber = generateRandomNumber(2,1000);
            if (isPrime(randomNumber))
                primeCount ++;
        }
        
         System.out.println(String.format("Among %d random integers, %d are prime numbers", total, primeCount));
         double pro = (double) primeCount / total * 100;
         System.out.println("Probability is "+ pro + "%");
    }

    public static int generateRandomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static boolean isPrime(int n){
        if (n<2)    return false;

        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0)
                return false;
        }

        return true;
    }
}
