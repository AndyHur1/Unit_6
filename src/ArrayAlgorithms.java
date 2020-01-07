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


        for (int a=0;a<=list.length-1;a++){
            for (int b= a+1;b<=list.length-1;b++){
                if (list[a]==list[b]){
                    return true;

                }
            }



        }

        return false;
    }
    public static int countEvens (int[] arr){
        int length = arr.length;
        int times = 0;
        for (int a=0; a<=length-1;a++){
            if (arr[a]%2==0){
                times+=1;
            }else
                times+=0;

        }
        return times;
    }
    public static int[] leftShift(int[] nums, int shift){
        int shifted_array []= new int [nums.length+shift];
        for (int a=0; a<=nums.length-1;a++){
            shifted_array[a]=nums[a];
        }
        return shifted_array;
    }
    public static String reverseArray(int[] nums){
        int temp_num;
        for (int a=0;a<nums.length/2;a++){
            temp_num = nums[a];
            nums[a]=nums[nums.length-a-1];
            nums[nums.length-a-1]=temp_num;
        }

      return printArray(nums);
    }


}
