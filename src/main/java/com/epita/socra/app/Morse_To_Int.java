package com.epita.socra.app;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Morse_To_Int {
    public static int morse_to_int(String morse_msg) {
        int result = 0;
        for (int i = 0; i <= morse_msg.length() - 9; i+=10) {
            String substring = morse_msg.substring(i, i + 9);
            for (Dico_Morse_Enum.Dico_Morse elem : Dico_Morse_Enum.Dico_Morse.values())
            {
                if (elem.getStr().equals(substring)) {
                    result *= 10;
                    result += elem.ordinal();
                }
            }
        }
        return result;
    }
}
