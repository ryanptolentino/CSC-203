public abstract class BinaryExpression implements Expression{
    private String operator;
    private final Expression lft;
    private final Expression rht;

    public BinaryExpression(final Expression lft, final Expression rht, String operator)
    {
        this.operator = operator;
        this.lft = lft;
        this.rht = rht;
    }

    public String toString()
    {
        return "(" + lft + " " + operator + " " + rht + ")";
    }
    public double evaluate(final Bindings bindings)
    {
        double left = lft.evaluate(bindings);
        double right = rht.evaluate(bindings);

        return _applyOperator(left, right);
    }
    protected abstract double _applyOperator(double lft, double rht);


}