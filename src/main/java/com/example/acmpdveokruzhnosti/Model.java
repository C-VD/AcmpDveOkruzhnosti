package com.example.acmpdveokruzhnosti;

import java.io.File;
import java.util.Scanner;

public class Model {
    public static void noGui(){
        Scanner sc = getInputTxtScanner();
        if (sc == null) {
            return;
        }
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        sc.nextLine();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        if (isOverlay(x1, y1, r1, x2, y2, r2)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean isOverlay(int x1, int y1, int r1, int x2, int y2, int r2){
        return Math.abs((x2 - x1) + (y2 - y1)) < r1 + r2;
    }

    static Scanner getInputTxtScanner(){
        // Just for ACMP
        String inputFileName = "INPUT.TXT";
        try{
            Scanner sc = new Scanner(new File(inputFileName));
            return sc;
        }
        catch(Exception e){
            System.out.println("Не удалось открыть " + inputFileName);
            return null;
        }
    }
}
