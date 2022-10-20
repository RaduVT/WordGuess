public class MagicWord {
    private static final String[] WORDS = {
            "IMPORTANT", "RECOGNITION", "STUDENT", "MAGICAL"
    };
    private String hiddenWord;
    private boolean[] guessedLetters;

    public MagicWord() {
        int rand = (int) (Math.random() * WORDS.length);
        hiddenWord = WORDS[rand];
        guessedLetters = new boolean[hiddenWord.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = false;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (guessedLetters[i]) {
                s += hiddenWord.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }

    public void shootLetterOrWord(String letterOrWord) {
            if (letterOrWord.length() == 1) {
                char letter = hiddenWord.charAt(0);
                for (int i = 0; i < hiddenWord.length(); i++) {
                    if (hiddenWord.charAt(i) == letter) {
                        guessedLetters[i] = true;
                    } else {
                        guessedLetters[i] = false;
                    }
                }
            }
    }
    public boolean wins() {
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i] == false) {
                return false;
            }
        }
        return true;
    }
}

