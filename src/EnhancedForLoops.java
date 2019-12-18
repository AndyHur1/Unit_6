public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){
        String value = "";
        for (int a=0; a<=arr.length-1;a++){
            value+=arr[a]+" ";
        }
        return value;


    }

    public static String printStandardFor(int[] arr){
        String value = "";
        for (int a=0; a<=arr.length-1;a++){
            value+=arr[a]+" ";
        }
        return value;
    }

    public static String printStandardFor(double[] arr) {
        String value ="";
        for (int a=0; a<=arr.length-1;a++){
            value+=arr[a]+" ";
        }
        return value;
    }

    public static String printEnhancedFor(String[] arr){
        String value ="";
        for (String a: arr){
            value+=a+" ";
        }
        return value;
    }

    public static String printEnhancedFor(int[] arr){
        String value ="";
        for (int a: arr){
            value+=a+" ";
        }

    return value;
    }

    public static String printEnhancedFor(double[] arr){
        String value ="";
        for (double a: arr){
            value+=a+" ";
        }
        return value;
    }

    public static String printStandardWhile(String[] arr) {
        String value = "";
        int a = 0;
        while (a<arr.length){
            value+=arr[a]+" ";
            a++;
        }
        return value;
    }

    public static String printStandardWhile(int[] arr) {
        String value = "";
        int a = 0;
        while (a<arr.length){
            value+=arr[a]+" ";
            a++;
    }
        return value;}


    public static String printStandardWhile(double[] arr) {
            String value = "";
            int a = 0;
            while (a<arr.length){
                value+=arr[a]+" ";
                a++;}
            return value;
    }

}
