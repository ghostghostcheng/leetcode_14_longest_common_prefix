package leetcode_14_longest_common_prefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        
        String LCP = "";
        
        if(strs.length == 0) {
            return "";
        }
        
        if(strs.length == 1) {
            return strs[0];
        }
        
        String longStr = "", shortStr = "";
        
        for(int i = 0; i < strs.length - 1; i++) {
            if(strs[i].length() == 0 || strs[i + 1].length() == 0) {
                return "";
            }
            if (i == 0) {
                if(strs[i].length() < strs[i + 1].length()) {
                    longStr = strs[i + 1];
                    shortStr = strs[i];
                } else {
                    longStr = strs[i];
                    shortStr = strs[i + 1];
                }
            } else {
                if(strs[i].length() < LCP.length()) {
                    longStr = LCP;
                    shortStr = strs[i];
                } else {
                    longStr = strs[i];
                    shortStr = LCP;
                }
            }
            
            LCP = "";
            
            for(int j = 0; j < shortStr.length(); j++) {
                if(shortStr.charAt(j) == longStr.charAt(j)) {
                    LCP = LCP + shortStr.charAt(j);
                } else {
                   break;
                }
            }
        }
        
        String lastStr = "";

        if(strs[strs.length - 1].length() > 0) {
            lastStr = strs[strs.length - 1];
        } else {
            return "";
        }
        
        if(lastStr.length() < LCP.length()) {
            longStr = LCP;
            shortStr = lastStr;
        } else {
            longStr = lastStr;
            shortStr = LCP;
        }
        
        LCP = "";
        for(int j = 0; j < shortStr.length(); j++) {
            if(shortStr.charAt(j) == longStr.charAt(j)) {
                LCP = LCP + shortStr.charAt(j);
            } else {
               break;
            }
        }
       
        return LCP;
    }
}