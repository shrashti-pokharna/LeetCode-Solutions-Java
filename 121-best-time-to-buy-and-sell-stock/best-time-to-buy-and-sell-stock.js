/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    let buyPrice = prices[0]
    let profit = 0;

    for (i = 1; i < prices.length; i++) {
        if (buyPrice > prices[i]) {
            buyPrice = prices[i]
        } else {
            profit = Math.max(profit, prices[i] - buyPrice)

        }

    }
    return profit;


};