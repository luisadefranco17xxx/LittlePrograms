package at.campus02.zam21.pr1;

import java.util.Arrays;

public class Exercise8Class {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,-1,11,12},{13,14,15,16}};

        String[] firstList={"Stefan","Anton","Monika","Viktoria","Nike"};
        String[] secondList={ "Maximilian","Severin","Viktoria","Markus","Kevin"};
        System.out.println("findeKleinsteZahl(arr) = " + findeKleinsteZahl(arr));
        System.out.println("findeKleinsteZahlMath(arr) = " + findeKleinsteZahlMath(arr));
        printArr(arr);
        System.out.println("summeGegenDiagonale(arr) = " + summeGegenDiagonale(arr));
        System.out.println();
        System.out.println("Arrays.toString(mittelwerte(arr)) = " + Arrays.toString(mittelwerte(arr)));
        System.out.println();
        String[] myString=luckyLooser(firstList,secondList);

        System.out.println("luckyLooser(firstList,secondList) = " + (luckyLooser(firstList,secondList)));
        printArrString(myString);


        int[][] mySmartphonesArray={{1,20},{5,60},{9,100},{13,140}};
        int[]  myHandySales={14,140};
        int[]  myHandySales2={15,150};
        int[][] newArray;
        System.out.println("oneSmartphoneSales(myHandySales,mySmartphonesArray) = " +Arrays.toString(oneSmartphoneSales(myHandySales,mySmartphonesArray)));
        printArr(oneSmartphoneSales(myHandySales,mySmartphonesArray));
        newArray=oneSmartphoneSales(myHandySales,mySmartphonesArray);
        System.out.println("Eine neue Model dazu: Arrays.toString(myHandySales2) = " + Arrays.toString(myHandySales2));
        oneSmartphoneSales(myHandySales2,newArray);
        printArr(oneSmartphoneSales(myHandySales2,newArray));
    }



    public static int findeKleinsteZahl (int[][] myArray){
        int kleinsteZahl=100;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if(myArray[i][j]<kleinsteZahl){
                    kleinsteZahl=myArray[i][j];
                }
            }
        }

        return kleinsteZahl;
    }

    public static int findeKleinsteZahlMath (int[][] myArray){
        int kleinsteZahl=Math.min(myArray[0][0],myArray[0][1]);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length-1; j++) {
              
               if (kleinsteZahl>Math.min(myArray[i][j],myArray[i][j+1])) {
                   kleinsteZahl=Math.min(myArray[i][j],myArray[i][j+1]);
                }
            }
        }

        return kleinsteZahl;
    }

    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printArrString(String[] arr){
        for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + "\t");


        }
    }


    public static  int summeGegenDiagonale(int[][] arr){
        int summ=0, index;
        for (int i = 0; i < arr.length; i++) {
            index=arr[i].length-1-i;
            summ=summ+arr[i][index];
        }
        return summ;
    }

    public static int[] mittelwerte(int[][] arr){
        int[] summeZeile = new int[arr.length];
        int[] mittleWert = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summeZeile[i] = summeZeile[i]+ arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            mittleWert[i]=summeZeile[i]/ arr.length;
        }
        return mittleWert;
    }

    public static String[] luckyLooser(String[] firstLoosers, String[] secondLoosers){
        String[] trostLooser;
        int counter=0;
        if (firstLoosers.length>secondLoosers.length){
            trostLooser = new String[firstLoosers.length];
        } else {
            trostLooser= new String[secondLoosers.length];
        }
        for (int i = 0; i < firstLoosers.length; i++) {
            for (int j = 0; j < secondLoosers.length; j++) {
                if (firstLoosers[i] == secondLoosers[j]) {
                    trostLooser[counter]=firstLoosers[i];
                    counter++;
                }
            }
        }
        return trostLooser;
    }

    public static int[][] oneSmartphoneSales(int[] oneModell,int[][] arrayAllModell ) {
         int[][] newArrayAllModell= new int[arrayAllModell.length+1][2];
        for (int i = 0; i < arrayAllModell.length; i++) {
            for (int j = 0; j < 2; j++) {
                newArrayAllModell[i][j]=arrayAllModell[i][j];
            }
        }
        if (oneModell.length!=0) {
            newArrayAllModell[arrayAllModell.length][0]=oneModell[0];
            newArrayAllModell[arrayAllModell.length][1]=oneModell[1];
        }
        return newArrayAllModell;
    }


 }
