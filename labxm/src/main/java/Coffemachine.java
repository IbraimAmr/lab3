public class Coffemachine {
    public boolean power_on = false;
    public boolean ligth_on = false;
    public boolean busy = false;
    public float coins;
    private final float price = 12 ;
    public int noofcups;

    public String addcoins (int money) {
        if (power_on) {
            this.coins = money;
            return "added coins Successfully ";
        } else {
            return "please turn on coffee machine ";
        }
    }
    public String openmachine(){
        if(!power_on){
            power_on = true;
            ligth_on = true;
            return "Power on" + "lights on";
        }
        else {
            return "Error";
        }
    }
    public String closemachine(){
        if(power_on) {
            ligth_on= false;
            power_on = false;
            return "Lights Off!" + "Power Off!";
        }
        else{
            return "Error occured";
        }
    }

    public String makeCoffee(int amountofcoffee){
        if(power_on) {
            int i= 0;
            if (coins >= price) {
                while(coins>= price && amountofcoffee > 0){
                    coins -= price;
                    busy = true;
                    amountofcoffee --;
                    i++;
                }
            }
            else {
                return "Not enough balance";
            }
            busy = false;
            return i+ " Cup Of coffee Made!";
        }
        else{
            return "Please turn on the machine first!";
        }
    }

    public static void main(String[] args) {

    }
}
