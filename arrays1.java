public class arrays1 {

   public static void main(String[] args) {

      int marks[];
      marks= new int[5];
      Scanner input= new Scanner(System.in);
      marks[0]=input.nextInt();
      marks[1]=input.nextInt();
      marks[2]=input.nextInt();
      marks[3]=input.nextInt();
      marks[4]=input.nextInt();

      int rollNumber;
      rollNumber=input.nextInt();
      System.out.println("The student with roll number "+rollNumber+" has scored "+marks[rollNumber]+" marks");
   }
}
