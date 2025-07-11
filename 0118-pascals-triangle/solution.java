class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> l = new ArrayList<>();
            int c = 1;
            for(int j=1;j<=i;j++){
                l.add(c);
                c = c*(i-j)/j;    
            }
            list.add(l);
        }
        return list;
    }
}
