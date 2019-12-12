public class ArrayTraversal {
    public static int countEven(int[]num){

        int total_num=0;
        int length = num.length;
        for (int a=0;a<length;a++){

            if (num[a]%2==0){
                total_num++;
            }
            else{
                total_num+=0;
            }
        }
        return total_num;
    }

    public static int[] buildArray(int desiredLength){



    }


}
