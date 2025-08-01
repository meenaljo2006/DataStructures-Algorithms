package Arrays;

public class buySellStock {

    static int maxProfit(int[] prices){

        int maxProfit=0;
        int buyDay = 0;
        int sellDay = 0;

        // for(int i=1;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]-prices[i]>maxProfit){
        //             maxProfit = prices[j]-prices[i];
        //             buyDay = i;
        //             sellDay = j;
        //         }
                
        //     }
        // }

        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i]; //buyprice
            } else {
                int profit = prices[i]-minPrice; //sellprice
                maxProfit = profit; 
            }
           
           
        }
        // System.out.println(minPrice);
        // System.out.println(sell);

        // System.out.println("Buy on Day "+buyDay+" and sell on Day "+sellDay);

        return maxProfit;



    }

    public static void main(String[] args) {
        
        int[] price1 = {7,1,5,3,6,4};
        int[] price2 = {7,6,4,3,1};
        System.out.println(maxProfit(price2));



    }
    
}

//TC= O(N^2) after that used min so far approach and tc = O(n)
//SC =O
