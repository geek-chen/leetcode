public class hammingWeight {
    public int hammingWeight(int a) {
        int n = 0;
        char ch = '1';
        String m = Integer.toBinaryString(a);
        char data[] = m.toCharArray();
        for (char datum : data) {
            if (datum == ch) {
                n++;
            }
        }
        return n;
    }
}
