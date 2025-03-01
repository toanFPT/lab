package com.mycompany.week2.ss1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author thais
 */
public class BMICalculator {
    private double weight;
    private double height;

    public BMICalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double calculateBMI() {
        return weight / (height * height); 
    }
    public String getBMIStatus() {
        double bmi = calculateBMI();

        if (bmi < 19) return "Dưới chuẩn";
        if (bmi >= 19 && bmi <= 25) return "Chuẩn";
        if (bmi > 25 && bmi <= 30) return "Thừa cân";
        if (bmi > 30 && bmi <= 40) return "Béo - nên giảm cân";
        return "Rất béo - nên giảm cân ngay";
    }

    
    
}
