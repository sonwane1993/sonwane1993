public class IneuronPattern {
    public static void main(String[] args) {
        // Define the pattern for each letter
        String i = "  *  \n  *  \n  *  \n  *  \n  *  \n  *  \n";
        String n = "*   *  \n**  *  \n* * *  \n*  **  \n*   *  \n*   *  \n";
        String e = "*****  \n*      \n*      \n*****  \n*      \n*      \n*****  \n";
        String u = "*   *  \n*   *  \n*   *  \n*   *  \n*   *  \n*****  \n";
        String r = "****   \n*   *  \n*   *  \n****   \n*  *   \n*   *  \n";
        String o = "*****  \n*   *  \n*   *  \n*   *  \n*   *  \n*****  \n";
        String space = "      \n      \n      \n      \n      \n      \n";
        
        // Print the letters in the correct order
        System.out.println(i + space + n + space + e + space + u + space + r + space + o + space + n);
    }
}

