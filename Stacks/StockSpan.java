package Stacks;

import java.util.Stack;

public class StockSpan {

    public static void StockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];

            while (!s.isEmpty() && currprice > stocks[s.peek()]) {
                s.pop();
            }
                if (s.isEmpty()) {
                    span[i] = i + 1;
                } else {
                    int prevhigh = s.peek();
                    span[i] = i - prevhigh;
            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[] = { 100, 200, 500, 400 };
        int span[] = new int[stocks.length];

        StockSpan(stocks, span);
    }

}
