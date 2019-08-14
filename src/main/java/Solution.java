public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt("version 3.3.4_3201"));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
