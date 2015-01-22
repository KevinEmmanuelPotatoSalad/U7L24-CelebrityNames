import java.io.*;
import java.util.*;
public class CelebrityNames
{
    public static final String FILE_NAME = "CelebrityData.txt";
    public static void main(String args[]) throws IOException
    { 
        Scanner sf = new Scanner(new File(FILE_NAME));

        int maxIndx = -1;
        String text[] = new String[500];
        while(sf.hasNext( ))
        { 
            maxIndx++;
            text[maxIndx] = sf.nextLine( ); 
        } 
        sf.close( );
        
        String reversedName[] = new String[maxIndx + 1];
        for (int j = 0; j <= maxIndx; j++)
        { 
            Scanner sc = new Scanner( text[j] );
            String firstName = sc.next( );
            String middleName = sc.next( );
            String lastName = sc.next ( );
            String birthDate = sc.next ( );
            reversedName[j] = lastName + ", " + firstName + " " + middleName + " -- " + birthDate;
        } 
        
        Arrays.sort(reversedName);
        for (int j =0; j <= maxIndx; j++)
        { 
            System.out.println(reversedName[j]);
        } 
    }
}
