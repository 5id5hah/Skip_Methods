# Character_Skip

The `Character_Skip` Java class provides methods to manipulate strings by skipping specific characters or substrings.

## Methods

- **Skip**: Skips all occurrences of the character 'a' and prints the modified string.
- **Skipper**: Returns a new string where all 'a' characters are removed.
- **Skipping**: Removes all instances of the substring "apple" from the input string.
- **Skipped**: Removes "app" unless it is followed by "le", ensuring "apple" remains intact.

## Usage

```java
public class Character_Skip {
    public static void main(String[] args) {
        String str = "airappleaddbag";
        Skip("", str);
        System.out.println(Skipper("aabbaaaaaaac"));
        System.out.println(Skipping("iappleluvappleu"));
        System.out.println(Skipped("appisapplefruit"));
    }

    public static void Skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            Skip(p, up.substring(1));
        } else {
            Skip(p + ch, up.substring(1));
        }
    }

    // Using only up
    public static String Skipper(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
           return Skipper(up.substring(1));
        } else {
           return ch + Skipper(up.substring(1));
        }
    }

    // Don't print apple
    public static String Skipping(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("apple")) {
            return Skipping(up.substring(5));
        } else {
            return up.charAt(0) + Skipping(up.substring(1));
        }
    }

    // Don't print app but print apple
    public static String Skipped(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return Skipped(up.substring(3));
        } else {
            return up.charAt(0) + Skipped(up.substring(1));
        }
    }
}
Use Cases
Data Cleaning: Remove unwanted characters or substrings from data before processing.
Text Parsing: Skip specific patterns or markers while parsing large text files.
Input Validation: Filter out unwanted characters from user input.
Preprocessing: Prepare strings for further analysis by removing unnecessary parts.
Pattern Matching: Simplify pattern matching by excluding certain substrings from consideration.
