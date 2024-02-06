package com.smartdev.service;

import com.smartdev.InterfaceService.IAlarmeService;
import com.smartdev.entities.Alarme;
import com.smartdev.repository.AlarmeRepo;
import org.apache.logging.log4j.util.Chars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.*;

@Service
public class AlarmeService implements IAlarmeService {

    @Autowired
    AlarmeRepo alarmeRepo;

    @Override
    public Alarme addAlarme(Alarme alarme) {
        return alarmeRepo.save(alarme);
    }

    @Override
    public List<Alarme> getAlarmes() {
        return alarmeRepo.findAll();
    }

    @Override
    public void removeAlarme(Integer alarmeid) {
        alarmeRepo.deleteById(alarmeid);
    }

    public int exerciceSteing(String mot) {

        String[] m = mot.split("");
        int i, j, nbr = 0, k = 0;
        for (i = 0; i < mot.length(); i++) {
            for (j = i; j < mot.length(); j++) {
                List<String> l = new ArrayList<>();
                Set<String> s = new HashSet<>();
                for (k = i; k <= j; k++) {
                    l.add(m[k]);
                    s.add(m[k]);
                }
                if (l.size() == s.size()) {
                    nbr++;
                } else {
                    break;
                }
            }

        }
        return nbr;
    }

    public String mergeAlternately(String word1, String word2) {
        char[] merge = new char[word1.length() + word2.length()];
        int index = 0;
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                merge[index++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                merge[index++] = word1.charAt(i);
            }


        }

        return new String(merge);
    }

    public String gcdOfStrings(String str1, String str2) {
        Set<String> takeFromsmallString = new HashSet<>();
        String  result1 ="";
        String  result2="";
        String result="";
        int verifCount = 0;
        int count=0;

        int verifcountt = 0;
        int count2=0;


        if (str1.equals(str1.toUpperCase()) && str2.equals(str2.toUpperCase()) && str1.length() >= 1 && str1.length() <= 1000 && str2.length() >= 1 && str2.length() <= 100) {
            String smalString = getShorterString(str1, str2);
            String largeString =getLargeString(str1,str2);

            if (smalString.length() > 1) {
                for (int i = 0; i <= smalString.length(); i++) {
                    if(i==0){
                        i++;
                        takeFromsmallString.add(smalString.substring(0, i));
                    }else {
                        takeFromsmallString.add(smalString.substring(0, i));
                    }
                }



                    for( String valeurset : takeFromsmallString){
                        int getLenght = valeurset.length();



                        for (int i = 0 ; i+ getLenght<= largeString.length() ; i=i+getLenght){
                        if (valeurset.equals(largeString.substring(i,i+getLenght)) ){
                            count++;
                            if (verifCount < count) {
                                verifCount = count;
                                result1 = valeurset;
                            }

                        }


                    }


                        for (int i = 0 ; i+ getLenght<= smalString.length() ; i=i+getLenght){

                            if (valeurset.equals(smalString.substring(i,i+getLenght)) ) {
                                count2++;
                            }
                                if(verifcountt < count2){
                                    verifcountt = count2;
                                    result2 = valeurset;
                                }

                        }
                }

            }
        }
        if (verifCount > verifcountt && result1.equals(result2)) {
            result =result2;
            return result;

        } else if (verifCount < verifcountt && result1.equals(result2)) {
            result =result1;
            return result;

        } else {
            return result;
        }
    }

    public String getShorterString(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }
    public String getLargeString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }
}