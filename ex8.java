public class ex8 {
    public static void main(String[] args) {
        int sum=0;
        double average;
        for (int i=1; i<=100; i++){
            sum+=i;
        }
        average=sum/100;
        System.out.println("The average is: "+average);
    }
}
