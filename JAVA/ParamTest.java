public class ParamTest {

    public static void main(String[] args) {
        String [] townships = {"Thembisa", "Diepsloot", "Alex", "Zonkezizwe"};

        String townName = findLongestName(townships);
        System.out.println( townName);
    }

    public static String findLongestName(String [] townships){
        int size = townships.length;
        String longestName = townships[0];

        for(int i = 0; i <= 3; i++){
            if(townships[i].length() > longestName.length()){
            longestName = townships[i];
        }}

        return longestName;
    }
}