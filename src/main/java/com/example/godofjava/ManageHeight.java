package com.example.godofjava;

import java.util.Scanner;

public class ManageHeight {

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setDate();
        System.out.println("결과");
        manageHeight.printHeight(5);
        manageHeight.printAverage(5);
    }

    // 클래스의 인스턴스 변수로 2차원 배열선언
    int[][] gradeheights;

    public void setDate() {

        gradeheights = new int[5][];
        gradeheights[0] = new int[]{170, 180, 173, 175, 177};
        gradeheights[1] = new int[]{160, 165, 167, 186};
        gradeheights[2] = new int[]{158, 177, 187, 176};
        gradeheights[3] = new int[]{173, 182, 181};
        gradeheights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("classNo: "+classNo);
        for (int data : gradeheights[classNo-1]){
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double totalHeight = 0;
        double averageHeight;
        for(int data : gradeheights[classNo-1]){
            totalHeight += data;
        }
        averageHeight = totalHeight/gradeheights[classNo-1].length;

        System.out.println("Height average: "+averageHeight);
    }

}
