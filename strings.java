public class strings {

   public strings() {
    }

public static void main(String[] args) {

      int name;
      int year;
      Scanner input= new Scanner(System.in);
      name=input.nextInt();
      year=input.nextInt();

      int yearOfGraduation;
      yearOfGraduation=year+4;
      System.out.println("Hello "+name);
      System.out.println("Free services till:"+yearOfGraduation);
   }
}
