public class ArrayAlgorithms {
    public static String printArray(int[] nums){


        String value = "";

        for (int a:nums){
            value+= a+" ";

        }
        return value;
    }

    public static boolean checkForAllNegatives(int[] list){

        boolean result = true;
        int length = list.length;
        for (int a=0; a<=length-1;a++){
            if (list[a]<0) {
                result = true;
            }
            else
                result = false;
    }
        return result;
    }

    public static boolean hasDupes (int[] list){

        boolean result = true;
        for (int a=0;a<=list.length;a++){
            for (int b= a+1;b<=list.length;a++){
                if (list[a]==list[b]){
                    result = true;
                }else{
                    result=false;
                }
            }
            return result;

        }

    }

}
