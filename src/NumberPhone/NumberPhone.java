package NumberPhone;

import java.util.*;

public class NumberPhone {
    private Map<String, List<String>> book = new HashMap<>();

public void add(String surname, String phoneNumber) {

    book.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
}
public List<String> get(String surname) {
    return book.getOrDefault(surname, Collections.emptyList()); } }