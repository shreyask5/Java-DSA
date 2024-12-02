import java.util.Arrays;
//https://chatgpt.com/share/674ade1b-2b38-8002-ba92-a9140efc574f
//https://leetcode.com/problems/string-compression/description/
public class LeetCode443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
        System.out.println(Arrays.toString(chars));
    }
    static int compress(char[] chars) {
        int count = 1;
        String compress = "";
        for (int i = 1; i < chars.length + 1; i++) {
            if(i < chars.length && chars[i - 1] == chars[i]){
                count++;
            }else{
                if (count > 1)
                    compress = compress + chars[i - 1] + count;
                else
                    compress = compress + chars[i - 1];
                count = 1;
            }
        }
        char[] chars2 = compress.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
           chars[i] = chars2[i];
        }
        return chars.length;
    }

    static int compress2(char[] chars) {
        int write = 0; // Position to write the compressed result
        int read = 0;  // Position to read the input array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // New length of the compressed array
    }
}
