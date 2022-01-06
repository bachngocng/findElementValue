package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] student = {"Tinh","Thuy","Cuong","Bach"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)){
                System.out.println("Vi tri cua hoc sinh trong danh sach" + name + "la" + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("khong co" + name + " trong danh sach.");

        }
    }
}
