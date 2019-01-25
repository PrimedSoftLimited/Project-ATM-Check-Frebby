/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.check;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class ATMCheck {

    /**
     * @param args the command line arguments
     */
    static final long value = 378282246310005L;
    static String valueToString = String.valueOf(value);
    static char saveValueToStringForOdd = 0;
    static int multiplySaveToString = 0;
    static int addmultiplySaveToStringForOdd = 0;
    static char saveValueToStringForEven = 0;
    static int addMultiplySaveToStringForEven = 0;
    static int totalOfCalcAddMultiplySaveToStringForEven = 0;
    static int totalOfCalcAddAllSaveValueToStringForNotUsed = 0;
    static int overAllTotal = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your credit card number >>> ");
        long creditCardNum = scanner.nextLong();

        String convertCreditCardNum = String.valueOf(creditCardNum);
        if (convertCreditCardNum.length() % 2 == 0) {
            forCardsWithEvenDigits(creditCardNum);
        } else {
            forCardsWithOddDigits(creditCardNum);
        }
        System.out.println(overAllTotal);
    }

    public static void forCardsWithEvenDigits(long value) {
        valueToString = String.valueOf(value);
        for (int i = 0; i < valueToString.length(); ++i) {
            if (i % 2 == 0) {
                saveValueToStringForOdd = valueToString.charAt(i);
                multiplySaveToString = Character
                        .getNumericValue(saveValueToStringForOdd) * 2;
                if (multiplySaveToString < 9) {
                    addmultiplySaveToStringForOdd += multiplySaveToString;

                } else {
                    addMultiplySaveToStringForEven
                            = addMultiplySaveToStringForEven
                            + multiplySaveToString;

                    while (addMultiplySaveToStringForEven > 0) {
                        int calcAddMultiplySaveToStringForEven
                                = addMultiplySaveToStringForEven % 10;

                        totalOfCalcAddMultiplySaveToStringForEven
                                = totalOfCalcAddMultiplySaveToStringForEven
                                + calcAddMultiplySaveToStringForEven;

                        addMultiplySaveToStringForEven =
                                addMultiplySaveToStringForEven / 10;

                    }
                }

            } else {
                saveValueToStringForEven = valueToString.charAt(i);
                int convertSaveValueToStringForNotUsed;
                convertSaveValueToStringForNotUsed = Character
                        .getNumericValue(saveValueToStringForEven);
                while (convertSaveValueToStringForNotUsed > 0) {
                    int calcAddAllSaveValueToStringForNotUsed;
                    calcAddAllSaveValueToStringForNotUsed
                            = convertSaveValueToStringForNotUsed
                            % 10;
                    totalOfCalcAddAllSaveValueToStringForNotUsed
                            = totalOfCalcAddAllSaveValueToStringForNotUsed
                            + calcAddAllSaveValueToStringForNotUsed;
                    convertSaveValueToStringForNotUsed
                            = convertSaveValueToStringForNotUsed
                            / 10;
                }

            }
        }
        int addOddAndEven = totalOfCalcAddMultiplySaveToStringForEven +
                addmultiplySaveToStringForOdd;
        overAllTotal = addOddAndEven +
                totalOfCalcAddAllSaveValueToStringForNotUsed;
        String convertOverAllTotal = String.valueOf(overAllTotal);

        if (convertOverAllTotal.charAt(1) == '0') {
            System.out.println("Your credit card is valid");
        } else {
            System.out.println("Gerraraahhiiaaaa!!!!!!!. Fraud!!!");

        }
        String convertValue = String.valueOf(value);
        if (convertValue.startsWith("378")
                || convertValue.startsWith("371")) {
            System.out.println("Your credit card is an American Express Card");
        } else if (convertValue.startsWith("2222")
                || convertValue.startsWith("5555")
                || convertValue.startsWith("2221")
                || convertValue.startsWith("2223")
                || convertValue.startsWith("5105")) {
            System.out.println("Your credit card is a Master Card");
        } else if (convertValue.startsWith("4111")
                || convertValue.startsWith("4012")
                || convertValue.startsWith("4222")) {
            System.out.println("Your credit card is a Visa Card");

        } else if (convertValue.startsWith("3530")
                || convertValue.startsWith("3566")) {
            System.out.println("Your credit card is a JCB Card");
        } else if (convertValue.startsWith("60111")
                || convertValue.startsWith("60110")) {
            System.out.println("Your credit card is a Discover Card");
        } else if (convertValue.startsWith("3056")) {
            {
                System.out.println("Your credit card is a Discover Card");
            }

        }

    }

    public static void forCardsWithOddDigits(long value) {
        valueToString = String.valueOf(value);

        for (int i = 0; i < valueToString.length(); ++i) {
            if (i % 2 != 0) {
                saveValueToStringForOdd = valueToString.charAt(i);
                multiplySaveToString = Character
                        .getNumericValue(saveValueToStringForOdd) * 2;
                if (multiplySaveToString < 9) {
                    addmultiplySaveToStringForOdd += multiplySaveToString;

                } else {
                    addMultiplySaveToStringForEven
                            = addMultiplySaveToStringForEven
                            + multiplySaveToString;

                    while (addMultiplySaveToStringForEven > 0) {
                        int calcAddMultiplySaveToStringForEven
                                = addMultiplySaveToStringForEven % 10;

                        totalOfCalcAddMultiplySaveToStringForEven
                                = totalOfCalcAddMultiplySaveToStringForEven
                                + calcAddMultiplySaveToStringForEven;

                        addMultiplySaveToStringForEven = 
                                addMultiplySaveToStringForEven / 10;

                    }
                }

            } else {
                saveValueToStringForEven = valueToString.charAt(i);
                int convertSaveValueToStringForNotUsed;
                convertSaveValueToStringForNotUsed = Character.
                        getNumericValue(saveValueToStringForEven);
                while (convertSaveValueToStringForNotUsed > 0) {
                    int calcAddAllSaveValueToStringForNotUsed;
                    calcAddAllSaveValueToStringForNotUsed
                            = convertSaveValueToStringForNotUsed
                            % 10;
                    totalOfCalcAddAllSaveValueToStringForNotUsed
                            = totalOfCalcAddAllSaveValueToStringForNotUsed
                            + calcAddAllSaveValueToStringForNotUsed;
                    convertSaveValueToStringForNotUsed
                            = convertSaveValueToStringForNotUsed
                            / 10;
                }

            }

        }
        int addOddAndEven = totalOfCalcAddMultiplySaveToStringForEven +
                addmultiplySaveToStringForOdd;
        overAllTotal = addOddAndEven +
                totalOfCalcAddAllSaveValueToStringForNotUsed;
        String convertOverAllTotal = String.valueOf(overAllTotal);

        if (convertOverAllTotal.charAt(1) == '0') {
            System.out.println("Your credit card is valid");
        } else {
            System.out.println("Gerraraahhiiaaaa!!!!!!!. Fraud!!!");

        }
        String convertValue = String.valueOf(value);
        if (convertValue.startsWith("378")
                || convertValue.startsWith("371")) {
            System.out.println("Your credit card is an American Express Card");
        } else if (convertValue.startsWith("2222")
                || convertValue.startsWith("5555")
                || convertValue.startsWith("2221")
                || convertValue.startsWith("2223")
                || convertValue.startsWith("5105")) {
            System.out.println("Your credit card is a Master Card");
        } else if (convertValue.startsWith("4111")
                || convertValue.startsWith("4012")
                || convertValue.startsWith("4222")) {
            System.out.println("Your credit card is a Visa Card");

        } else if (convertValue.startsWith("3530")
                || convertValue.startsWith("3566")) {
            System.out.println("Your credit card is a JCB Card");
        } else if (convertValue.startsWith("60111")
                || convertValue.startsWith("60110")) {
            System.out.println("Your credit card is a Discover Card");
        } else if (convertValue.startsWith("3056")) {
            {
                System.out.println("Your credit card is a Discover Card");
            }

        }
    }
}
