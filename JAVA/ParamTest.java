public class ParamTest {
    public static void main(String[] args) {
        String no1 = "30155";
        String no2 = "8469";
        String no3 = "1552";
        
        long newLong = Long.parseLong(no1,no2,no3);
        //Long number = no1 + no2 + no3;

        System.out.println(no1 * no2 * no3);
    }
}
