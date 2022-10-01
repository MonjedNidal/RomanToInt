public class Main {
    public static void main(String[] args) {
        String s = "MMMCC";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> {
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                            continue;
                        } else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                            continue;
                        }
                    }
                    result += 1;
                }
                case 'V' -> result += 5;
                case 'X' -> {
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                            continue;
                        } else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                            continue;
                        }
                    }
                    result += 10;
                }
                case 'L' -> result += 50;
                case 'C' -> {
                    if (i + 1 != s.length()) {
                        if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
                            continue;
                        } else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                            continue;
                        }
                    }
                    result += 100;
                }
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
            }
        }
        return result;
    }
}
