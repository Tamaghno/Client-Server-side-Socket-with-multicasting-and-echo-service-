import java.net.*;
import java.io.*;

public class client
{
    public static void main(String args[])throws IOException
    {
        Socket s1=new Socket("localhost",3000);

        PrintWriter pr=new PrintWriter(s1.getOutputStream());
        pr.println("hello from client 1");//from client to server 
        pr.flush();

        InputStreamReader in = new InputStreamReader(s1.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str=br.readLine();
        System.out.println("Server : "+str);
    }
}