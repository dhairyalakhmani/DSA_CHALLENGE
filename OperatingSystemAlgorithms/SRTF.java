import java.util.Arrays;
class Process{
    int at, bt, ct, tat, wt, pid, rt;
    boolean firstTime;
    public Process(int pid, int at, int bt){
        this.pid = pid;
        this.at = at; 
        this.bt = bt;
        this.rt = bt;
        this.firstTime = true;
    }
}
class Main {
    public static void main(String[] args) {
        Process[] processes = {
            new Process(1, 0, 24),
            new Process(2, 1, 3),
            new Process(3, 2, 3)
        };
        
        int currentTime = 0, n = processes.length;
        double totalTAT = 0, totalWT = 0;
        int completedCount = 0, lastExecutedPid = -1;
        
        while(completedCount < n){
            int selectedIndex = -1;
            int minRemainingTime = Integer.MAX_VALUE;
            
            for(int i = 0; i < n; i++){
                Process p = processes[i];
                if(p.at <= currentTime && p.rt > 0){
                    if(p.rt < minRemainingTime){
                        selectedIndex = i;
                        minRemainingTime = p.rt;
                    }
                    else if(p.rt == minRemainingTime){
                        if(p.at < processes[selectedIndex].at) selectedIndex = i;
                    }
                }
            }
            if(selectedIndex == -1){
                currentTime++;
                continue;
            }
            
            Process p = processes[selectedIndex];
            if(lastExecutedPid != p.pid) lastExecutedPid = p.pid;
            if(p.firstTime) p.firstTime = false;
            p.rt--;
            currentTime++;
            
            if(p.rt == 0){
                p.ct = currentTime;
                p.tat = p.ct - p.at;
                p.wt = p.tat - p.bt;
                
                totalTAT += p.tat;
                totalWT += p.wt;
                completedCount++;
            }
        }
        System.out.println("Avg Turn Around Time: " + totalTAT / processes.length);
        System.out.println("Avg Wait Time: " + totalWT / processes.length);
    }
}
