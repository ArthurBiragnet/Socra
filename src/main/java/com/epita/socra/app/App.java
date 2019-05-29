package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Write 'exit' to stop the program");
        App application = new App();
        application.run();
    }

    public void run(){
        int result = 0;
        String number_str = adapter.read();
        while (!number_str.equals("exit"))
        {
            try
            {
                result += Integer.parseInt(number_str);
            }
            catch (NumberFormatException e)
            {
                result += Morse_To_Int.morse_to_int(number_str);
            }
            adapter.write(Integer.toString(result));
            number_str = adapter.read();
        }
    }
}
