package entities;

public class OutSourceEmployee extends Employee{
    private Double additionalCharge;

    public OutSourceEmployee(){
        super();
    }

    public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        double add = (0.1 * additionalCharge) + additionalCharge;
        return hours > 0 ? (hours * valuePerHour) + add  : 0.0;
    }
}
