package com.epita.socra.app;



import org.junit.Test;

import static com.epita.socra.app.Int_To_Morse.int_to_morse;
import static com.epita.socra.app.Morse_To_Int.morse_to_int;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */

    @Test
    public void Mock_CheckOuputs_OnMorse83() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("_ _ _ . . . . . _ _").thenReturn("exit");
        App app = new App(mock);
        app.run();

        verify(mock).write("83");
    }

    @Test
    public void Mock_CheckOuputs_AdditionMorse1_Plus_Morse2_Expected3() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn(". _ _ _ _").thenReturn(". . _ _ _").thenReturn("exit");
        App app = new App(mock);
        app.run();

        verify(mock).write("1");
        verify(mock).write("3");
    }

    @Test
    public void Mock_CheckOutputs_AdditionMorse30_Plus_Int60_Plus_Morse9_Expected99() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn(". . . _ _ _ _ _ _ _").thenReturn("60").thenReturn("_ _ _ _ .").thenReturn("exit");
        App app = new App(mock);
        app.run();

        verify(mock).write("30");
        verify(mock).write("90");
        verify(mock).write("99");
    }

    @Test
    public void ValidMorseWith0() {
        String res = int_to_morse(0);
        assert(res.equals("_ _ _ _ _"));
    }

    @Test
    public void ValidMorseWith1() {
        String res = int_to_morse(1);
        assert(res.equals(". _ _ _ _"));
    }

    @Test
    public void ValidMorseWith2() {
        String res = int_to_morse(2);
        assert(res.equals(". . _ _ _"));
    }

    @Test
    public void ValidMorseWith3() {
        String res = int_to_morse(3);
        assert(res.equals(". . . _ _"));
    }

    @Test
    public void ValidMorseWith4() {
        String res = int_to_morse(4);
        assert(res.equals(". . . . _"));
    }

    @Test
    public void ValidMorseWith5() {
        String res = int_to_morse(5);
        assert(res.equals(". . . . ."));
    }

    @Test
    public void ValidMorseWith6() {
        String res = int_to_morse(6);
        assert(res.equals("_ . . . ."));
    }

    @Test
    public void ValidMorseWith7() {
        String res = int_to_morse(7);
        assert(res.equals("_ _ . . ."));
    }

    @Test
    public void ValidMorseWith8() {
        String res = int_to_morse(8);
        assert(res.equals("_ _ _ . ."));
    }

    @Test
    public void ValidMorseWith9() {
        String res = int_to_morse(9);
        assert(res.equals("_ _ _ _ ."));
    }

    @Test
    public void ValidMorseWith10() {
        String res = int_to_morse(10);
        assert(res.equals(". _ _ _ _ _ _ _ _ _"));
    }

    @Test
    public void ValidMorseWith999() {
        String res = int_to_morse(999);
        assert(res.equals("_ _ _ _ . _ _ _ _ . _ _ _ _ ."));
    }

    @Test
    public void ValidMorseWith42() {
        String res = int_to_morse(42);
        assert(res.equals(". . . . _ . . _ _ _"));
    }

    @Test
    public void ValidMorseWith1000() {
        String res = int_to_morse(1000);
        assert(res.equals(". _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"));
    }

    @Test
    public void Valid_Morse_To_Int_Return42() {
        int res = morse_to_int(". . . . _ . . _ _ _");
        assert(res == 42);
    }

    @Test
    public void Valid_Morse_To_Int_Return10() {
        int res = morse_to_int(". _ _ _ _ _ _ _ _ _");
        assert(res == 10);
    }

    @Test
    public void Valid_Morse_To_Int_Return83() {
        int res = morse_to_int("_ _ _ . . . . . _ _");
        assert(res == 83);
    }

}
