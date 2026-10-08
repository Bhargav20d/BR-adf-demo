public class Count{
    public static int CountDigigts(int n){
        if(n==0){
            return 0;
        }
        return 1+CountDigigts(n/10);
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number=sc.nextInt();
        if(number==0){
            System.out.println("Number of digits: 1");
        }
        else{
            int result = CountDigigts(number);
            System.out.println("Number of digits: "+result);
        }
    }
}