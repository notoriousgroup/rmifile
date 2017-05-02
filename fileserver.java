import java.rmi.*;
import java.io.*;
import java.net.*;
public class fileserver
{
public static void main(String args[])
{
try{
fileimplement fi=new fileimplement("fileserver");
Naming.rebind("//127.0.0.1/fileserver",fi);}
catch(Exception e){
System.out.println(" "+e.getMessage());
e.printStackTrace();
}}
} 