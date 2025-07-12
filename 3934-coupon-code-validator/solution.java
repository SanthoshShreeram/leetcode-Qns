class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> coupons = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(isValidCoupon(code[i],businessLine[i],isActive[i])){
                coupons.add(new Coupon(code[i],businessLine[i]));
            }
        }
        Collections.sort(coupons, (c1,c2)->{
            int order1 = getOrder(c1.businessLine);
            int order2 = getOrder(c2.businessLine);
            if(order1!=order2){
                return Integer.compare(order1,order2);
            }
            else{
                return c1.code.compareTo(c2.code);
            }
        });
        List<String> result = new ArrayList<>();
        for(Coupon c:coupons){
            result.add(c.code);
        }
        return result;
    }
    public boolean isValidCoupon(String code, String businessLine, boolean isActive){
        if(!isActive){
            return false;
        }
        if(code.isEmpty()){
            return false;
        }
        for(char c: code.toCharArray()){
            if(!Character.isLetterOrDigit(c) && c!='_'){
                return false;
            }
        }
        return  businessLine.equals("grocery") || businessLine.equals("electronics") ||businessLine.equals("pharmacy") || businessLine.equals("restaurant");
    }
    public int getOrder(String businessLine){
        switch(businessLine){
            case "electronics":
                return 0;
            case "grocery":
                return 1;
            case "pharmacy":
                return 2;
            case "restaurant":
                return 3;
            default:
                return -1;
        }
    }
    private static class Coupon{
        String code;
        String businessLine;
        Coupon(String code, String businessLine){
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
