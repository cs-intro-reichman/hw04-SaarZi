public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if ("aeiouAEIOU".indexOf(string.charAt(i)) != -1) {
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    result += (char) (string.charAt(i) - 32);
                } else {
                    result += string.charAt(i);
                }
            } else {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    result += (char) (string.charAt(i) + 32);
                } else {
                    result += string.charAt(i);
                }
            }
        }
        return result;
    }

    public static String camelCase(String string) {
        // Write your code here:
        String result = "";
        boolean capitalize = false;
        string = string.substring(string.indexOf("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        if (string.charAt(0) >= 97 && string.charAt(0) <= 122) {
            result += (char) (string.charAt(0) - 32);
        }
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                if (capitalize) {
                    result += (char) (string.charAt(i) - 32);
                } else {
                    result += string.charAt(i);
                }
            } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                if (capitalize) {
                    result += string.charAt(i);
                } else {
                    result += (char) (string.charAt(i) + 32);
                }
            } else {
                capitalize = true;
            }
        }

        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                result[counter] = i;
                counter++;
            }
        }

        return result;
    }
}
