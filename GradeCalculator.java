public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "Ap Comp Sci A";

    int timeSpentMin = 135;

    int score1 = 75;

    int score2 = 99;

    int score3 = 80;

    int score4 = 100;

    double quiz1 = 89.2;

    double quiz2 = 98.1;

    double exam = 87.58;

    int weeklyTimeSpentHrs = (timeSpentMin / 60);

    int weeklyTimeSpentMins = (timeSpentMin % 60);

    System.out.println("Weekly time spent: " + weeklyTimeSpentHrs + "h" + weeklyTimeSpentMins );

    double avgHwGrade = ((double)(score1 + score2 + score3 + score4) / 4.0);

    double avgQuizGrade = (quiz1 + quiz2) / 2.0;

    System.out.println("Average Homework grade: " + avgHwGrade);

    System.out.println("Average Quiz grade: " + avgQuizGrade);

    System.out.println("Final Exam grade: " + exam);

    double finalGrade = ((avgHwGrade * 0.35) + (avgQuizGrade * 0.15) + (exam * 0.50));

    int finalGradeRounded = (int)(finalGrade + 0.5);

    System.out.println("Overall grade: " + finalGradeRounded);



  }
}
