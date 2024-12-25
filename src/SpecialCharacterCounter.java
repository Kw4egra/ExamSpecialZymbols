public class SpecialCharacterCounter {
    public static int countSpecialCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        return (int) input.chars()
                .filter(c -> !Character.isLetterOrDigit(c))
                .count();
    }
}
