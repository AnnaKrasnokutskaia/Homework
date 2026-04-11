package homework8;

/* На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}*/

import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        String[] wordMultiple = {"ыыыыы", "аа", "аа", "a", "c", "b", "f", "ыыыыы", "h"};
        Map<String,Boolean> words = new TreeMap<>();
        for (String word : wordMultiple) {
            if (! words.containsKey(word)){
                words.put(word, false);
            } else {
                words.put(word, true);
            }
        }
        System.out.println(words);
    }
}
