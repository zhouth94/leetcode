package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class 独特的电子邮件地址 {
	public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails) {
            int at = email.indexOf("@");
            String domain = email.substring(at+1);
            String name = email.substring(0, at);
            StringBuilder realName = new StringBuilder();
            for(int i = 0;i < name.length();i ++) {
                if(name.charAt(i) == '+') {
                    break;
                }else if(name.charAt(i) == '.') {
                    continue;
                }else {
                    realName.append(name.charAt(i));
                }
            }
            realName = realName.append("@").append(domain);
            set.add(realName.toString());
        }
        return set.size();
    }

}
