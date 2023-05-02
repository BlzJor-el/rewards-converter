public class RewardValue {

    private double cash;
    private int mile;
    public RewardValue(double cash){
        cash = cash;
        mile = (int)(cash / 0.0035);
    }
    public RewardValue(int miles){
        mile = miles;
        cash = (double) (mile * 0.0035) ;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return mile;
    }

}
