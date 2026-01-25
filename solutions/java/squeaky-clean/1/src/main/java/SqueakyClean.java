class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean toUpper = false;

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (c == ' ') {
                sb.append('_');
                continue;
            }

            if (c == '-') {
                toUpper = true;
                continue;
            }

            switch (c) {
                case '4': c = 'a'; break;
                case '3': c = 'e'; break;
                case '0': c = 'o'; break;
                case '1': c = 'l'; break;
                case '7': c = 't'; break;
            }

            if (toUpper) {
                c = Character.toUpperCase(c);
                toUpper = false;
            }
             if (!Character.isLetter(c) && c != '_'){
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
