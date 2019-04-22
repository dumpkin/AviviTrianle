package com.dumpkin;

public class Triangle {

    private double perimetrTr;
    private double squareTr;
    private double katet1;
    private double katet2;

    //calculate triangle perimetr
    public double getPerimetrTr() {
        calcPerim();
        return perimetrTr;
    }

    //calculate triangle square
    public double getSquareTr() {
        calcSquare();
        return squareTr;
    }

    //set katets
    public void setKatets(double a,double b){
        this.katet1=a;
        this.katet2=b;
    }


    //calculate triangle square with parameters
    public double calculatSquareTr(double katetA, double katetB) {
        return (katetA * katetB) / 2;
    }

    //calculate triangle Perimeter with parameters
    public double calculatePerimeter(double katetA, double katetB) {
        return katetA + katetB + Math.sqrt((katetA * katetA) + (katetB * katetB));
    }


    //calculate triangle Perimeter without parameters
    private void calcPerim() {
        perimetrTr = this.katet1 +  this.katet2 + Math.sqrt( this.katet1 *  this.katet1 +  this.katet2 *  this.katet2);
    }

    //calculate triangle square without parameters
    private void calcSquare() {
        squareTr =  (this.katet1 * this.katet2) / 2;

    }

}
