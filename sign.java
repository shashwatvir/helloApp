public class sign {

   public static void main(String[] args) {

    int n;
    Scanner input= new Scanner(System.in);
    n=input.nextInt();
    if (n>0){
        System.out.println("The number entered is positive");
    }
    else{
        System.out.println("The number entered is negative");
    }
   }
}
