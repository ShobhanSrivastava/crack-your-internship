public class LC1342_NumberOfStepsToZero {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        
        int count = 1;
        
        if(num%2 == 0){
            count += numberOfSteps(num/2);
        }
        else{
            count += numberOfSteps(num-1);
        }
        
        return count;
    }
}
