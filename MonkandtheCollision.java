/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int count=0,flag=0;
        int n=0;
        for(int i=0;i<t;i++)
        {
             n = input.nextInt();
            int x[] = new int[n];
            int f[] = new int[n];
            for(int j=0;j<n;j++)
            {
                 x[j] = input.nextInt();
                 f[j] = x[j] % 10;   
            }
            Arrays.sort(f);
            
            for(int k=0;k<n-1;k++)
            {
                    if(f[k] == f[k+1])
                    {  
                        count++;
                        flag = 1;    
                    }
                    else
                    {
                        flag=0;
                    
                    }
            }
          
            if(flag == 1)
            {
                System.out.println(count);
            }
            else 
            {
                System.out.println("0");
            }
            count=0;
        }
        
    }
}
