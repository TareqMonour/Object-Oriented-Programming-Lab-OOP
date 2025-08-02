import java.io.*;

public class EmployeeAttachment {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String employeeFile = "employee.txt";
        String incrementFile = "increment.txt";

        try {
            // Take input from the user
            System.out.print("Enter the number of employees: ");
            int n = Integer.parseInt(br.readLine());

            // Write employee information to 'employee.txt'
            FileWriter writer = new FileWriter(employeeFile);
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter name for employee " + i + ": ");
                String name = br.readLine();

                System.out.print("Enter ID for employee " + i + ": ");
                String id = br.readLine();

                double totalScore = 0;
                for (int j = 1; j <= 6; j++) {
                    System.out.print("Enter score " + j + " for employee " + i + ": ");
                    double score = Double.parseDouble(br.readLine());
                    totalScore += score;
                }

                double averageScore = totalScore / 6;

                // Write employee information to 'employee.txt'
                writer.write(name + "\n");
                writer.write(id + "\n");
                writer.write(averageScore + "\n");
            }
            writer.close();

            // Read average scores from 'employee.txt' and find eligible employees
            FileReader fileReader = new FileReader(employeeFile);
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter incrementWriter = new FileWriter(incrementFile);
            String line;
            while ((line = reader.readLine()) != null) {
                double averageScore = Double.parseDouble(line);
                if (averageScore > 75) {
                    // Write eligible employee names to 'increment.txt'
                    incrementWriter.write(line + "\n");
                }
            }
            incrementWriter.close();
            reader.close();

            // Find employees with the maximum score
            FileReader fileReader2 = new FileReader(employeeFile);
            BufferedReader reader2 = new BufferedReader(fileReader2);
            double maxScore = 0;
            String maxScoreEmployee = "";
            while ((line = reader2.readLine()) != null) {
                String name = line;
                String id = reader2.readLine();
                double averageScore = Double.parseDouble(reader2.readLine());
                if (averageScore > maxScore) {
                    maxScore = averageScore;
                    maxScoreEmployee = name;
                }
            }
            reader2.close();

            // Print employees with the maximum score
            System.out.println("Employee(s) with the maximum score:");
            System.out.println(maxScoreEmployee + " - Score: " + maxScore);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
