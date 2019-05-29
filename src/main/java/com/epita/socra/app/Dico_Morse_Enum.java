package com.epita.socra.app;

public class Dico_Morse_Enum {
    enum Dico_Morse
    {
        ZERO("_ _ _ _ _"),
        ONE(". _ _ _ _"),
        TWO(". . _ _ _"),
        THREE(". . . _ _"),
        FOUR(". . . . _"),
        FIVE(". . . . ."),
        SIX("_ . . . ."),
        SEVEN("_ _ . . ."),
        EIGHT("_ _ _ . ."),
        NINE("_ _ _ _ .");

        private final String str;

        Dico_Morse(final String str)
        {
            this.str = str;
        }

        public String getStr() {
            return this.str;
        }
    }
}
