class Calculations
{
    private String response;

    public Calculations()
    {

    }

    public String calcQuad(double a,double b,double c)
    {
        String calculatedValue = "";
        
        double dValue = Math.pow(b,2) - 4 * a * c;
        double eValue = ( -b + Math.sqrt(dValue) ) / ( 2 * a );
        double fValue = ( -b - Math.sqrt(dValue) ) / ( 2 * a );

        CaluclatedValue = "Your answers are: " + eValue + " and " + fValue;

        return calculatedValue;
    }

    public String calcPythag(double a, double b, double c)
    {
        double answer = 0;

        if(a == 0)
        {
            answer = Math.pow(c,2) - Math.pow(b,2);
            answer = Math.sqrt(answer, 2);
        }
        else if(b == 0)
        {
            answer = Math.pow(c,2) - Math.pow(a,2);
            answer = Math.sqrt(answer, 2);
        }
        else if(c == 0)
        {
            answer = Math.sqrt( (Math.pow(a,2) + Math.pow(b,2)) , 2);
        }

        return "Your answer for the missing side is: " + answer;
    }



}