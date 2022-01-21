class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int spent_fuel = 0;
        int total_fuel = 0;
        int index = 0;
        for(int i=0;i<gas.length;i++){
            spent_fuel += gas[i] - cost[i];
            if(spent_fuel < 0){
                total_fuel += spent_fuel;
                spent_fuel = 0;
                index = i + 1; 
            }
            
        }
        total_fuel += spent_fuel;
        return total_fuel < 0? -1: index;
    }
}