public class StringThings {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        String reversed = exercise4("Hello, World!");
        System.out.println("Reversed string: " + reversed);
        exercise5();
        exercise6();
        exercise7("Alice", "Bob");
        String time = timeString(14, 30);
        System.out.println("Formatted time: " + time);
        exercise9();
    }

    // Exercise 1: Roman alphabet
    public static void exercise1() {
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Exercise 2: Greek alphabet
    public static void exercise2() {
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }

    // Exercise 3: Replace
    public static void exercise3() {
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "cs");
        System.out.println("Replaced text: " + text);
    }

    // Exercise 4: Reverse
    public static String exercise4(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    // Exercise 5: Substring
    public static void exercise5() {
        String fruit = "banana";
        System.out.println("Substring (0, 3): " + fruit.substring(0, 3));
        System.out.println("Substring (2, 5): " + fruit.substring(2, 5));
        System.out.println("Substring (6, 6): " + fruit.substring(6, 6));
    }

    // Exercise 6: IndexOf
    public static void exercise6() {
        String fruit = "banana";
        int index = fruit.indexOf('a');
        System.out.println("Index of 'a' in 'banana': " + index);
    }

    // Exercise 7: compareTo
    public static void exercise7(String name1, String name2) {
        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println(name1 + " comes before " + name2 + ".");
        } else {
            System.out.println(name2 + " comes before " + name1 + ".");
        }
    }

    // Exercise 8: Format
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12; // midnight
            }
        } else {
            ampm = "PM";
            if (hour != 12) {
                hour = hour - 12;
            }
        }
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }

    // Exercise 9: Wrapper Class
    public static void exercise9() {
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println("Parsed integer: " + num);

        int num2 = 12345;
        String str2 = Integer.toString(num2);
        System.out.println("Converted string: " + str2);
    }
}