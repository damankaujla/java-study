public class LargestNo {
    public static void main(String[] args) {
        int[] num = {26,636,67,42,79,88,24};
        int largest = num[0];
        for(int i = 1;i<=num.length -1;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        System.out.println("Largest Number is: " +largest);
    }
}