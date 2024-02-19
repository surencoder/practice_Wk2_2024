import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {

public static void main(String[] args) throws IOException {
    
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter the integer input");

int a = Integer.parseInt(br.readLine());

System.out.println("Enter string");

String b = br.readLine();

System.out.println(a);
System.out.println(b);


}


    
}
