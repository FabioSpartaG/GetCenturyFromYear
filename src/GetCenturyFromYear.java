public class GetCenturyFromYear {
    public static int century(int number) {

        number += 99;
        number /= 100;
        return number;
    }
    public static void main(String[] args) {
        System.out.println("The century is: " + century(1900));
    }
}
