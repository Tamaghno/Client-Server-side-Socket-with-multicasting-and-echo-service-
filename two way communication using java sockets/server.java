import java.net.*;
import java.io.*;

public class server
{
    public static void main(String args[])throws IOException
    {
        ServerSocket ss=new ServerSocket(3000);
        //ServerSocket ss2=new ServerSocket(3001);
        Socket s1=ss.accept();
        //Socket s2=ss2.accept();
        System.out.println("***********JAVA Socket programming**************");
        System.out.println("Clients Connected");

        InputStreamReader in = new InputStreamReader(s1.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str=br.readLine();
        System.out.println("Client : "+str);

        PrintWriter pr=new PrintWriter(s1.getOutputStream());
        pr.println("hello from server");//from client to server 
        pr.flush();

    }
}