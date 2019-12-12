public class ArrayCreation {

    public static double getAverage(double [] numbers){

        if (numbers.length<3)
        return 0.0;
        else if(numbers.length>=3){
            double average_1 = (numbers[0]+numbers[numbers.length/2]+numbers[numbers.length-1])/3;
            double average_2 = ((average_1*100)+0.5)/100;
            double average_f = (int) average_2;
            return average_f;
        }else{

        return 0.0;
        }



    }
    public static String stringArray(String[] friends){

        if (friends.length!=5){
            return "";
        }else{
            int a = friends[0].length();
            int b = friends[1].length();
            int c = friends[2].length();
            int d = friends[3].length();
            int e = friends[4].length();
            return a+" "+b+" "+c+" "+d+" "+e+" ";
        }


    }
    public static String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India",
                "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi",
                "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi",
                "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};

        int index_countries = countries.length;
        int random_cast = (int) (Math.random()*index_countries);

        return "The capital of "+countries[random_cast]+" is "+capitals[random_cast]+" and the primary language is "+
                languages[random_cast];

    }


}
