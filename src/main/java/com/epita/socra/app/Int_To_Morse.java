package com.epita.socra.app;

import java.util.ArrayList;


public class Int_To_Morse {
    public static String int_to_morse(int integer)
    {
        StringBuilder result = new StringBuilder();
        int digit = integer % 10;

        result.insert(0, Dico_Morse_Enum.Dico_Morse.values()[digit].getStr());

        while (integer >= 10)
        {
            integer = integer / 10;
            digit = integer % 10;
            result.insert(0," ");
            result.insert(0, Dico_Morse_Enum.Dico_Morse.values()[digit].getStr());
        }
        return result.toString();
    }
}
