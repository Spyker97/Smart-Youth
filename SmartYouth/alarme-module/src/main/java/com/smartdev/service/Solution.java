package com.smartdev.service;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        Set<String> takeFromSmallString = new HashSet<>();
        String result1 = "";
        String result2 = "";
        String result = "";

        if (str1.equals(str1.toUpperCase()) && str2.equals(str2.toUpperCase()) &&
                str1.length() >= 1 && str1.length() <= 1000 &&
                str2.length() >= 1 && str2.length() <= 1000) {

            String smallString = getShorterString(str1, str2);
            String largeString = getLargeString(str1, str2);

            if (smallString.length() > 1) {
                for (int i = 1; i <= smallString.length(); i++) {
                    takeFromSmallString.add(smallString.substring(0, i));
                }

                int verifCount = 0;

                for (String valueSet : takeFromSmallString) {
                    int getLength = valueSet.length();
                    int count = 0;

                    for (int i = 0; i + getLength <= largeString.length(); i += getLength) {
                        if (valueSet.equals(largeString.substring(i, i + getLength))) {
                            count++;
                            if (verifCount < count) {
                                verifCount = count;
                                result1 = valueSet;
                            }
                        }
                    }

                    int verifCount2 = 0;
                    int count2 = 0;

                    for (int i = 0; i + getLength <= smallString.length(); i += getLength) {
                        if (valueSet.equals(smallString.substring(i, i + getLength))) {
                            count2++;
                        }

                        if (verifCount2 < count2) {
                            verifCount2 = count2;
                            result2 = valueSet;
                        }
                    }
                }
            }
        }

        if (result1.equals(result2)) {
            result = result1;
        }

        return result;
    }

    public String getShorterString(String str1, String str2) {
        return (str1.length() < str2.length()) ? str1 : str2;
    }

    public String getLargeString(String str1, String str2) {
        return (str1.length() > str2.length()) ? str1 : str2;
    }
}
