public class OOPSBannerAppUC7 {

    static class CharacterPatternMap {
        char character;
        String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
            }),

            new CharacterPatternMap('S', new String[]{
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
            }),

            new CharacterPatternMap(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap cp : charMaps) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return charMaps[3].getPattern();
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                line.append(getCharacterPattern(ch, charMaps)[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}