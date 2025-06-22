
public class BuyandSellStock {
    public static void buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        buyprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice; //todays profit
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println("Maximum profit is "+maxprofit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        buyandsell(prices);
    }
}
