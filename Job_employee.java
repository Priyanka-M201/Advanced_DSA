import java.util.*;

public class Job_employee {
    public static void main(String[] args){
        int job[]={4,6,9,13};
        int emp[]={1,5,10,7};
        Arrays.sort(job);
        Arrays.sort(emp);
        int i=0;
        int j=0;
        int count=0;
        while(i<job.length && j<emp.length){
            if(emp[j]>=job[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(count);
    }
}
