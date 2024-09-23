package com.deloitte.lab06.ex04;

import java.util.HashMap;
import java.util.Map;

public class MedalGiver {
	
    public static Map<String, String> getStudents(HashMap<String, Integer> studentMarks) {

        Map<String, String> eligibleStudents = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String registrationNumber = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                eligibleStudents.put(registrationNumber, "Gold");
            } else if (marks >= 80) {
                eligibleStudents.put(registrationNumber, "Silver");
            } else if (marks >= 70) {
                eligibleStudents.put(registrationNumber, "Bronze");
            }
        }
        
        return eligibleStudents;
    }

    public static void main(String[] args) {
   
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("S01", 95);
        studentMarks.put("S02", 85);
        studentMarks.put("S03", 75);
        studentMarks.put("S04", 65); 
        studentMarks.put("S05", 80);

        Map<String, String> medalWinners = getStudents(studentMarks);

        System.out.println("Students eligible for medals: " + medalWinners);
    }

}
