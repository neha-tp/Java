import java.io.*;
import java.util.Scanner;

public class LoggerSetup {
    public static PrintWriter logWriter;

    public static void setupLogger() throws Exception {
        FileWriter fw = new FileWriter("log.txt", true); 
        logWriter = new PrintWriter(fw, true); 
        PrintStream originalOut = System.out;

        PrintStream logOut = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                originalOut.write(b);
                logWriter.write(b);
                logWriter.flush();
            }

            @Override
            public void write(byte[] b, int off, int len) {
                originalOut.write(b, off, len);
                logWriter.write(new String(b, off, len));
                logWriter.flush();
            }
        }, true);

        System.setOut(logOut);
        System.setErr(logOut);
    }

    public static String nextLineAndLog(Scanner sc) {
        String input = sc.nextLine();
        logWriter.println(input);
        return input;
    }
}
