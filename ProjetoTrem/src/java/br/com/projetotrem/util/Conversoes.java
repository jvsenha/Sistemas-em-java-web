package br.com.projetotrem.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversoes {

     public static Date converterData(String data) throws ParseException {
        if(!data.trim().equals("") || data != null){
            try{
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                return fmt.parse(data);  
            }catch(Exception ex){
                System.out.println("Problemas ao converter Data! Erro: "+ex.getMessage());
                ex.printStackTrace();
                return null;
            }
        }else{
            return null;
        }
    }
}
