import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Решение задачи №1 по теме: коллекции HashMap, HashSet.
 */
public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                                 "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                                 "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                                 "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        fillingMap(map, text);
        findMinAndMax(map);
    }

    /**
     * в данном методе идет заполнение коллекции HashMap символами,
     * которые проходят валидацию: если символ повторяется, то его значение
     * увеличивается на 1.
     *
     * @param map
     * @param text
     * @return коллекция символов.
     */
    public static Map<Character, Integer> fillingMap(Map<Character, Integer> map, String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (!(Character.isLetter(c)) || Character.isWhitespace(c)) {
                continue;
            }
            c = Character.toLowerCase(c);
            if (!map.containsKey(c)) {
                Integer value = 1;
                map.put(c, value);
            } else {
                int value2 = map.get(c);
                value2++;
                map.put(c, value2);
            }
        }
        return map;
    }

    /**
     * в данном методе осуществляется поиск минимального и максимального значения в коллекции.
     *
     * @param map
     */
    public static void findMinAndMax(Map<Character, Integer> map) {
        Collection<Integer> value = map.values();
        int minValue = Collections.min(value);
        int maxValue = Collections.max(value);
        System.out.println("minimal value in map: " + minValue);
        System.out.println("maximum value in map: " + maxValue);
    }
}
