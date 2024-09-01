DNA is a nucleic acid present in the bodies of living things. Each piece of DNA contains a number of genes, some of which are beneficial and increase the DNA's total health. Each gene has a health value, and the total health of a DNA is the sum of the health values of all the beneficial genes that occur as a substring in the DNA. We represent genes and DNA as non-empty strings of lowercase English alphabetic letters, and the same gene may appear multiple times as a susbtring of a DNA.

Given the following:

An array of beneficial gene strings, . Note that these gene sequences are not guaranteed to be distinct.
An array of gene health values, , where each  is the health value for gene .
A set of  DNA strands where the definition of each strand has three components, , , and , where string  is a DNA for which genes  are healthy.
Find and print the respective total healths of the unhealthiest (minimum total health) and healthiest (maximum total health) strands of DNA as two space-separated values on a single line.

Input Format

The first line contains an integer, , denoting the total number of genes.
The second line contains  space-separated strings describing the respective values of  (i.e., the elements of ).
The third line contains  space-separated integers describing the respective values of  (i.e., the elements of ).
The fourth line contains an integer, , denoting the number of strands of DNA to process.
Each of the  subsequent lines describes a DNA strand in the form start end d, denoting that the healthy genes for DNA strand  are  and their respective correlated health values are .

Constraints

the sum of the lengths of all genes and DNA strands
It is guaranteed that each  consists of lowercase English alphabetic letters only (i.e., a to z).
Output Format

Print two space-separated integers describing the respective total health of the unhealthiest and the healthiest strands of DNA.

Sample Input 0

6
a b c aa d b
1 2 3 4 5 6
3
1 5 caaab
0 4 xyz
2 4 bcdybc
Sample Output 0

0 19

        List<String> genes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<Integer> health = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

static HashMap<Integer, GeneHealth> genesHealthMap;
static List<String> geneList;
static List<Integer> healthList
public static void main(String[] args) {
genesHealthMap = new HashMap<>();
geneList = Arrays.asList("a", "b", "c", "aa", "d", "b");
healthList = Arrays.asList(1, 2, 3, 4, 5, 6);
for (int i = 0; i < healthList.size(); i++) {
GeneHealth geneHealth = new GeneHealth(geneList.get(i), healthList.get(i));
genesHealthMap.put(i, geneHealth);
}
}

    public static List<Integer> healthValue(int start, int end, String genes){
        int firstCount = 0;
        int secondCount = 0;
        while (firstCount < genes.length()){
            while (secondCount < genes.length()){
                String s = genes.substring(firstCount, secondCount);
                
            }
        }
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class GeneHealth {
        private String gene;
        private Integer health;
    }


