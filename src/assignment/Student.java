/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author unrav
 */
public class Student {

    String name;
    double history;
    double math;
    double english;
    double web;
    double networking;
    double finalMark;
    String studentID;

    public Student() {

    }

    public Student(String name, String studentID, double history, double math, double web, double networking, double english) {
        this.name = name;
        setHistory(history);
        setMath(math);
        setWeb(web);
        setNetworking(networking);
        setEnglish(english);
        this.studentID = studentID;
    }

    private void setEnglish(double english) {

        if (english >= 0 && english <= 100) {
            this.english = english;
        } else {
           throw new IllegalArgumentException ("Student couldn't be saved. Wrong English marks value, please enter a value between 0-100.");
        }

    }

    public void setHistory(double history) {
        if (history >=0 && history <= 100) {
            this.history = history;
        } else {
           throw new IllegalArgumentException ("Student couldn't be saved. Wrong History marks value, please enter a value between 0-100.");
        }
    }

    public void setMath(double math) {

        if (math >=0 && math <= 100) {
            this.math = math;
        } else {
           throw new IllegalArgumentException ("Student couldn't be saved. Wrong Math marks value, please enter a value between 0-100.");
        }
    }

    public void setWeb(double web) {
        if (web >= 0 && web <= 100) {
            this.web = web;
        } else {
           throw new IllegalArgumentException ("Student couldn't be saved. Wrong Web marks value, please enter a value between 0-100.");
        }
    }

    public void setNetworking(double networking) {
        if (networking >=0 && networking <= 100) {
            this.networking = networking;
        } else {
           throw new IllegalArgumentException ("Student couldn't be saved. Wrong Networking marks value, please enter a value between 0-100.");
        }
    }

    public String getName() {
        return name;
    }

    public double getHistory() {
        return history;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getWeb() {
        return web;
    }

    public double getNetworking() {
        return networking;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getFinalMarks() {
        finalMark = (getHistory() + getMath() + getEnglish() + getWeb() + getNetworking()) / 5;
        return finalMark;
    }

    public String getGrade() {
        if (finalMark >= 90 && finalMark <= 100) {
            return (",  Grade: A");
        }
        if (finalMark >= 80 && finalMark < 90) {
            return (",  Grade: B");
        }
        if (finalMark >= 70 && finalMark < 80) {
            return (",  Grade: C");
        }
        if (finalMark >= 50 && finalMark < 70) {
            return (",  Grade: D");
        }
        if (finalMark < 50) {
            return (",  Grade: F");
        }
        return "Student does not have a mark";
    }

    public void printStudent() {
        getFinalMarks();
        System.out.println("Student: " + getName() + " Final Grade: " + getGrade());
    }

}
