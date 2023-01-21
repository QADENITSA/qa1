package Home.work1and2;

public class CountWords {
    public static void main(String[] args) {
        String words = "Buckstar eat rice and bottle caps";
        int countWords = words.split(" ").length;
        System.out.println("Броя на думите е: " + countWords);
    }
}
