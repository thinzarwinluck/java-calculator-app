public class Main {
    public static void main(String[] args) {
        String sentence = "Hello Welcome to NSJ. Please fill out your information.";
        int length = sentence.length();
        int middle = 40; // assuming console width of 80 characters

        String centeredSentence = String.format("%" + (middle + length/2) + "s", sentence);
        centeredSentence = centeredSentence + String.format("%" + (80 - centeredSentence.length()) + "s", "").replace(' ', '*');

        System.out.println(centeredSentence);
    }
}