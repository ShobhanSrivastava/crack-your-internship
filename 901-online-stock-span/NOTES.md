# Approach
​
We'll use a stack of integer array to store the **price** and the **maximum consecutive days** for which the stock price was less than or equal to today's price.
​
In the next function,
​
* Check if the stack is empty, if yes, push the [price, 1] (array) in the stack.
* Do the same if the array price at the top is greater than the price parameter.
​
This means that this is the first time when price has gone down recently. Here 1 in the pushed array means that today's day is also counted.
​
* If the price parameter is greater than the price of the previous day, add it to days variable[initialise days with 0], pop the previous day data as there maybe some more days when the price was greater than the previous day but still less than the current price. We have to add those number of days to our days variable!
* Return days+1, accounting for the today's price
​
​
​
​
​