import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class fileimplement extends UnicastRemoteObject implements fileinterface
{
 private String name;
 public fileimplement(String s)throws RemoteException {
 super();
 name=s;
 } public byte[] downloadfile(String fn)
 { 
 try{
 File fi=new File(fn);
 byte buf[]=new byte[(int)fi.length()];
 BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fn));
 bis.read(buf,0,buf.length);
 bis.close();
 return(buf); }
 catch(Exception ee) {
 System.out.println("Error:"+ee.getMessage());
 ee.printStackTrace();
 return(null);}}} 