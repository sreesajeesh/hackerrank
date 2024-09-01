int[] intArray = new int[26];
int oddCount = 0;
for (int i = 0; i < s.length(); i++) {
char ch = s.charAt(i);
if(s.substring(i).contains(ch + "")){
intArray[ch - 'a']++;
}
}
for (int j : intArray) {
if (j % 2 == 1) {
oddCount++;
}
if (oddCount > 1)
return "NO";
}
return "YES";