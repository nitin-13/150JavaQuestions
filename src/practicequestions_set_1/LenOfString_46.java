package practicequestions_set_1;

public class LenOfString_46 {
    public static void main(String[] args) {
        String str = "Hello, My name is Nitin!";
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.print("Length of the given string is -> " + count);
    }
}
