// =======================
//       READ NOTES
// =======================
// i struggled quite a lot with this lab, I asked Haoran to share his code and then explain it to me
// hence why my code for the last 2 is very similar if not the same as his.
public class Main {
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            char idx = str.charAt(i);
            if (idx == '(') {
                x++;
            } else if (idx == ')') {
                x--;
            }
            if (x < 0) {
                return false;
            }
        }

        return x == 0;
    }

    // 2. reverseInteger
    public static String reverseInteger(int num) {
        StringBuilder returnString = new StringBuilder();
        for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            returnString.append(String.valueOf(num).charAt(i));
        }
        return returnString.toString();
    }

    // 3. encryptThis
    public static String encryptThis(String str){
        str = str.concat(" ");
        StringBuilder rString = new StringBuilder();
        int fLetter = 0;
        rString.append((int)str.charAt(fLetter));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                rString.append(i - 1 != fLetter ? str.charAt(i - 1) : "").append(i - 1 - fLetter > 1 ? str.substring(fLetter + 2, i - 1) + str.charAt(fLetter + 1) : "");
            }
            if (str.charAt(i - 1) == ' '){
                fLetter = i;
                rString.append(" ").append((int)str.charAt(fLetter));
            }
        }
        return rString.toString();
    }
    // 4. decipherThis
    public static String decipherThis(String str){
        str = str.concat(" ");
        StringBuilder rString = new StringBuilder();
        int[] fLetter = new int[]{0, 0};
        fLetter[0] = 0;
        for (int j = 0; Character.isDigit(str.charAt(j)); j++){
            fLetter[1] = j;
        }
        rString.append((char)Integer.parseInt(str.substring(fLetter[0], fLetter[1] + 1)));
        for (int i = fLetter[1] + 1; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                rString.append(i - 1 != fLetter[1] ? str.charAt(i - 1) : "").append(i - 1 - fLetter[1] > 1 ? str.substring(fLetter[1] + 2, i - 1) + str.charAt(fLetter[1] + 1) : "");
            }
            if (str.charAt(i - 1) == ' '){
                fLetter[0] = i;
                for (int j = fLetter[0]; Character.isDigit(str.charAt(j)); j++){
                    fLetter[1] = j;
                }
                rString.append(" ").append((char)Integer.parseInt(str.substring(fLetter[0], fLetter[1] + 1)));
            }
        }
        return rString.toString();
    }
    }
