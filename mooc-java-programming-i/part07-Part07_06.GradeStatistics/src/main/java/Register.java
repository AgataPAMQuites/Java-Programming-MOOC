
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agata
 */
public class Register {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public Register(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPointsGrades(int point){
        points.add(point);
        grades.add(pointsToGrade(point));
    }
    
    public double average(){
        double sumofPoints = 0;
        int count = 0;
        for(Integer point: points){
            sumofPoints += point;
            count++;
        }
        return (sumofPoints / count);
    }
    
    public String pass(){
        double sumofPoints = 0;
        int count = 0;
        
        for(Integer point: points){
            if(point >= 50){
                sumofPoints += point;
                count++;
            }
        }        
        double average50 = sumofPoints / count;        
        if(sumofPoints > 0 ){
            String string50 = String.valueOf(average50);
            return string50;
        } else {
            return "-";
        }
    }
     
    public double percentage(){
        double sumofPoints = 0;
        double participants = 0;
        double passing = 0;
        
        for(Integer point: points){
            if(point >= 50){
                passing++;
                participants++;
            } else {
            participants++;
            }
        }
        double percentage = 100 * passing / participants;
        if(passing > 0){
            return percentage;
        } else {
            return 0.0;
        }    
    }
    
     public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    
    
}
