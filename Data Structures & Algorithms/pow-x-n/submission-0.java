class Solution {
    public double myPow(double x, int n) {
        long e=n;
        if(e<0)
        {
            x=1/x;
            e=-e;
        }
        double result=1.0;
        while(e>0)
        {
            if(e%2==1)
            {
                result*=x;
            }
            x=x*x;
            e/=2;
        }
        return result;
    }
}
