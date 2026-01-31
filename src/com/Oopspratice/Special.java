package com.Oopspratice;



public class Special {
    static void main() {
        String s=")abc(@fad*";
        System.out.println(speStr(s));
    }
    private static String speStr(String s) {
            StringBuilder letters = new StringBuilder();
            StringBuilder specials = new StringBuilder();
            // collect
            for (char ch : s.toCharArray()) {
                if (Character.isLetter(ch))
                    letters.append(ch);
                else
                    specials.append(ch);
            }

            // reverse both
            letters.reverse();
            specials.reverse();

            // rebuild
            StringBuilder result = new StringBuilder();

            int l = 0, sp = 0;

            for (char ch : s.toCharArray()) {
                if (Character.isLetter(ch))
                    result.append(letters.charAt(l++));
                else
                    result.append(specials.charAt(sp++));
            }

            return result.toString();
        }
    }
