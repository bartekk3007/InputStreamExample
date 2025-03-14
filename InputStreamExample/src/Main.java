import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("src" + File.separator + "wyniki.txt");
        /*
        int i = fileInputStream.read();
        while(i != -1)
        {
            System.out.print((char) i);
            i = fileInputStream.read();
        }
        fileInputStream.close();
        */

        /*
        byte[] byteArray = fileInputStream.readAllBytes();
        char[] charArray = new String(byteArray).toCharArray();
        System.out.println(Arrays.toString(charArray));
        */

        DataInputStream dataInputStream = new DataInputStream(fileInputStream = new FileInputStream("src\\wyniki.txt"));
        char letter1 = dataInputStream.readChar();
        System.out.println(letter1);

        Charset charset = Charset.defaultCharset();
        System.out.println(charset);
    }
}