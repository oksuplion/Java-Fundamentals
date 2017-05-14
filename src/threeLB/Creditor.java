package threeLB;
class Creditor
{
    private double amountOfCredit;
    private double rateOfCredit;
    private int monthOfCredit;

    public Creditor(double aAmountOfCredit, double aRateOfCredit, int aMonthOfCredit)
    {
        amountOfCredit = aAmountOfCredit;
        rateOfCredit = aRateOfCredit;
        monthOfCredit = aMonthOfCredit;
    }

    public double getCredit()
    {
        double overPayment =0;
        for (int i=0; i<monthOfCredit; i++)
        {
            double overpaymentOfMonth = (amountOfCredit/100*rateOfCredit/365)*30;// не округленное число
            double payEveryMonth = amountOfCredit/12 + overpaymentOfMonth;
            System.out.println(" К оплте за "+(i+1)+" месяц "+ payEveryMonth);
            System.out.println();
            overPayment += overpaymentOfMonth;
        }
        return overPayment;
    }
}