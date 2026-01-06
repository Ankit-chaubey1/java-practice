public class PrimeCheck {
    public static void main(String[]args){
int num=17;
boolean result=isPrime(num);
        if(result){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    
}
