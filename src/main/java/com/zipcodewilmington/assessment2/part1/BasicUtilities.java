package com.zipcodewilmington.assessment2.part1;

import java.util.regex.Pattern;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value > 5) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isLessThan7(Integer value) {
        if (value < 7) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate < 5 || valueToEvaluate > 7) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean startsWith(String string, Character character) {
        String lowerCase;
        lowerCase= string.toLowerCase();
        char [] chars = lowerCase.toCharArray();
        char firstLetter = chars[0];
        char lowerCaseChar;
        lowerCaseChar = character.toLowerCase(character);
        System.out.println(firstLetter);
        System.out.println(lowerCaseChar);
        if (lowerCaseChar == firstLetter)
        { return true; }
            else {return false;}

        //System.out.println(character);
        //if(firstLetter == )

//        character = character.toLowerCase(character);
//        if(string.substring(0,1).toLowerCase().equals(character))
//        {return true;}
//        else {return false;}

        //String firstLetter = character.toString();




//        boolean startsWith = false;
//        string = string.toLowerCase();
//        character = character.toLowerCase(character);
//        System.out.println(character);
//        String firstLetter = string.substring(0, 1);
//        System.out.println(firstLetter);
//        if (firstLetter.equals(character)) {
//            startsWith = true;
//        }
//        return startsWith;
  }

}


