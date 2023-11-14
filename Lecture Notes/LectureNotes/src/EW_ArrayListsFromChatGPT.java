/*
----------------------------------------------------------------------------------------------------------
    Name:	EW_ArrayListsFromChatGPT
    Author:	Edward V. Weber
    Language:	Java
    Date:	2023-08-09
    Purpose:	The purpose of this program is to demonstrate some of the methods from the ArrayList
                generic class.  But to generate this, I used a session from ChatGPT.  
                We will be going over this in more detail in the next class. 
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    EVW		2023-08-09	Original Version of Code
----------------------------------------------------------------------------------------------------------
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EW_ArrayListsFromChatGPT {

    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<String>();

        // Add some random student names with duplicates
        studentNames.addAll(Arrays.asList(
                "John Smith", "Emily Johnson", "Luis Rodriguez", "Sakura Tanaka", "Ahmed Khan",
                "Sophia Martinez", "Yusuke Suzuki", "Luis Rodriguez", "Anna Müller", "Carlos Chavez"));

        printSeparator();
        printStudentList(studentNames);
        System.out.println();

        printSeparator();
        System.out.println("After adding Maria García:");
        studentNames.add("Maria García");
        printStudentList(studentNames);
        System.out.println();

        // ... (other modifications)

        printSeparator();
        System.out.println("ArrayList converted to array:");
        Object[] studentArray = studentNames.toArray();
        System.out.println(Arrays.toString(studentArray));

        printSeparator();
        System.out.println(
                "This code was generated via a conversation between [YourName/IP/SessionID] and me, ChatGPT on "
                        + getCurrentDateTime());
    }

    private static void printStudentList(List<String> studentNames) {
        System.out.println("Student List:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Student #" + (i + 1) + ": " + studentNames.get(i));
        }
    }

    private static void printSeparator() {
        String separator = "-".repeat(90);
        System.out.println(separator);
    }

    private static String getCurrentDateTime() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(java.util.Calendar.getInstance().getTime());
    }
}
