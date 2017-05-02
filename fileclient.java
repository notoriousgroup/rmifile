import java.net.*;
import java.rmi.*;
import java.io.*;
public class fileclient
{
 public static void main(String[] args)
 {
 try{
 InetAddress addr=InetAddress.getLocalHost();
 String address=addr.toString().substring(addr.toString().indexOf("/")+1);
 String url="rmi://"+ address + "/fileserver";
 fileinterface f1=(fileinterface)Naming.lookup(url);
 byte[] data=f1.downloadfile(args[0]);
 File ff=new File("f1.txt");
 BufferedOutputStream bos=new BufferedOutputStream(new
FileOutputStream(ff.getName()));
 bos.write(data,0,data.length);
 bos.flush();
 bos.close();}
 catch(Exception e){ 
 System.out.println(" "+e.getMessage());
 e.printStackTrace();
 }}} 