package com.mycompany.carprj;


/*
 
 */

/**
 *
 * @author Dell G5
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
//phuong thuc generic tra ve int (user nhap so nguyen)
    public <E> int int_getChoice(ArrayList<E> options) {
        int response;
        int N = options.size();

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        

        System.out.print("Please choose an option 1.. " + N + ": ");
        response = sc.nextInt();

        return response;
    }
//phuong thuc generic tra ve phan tu ung voi int user chon
    public <E> E ref_getChoice(BrandList options) {
        int response;
        int N = options.size();

        do {
            response = int_getChoice(options);
        } while (response < 1 || response > N);

        return options.get(response - 1);
    }
}
