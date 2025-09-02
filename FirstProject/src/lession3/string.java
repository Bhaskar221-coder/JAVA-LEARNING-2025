package lession3;

public class string {
    public static void main(String[] args) {
        String name = "BhaskarKumar";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString = "    Bhaskar    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(5));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('a', 'h'));
        System.out.println(name.replace("Bhaskar", "Kumar"));
        System.out.println(name.startsWith("Bh"));
        System.out.println(name.endsWith("ar"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("sk"));
    }
}
