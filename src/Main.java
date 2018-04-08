
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {

    private static Charset USASCII = Charset.forName("UTF-8");
    private static char charAlphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static String key = "vrhpaf";
    private static String pFile = "C:/Users/Gaetan/Documents/Fichiers/PG.txt";

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Crypto crypto = new Crypto();
        Scanner s = new Scanner(System.in);
        String line = "";
        Charset charset = Charset.forName("Cp1252");
        String result= "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pFile), USASCII))) {
            do{
                //if(reader.readLine()!="\n")
                    line += reader.readLine();
                    line += " ";
            }while(reader.readLine()!=null);


            result = crypto.decode_operation( line, key.getBytes("US-ASCII"));
            System.out.println(key +"  ----  "+ result);
            System.out.println(line.length());


        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

//        int time =0;
//        Scanner scanner = new Scanner(file);
//
//        String message = "Fx8JCRsdHw==";
//
//        String result = "";
//        for(int a1 =0;a1<26;a1++){
//            for(int a2 =0;a2<26;a2++){
//                for(int a3 =0;a3<26;a3++){
//                    for(int a4 =0;a4<26;a4++){
//                        for(int a5 =0;a5<26;a5++){
//                            for(int a6 =0;a6<26;a6++){
//                                key += charAlphabet[a1];
//                                key +=charAlphabet[a2];
//                                key +=charAlphabet[a3];
//                                key +=charAlphabet[a4];
//                                key +=charAlphabet[a5];
//                                key +=charAlphabet[a6];
//                                //System.out.println(crypto.decode_operation(message, key));
//
//                                result = crypto.decode_operation( line, "vrhpaf");
//                                if(result!= null){
//                                    System.out.println(key +"  ----  "+ result);
//                                    System.out.println(time);
//                                    System.exit(0);
//                                }
//
//
//                                time++;
//                                key="";
//                            }
//
//                        }
//                    }
//                }
//            }
//        }


    }

}
