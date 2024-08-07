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
           return Skipper( up.substring(1));
        } else {
           return ch+Skipper( up.substring(1));
        }
    }

    //Dont print apple
    public static String Skipping(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("apple")) {
            return Skipping( up.substring(5));
        } else {
            return up.charAt(0)+Skipping( up.substring(1));
        }
    }

    // Dont print app but print apple
    public static String Skipped(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return Skipped( up.substring(3));
        } else {
            return up.charAt(0)+Skipped( up.substring(1));
        }
    }
}
