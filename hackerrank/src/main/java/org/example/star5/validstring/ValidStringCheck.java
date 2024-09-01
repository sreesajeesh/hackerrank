package org.example.star5.validstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidStringCheck {

    public static void main(String[] args) {
        //System.out.println(validString2("aaaaabc"));
        System.out.println(validString2("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }

    public static String validString2(String s){
        if(s.length() == 1) return "YES";
        Map<Character, Long> charMap = s.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        long[] arr = new long[charMap.size()];
        if(charMap.size() == 1) return "YES";
        int i = 0;
        for(Map.Entry<Character, Long> entry : charMap.entrySet()){
            arr[i] = entry.getValue();
            i++;
        }
        Arrays.sort(arr);
        long first = arr[0];
        long second = arr[1];
        long secondLast = arr[arr.length - 2];
        long last = arr[arr.length - 1];

        if(first == last) return "YES";
        if(first == 1 && second == last) return "YES";
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        return "NO";
    }

    public static String validString1(String s){
        if(s.length() == 1) return "YES";
        Map<Character, Long> charMap = s.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        List<Long> charList = charMap.values()
                .stream()
                .collect(Collectors.toList());
        System.out.println(charList);
        Set<Long> charSet = new HashSet<>(charList);
        if(charSet.size() == 1)
            return "1 YES";
        if(charSet.size() > 2)
            return "1 NO";
        List<Long> listSet = new ArrayList<>(charSet);
        System.out.println(listSet);
        Map<Long, Integer> setCount = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            for (Long ln : charList) {
                if (Objects.equals(ln, listSet.get(i)))
                    setCount.put(ln, setCount.getOrDefault(ln, 0) + 1);
            }
        }
        System.out.println(setCount);
//        if(setCount[0] > 1 && setCount[1] > 1)
//            return "2 NO";
//        else if((Math.abs(listSet.get(0) - listSet.get(1)) > 1))
//            if()
//            return "3 NO";
//        else if(setCount[0] == 1 || setCount[1] == 1)
//            return "2 YES";
        return "4 NO";
    }
    public static String validString(String s){
        if(s.length() == 1) return "YES";
        Map<Character, Long> charMap = s.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        List<Long> charList = charMap.values()
                .stream()
                .collect(Collectors.toList());
        System.out.println(charList);
        Set<Long> charSet = new HashSet<>(charList);
        System.out.println(charSet);
        if(charSet.size() == 1)
            return "YES";
        if(charSet.size() > 2)
            return "NO";
        int count = 0;
        List<Long> listSet = new ArrayList<>(charSet);
        if(Math.abs(listSet.get(0) - listSet.get(1)) == 1L )
            return "YES";
        for(Long l : charList){
            if(Objects.equals(l, listSet.get(1)))
                count++;
        }
        if(count == 1)
            return "YES";
        else if(count == charList.size())
            return "YES";
        else if (count + 1 == charList.size()) {
            return "YES";
        }
        if(Math.abs(listSet.get(0) - listSet.get(1)) > 1)
            return "NO";
        return "NO";
    }
}
