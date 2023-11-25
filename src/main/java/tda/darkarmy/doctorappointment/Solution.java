package tda.darkarmy.doctorappointment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line=null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while((line=bufferedReader.readLine())!=null){
            stringBuilder.append(line+"/n");
        }
        System.out.println(codeHere(stringBuilder));
    }

    private static String codeHere(StringBuilder inputData) {
        String [] arr = inputData.toString().split("\n");
        String res = "";
        for(String st: arr){
            if(st.equals("42")){
                break;
            }
            res+=st+"\n";
        }
        return res;
    }
}
