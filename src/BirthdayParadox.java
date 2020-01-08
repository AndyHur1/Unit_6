public class BirthdayParadox {
    /*
    Creator: Andy Hur
     Date: 1/8/2020
    Instruction: This program will find the percentage how many people will have chance to have same birthday.
     */

    /*
    This method is checking is there any duplicate birthday in given array.
    If they do, then it will return true value, if not return false value.
     */
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
    /*
    This program will give array that contains multiple birthday dates randomly based on what number you put in the method
     */
    public static int[] dates(int num){


        int array [] = new int[num];
        for (int a=0; a<num;a++){
            int b_date = (int) (Math.random()*364+1);
            array[a] = b_date;
        }

        return array;
    }
    /*
    During this program, I made loop that will run 1000 times.
    During this loop, it will run method dates and dupes. When we have true value on hasDupe program
    , it will add 1 on double value num, so we can find how many times it duplicates during 1000 times experiment.
    After that I divided by 1000 and times 100 in order to find the percentage.
     */
    public static void main(String[] args){
        double num = 0.0;

        for (int a=0;a<1000;a++){
           int date [] = dates(23);
           if (hasDupes(date))
               num++;

        }

        double percentage = num/1000*100;
        System.out.println(percentage);
    }
}
