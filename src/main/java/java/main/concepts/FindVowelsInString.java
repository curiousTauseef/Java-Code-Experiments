package java.main.concepts;
/**
 * @author ilariacorda on 25/07/2017.
 * @project Java-Code-Experiments
 * Detect only the wowels in a string of characters
 */
public class FindVowelsInString {

    static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {

        String str = "hello";
        char[] array = str.toCharArray();

        //Check with a consonant
        boolean vowelChecker = FindVowelsInString.isVowel(array[0]);
        System.out.println("Is this a character a vowel?" + vowelChecker);

        //Check with a vowel
        boolean vowelChecker2 = FindVowelsInString.isVowel(array[1]);
        System.out.println("Is this a character a vowel?" + vowelChecker2);

    }

    private static boolean isVowel(char vowel) {
        boolean isVowel = false;
        for (int i = 0; i < FindVowelsInString.getVowel().length; i++) {
            if (FindVowelsInString.getVowel()[i] == vowel) {
                isVowel = true;
            }
        }
        return isVowel;
    }

    public static char[] getVowel() {
        return FindVowelsInString.VOWELS;
    }
}
