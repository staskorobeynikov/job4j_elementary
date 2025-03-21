package ru.job4j.algorithm.math;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];
            localName = localName.replace(".", "");
            int index = localName.indexOf("+");
            if (index != -1) {
                localName = localName.substring(0, index);
            }
            String uniqueEmail = localName + "@" + domainName;
            result.add(uniqueEmail);
        }
        return result.size();
    }
}