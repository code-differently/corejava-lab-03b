package com.codedifferently.labs.lab03a.examples.example01_employees;

public class Company {

    public static Employee promotion(Employee ... employees){
        Employee bestCandidate = employees[0];

        for(int i = 1; i < employees.length; i++){
            if(employees[i].getRating() > bestCandidate.getRating()){
                bestCandidate = employees[i];
            }
        }
        return bestCandidate;
    }

    public static Employee fired(Employee ... employees){
        Employee worstCandidate = employees[0];
        for(int i = 1; i < employees.length; i++){
            if(employees[i].getRating() < worstCandidate.getRating()){
                worstCandidate = employees[i];
            }
        }
        return worstCandidate;
    }

    public static void main(String[] args) {
        Employee janet = new Employee("Janet Jackson", 90.0);
        Employee tito = new Employee("Tito Jackson", 89.9);
        Employee jermaine = new Employee("Jermaine Jackson", 86.0);
        Employee newManager = promotion(janet, tito, jermaine);
        System.out.println("The new manager is : " + newManager.getName());
        Employee fired = fired(janet, tito, jermaine);
        System.out.println("Sorry " +fired.getName()+ " we are letting you go");
    }
}
