package com.isaacxie.leetcode;

public class _AddBoldTagInString {
	// https://leetcode.com/problems/add-bold-tag-in-string
	
    public String addBoldTag(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            for(String word : dict) {
                if(s.startsWith(word, i)) {
                    for(int k = i; k < word.length() + i; k++) {
                        bold[k] = true;
                    }
                }
            }
        }
       for(int i = 0; i < s.length(); ) {
           if(!bold[i]) {
               sb.append(s.charAt(i));
               i++;
               continue;
           }
           int start = i;
           while(i < s.length() && bold[i]) {
               i++;
           }
           sb.append("<b>").append(s.substring(start, i)).append("</b>");
       }
       return sb.toString();
    }
}