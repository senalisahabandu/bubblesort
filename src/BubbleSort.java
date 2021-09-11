import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int list1[]={53,5,1,79,20,4,13,7};
        int num=0;
        int length = list1.length-1;
        for (int count =0; count<length; count++){
            for(int iteration=0; iteration<length-count;iteration++){
                num+=1;
                if (list1[iteration]>list1[iteration+1]){
                    int temp =list1[iteration];
                    System.out.println(iteration);
                    list1[iteration]=list1[iteration+1];
                    list1[iteration+1]=temp;
                    System.out.println(Arrays.toString(list1));
                }
            }
        }
        System.out.println("total iterations = "+num);

    }

}
