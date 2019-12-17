public class TraverseArrays {
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
        int [] list = new int[desiredLength];
        for (int a =0; a<=desiredLength-1;a++){
            list[a]=a;
        }
        return list;

    }
    public static boolean sum28(int[] numbers){
        int times = numbers.length;
        int total_u = 0;
        for (int a=0;a<times;a++){
            if (numbers[a]==2){
                total_u+=numbers[a];
            }else{
                total_u+=0;
            }

        }
        if (total_u==8){
            return true;
        }else{
            return false;
        }

    }
    public static int[] zeroMax(int[] original){

        for (int a = 0; a <= original.length-1;a++){
            if (original[a] == 0){
                for (int a_2=a;a_2< original.length-1;a_2++){
                    if (original[a_2]<original[a_2+1]&&original[a_2+1]%2!=0){
                        original[a_2]=original[a_2+1];
                    }
                }
            }
        }
        return original;
    }



}
