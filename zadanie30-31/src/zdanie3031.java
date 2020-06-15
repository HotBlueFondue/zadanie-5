import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class zdanie3031 
{
	
	static void liczZnakiSlowa(String f) throws IOException{ 
        File file;
        file = new File(f);
        String charly="";
        FileInputStream fis = new FileInputStream(file);
        int white=0;
   
       byte[] t = new byte[(int)file.length()];
        fis.read(t);
        charly = new String(t);
        white=charly.length()- charly.replaceAll("\\s","").length();
        String[] words=charly.split("\\s+|,\\s*|\\.\\s*");
        int [] tablica = new int []{charly.length(),white,words.length};
        for(int i=0; i<tablica.length;i++)
        {
        	System.out.print(tablica[i]+", ");
        }

        fis.close();
}


		public static void main(String[] args) throws IOException 
		{
   
    liczZnakiSlowa("test.txt");
    
		}
		}

