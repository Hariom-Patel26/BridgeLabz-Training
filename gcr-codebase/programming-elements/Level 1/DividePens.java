// Program to divide pens equally among students.
class DividePens {
    public static void main(String[] args) {

        // Total pens and total students
        int totalPens = 14;
        int totalStudents = 3;

        // Pens per student and Remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // print pensPerStudent and remainingPens
        System.out.println("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " + remainingPens);
    }
}
