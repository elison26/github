class LightBill extends Personal {
    String meter_no;
    int num_units;
    double cost_per_unit;

    LightBill(String meter_no, int num_units){
        this.meter_no = meter_no;
        this.num_units = num_units;
    }

    void displayBill(){
        float cost = getCost();
        System.out.println("Name: "+ getName());
        System.out.println("Address: "+ getAddress());
        System.out.println("Meter No: "+meter_no);
        System.out.println("Cost: "+cost);
    }

    private float getCost() {
        // compute cost
        final boolean bCostPerUnit10 = num_units > 1000;
        final boolean bCostPerUnit8 = num_units>600 && num_units<=1000;
        final boolean bCostPerUnit6 = num_units>400 && num_units<=600;
        if(bCostPerUnit10){
            cost_per_unit = 10.0;
        }
        else if(bCostPerUnit8){
            cost_per_unit=8.0;
        }
        else if(bCostPerUnit6){
            cost_per_unit=6.0;
        }
        else {
            cost_per_unit=4.0;
        }
        float cost =(float) (num_units*cost_per_unit);
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
	    LightBill myBill = new LightBill("mga123444444",900);
	    myBill.setName("Elison");
	    myBill.setAddress("Goa");
	    myBill.displayBill();
    }
}