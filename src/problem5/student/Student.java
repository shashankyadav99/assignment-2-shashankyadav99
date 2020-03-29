/*
 *  Created by IntelliJ IDEA.
 *  User: Shashank
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    private String name;
    private int rollNumber;
    private int backLogCounter;

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "---------------------------------------" + "\n" +
                "Name -- " + getName() + "\n" +
                "Roll Number -- " + getRollNumber() + "\n" +
                "Back Log Value -- " + getBackLogCounter() + "\n" +
                "---------------------------------------";
    }
}