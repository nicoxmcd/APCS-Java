import java.util.Scanner;

class Assignment_4_String Shortener {
    public static void main(String[] args)
    {
        System.out.println("Type the message to be shortened");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        word = word.toLowerCase();
        int repeat = 0;
        int vowel = 0;
        String newWord = "";
        if (word.length() >= 10) {
            for (int i = 0; i < word.length(); i++) {
                if (i > 0 && word.charAt(i - 1) != ' ' && (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                        || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')) {
                    vowel++;
                } else if (i > 0 && word.charAt(i) == word.charAt(i - 1)) {
                    repeat++;
                } else {
                    newWord += word.charAt(i);
                }
            }
            System.out.println("Shortened message: " + newWord);
            System.out.println("Repeated letters removed: " + repeat);
            System.out.println("Vowels removed: " + vowel);
            System.out.println("Total characters saved: " + (vowel + repeat));
        } else {
            System.out.println("This doesn't need shortening!");
        }
    }
}
