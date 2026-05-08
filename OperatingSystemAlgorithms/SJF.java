import java.util.Arrays;
class Process{
    int pId, at, bt, ct, tat, wt;
    boolean completed;
    public Process(int pId, int at, int bt){
        this.pId = pId;
        this.at = at;
        this.bt = bt;
        this.completed = false;
    }
}
class Main {
    public static void main(String[] args) {
        Process[] processes = {new Process(1, 0, 4), new Process(2, 3, 5), new Process(3, 1, 3)};
        Arrays.sort(processes, (a, b) -> a.at - b.at);
        int currentTime = 0, completedCount = 0, n = processes.length;
        double totalCT = 0, totalTAT = 0, totalWT = 0;
        while(completedCount < n){
            int selected = -1;
            int minBT = Integer.MAX_VALUE;
            
            for(int i = 0; i < n; i++){
                Process p = processes[i];
                if(!p.completed && p.at <= currentTime){
                    if(p.bt < minBT){
                        minBT = p.bt;
                        selected = i;
                    }
                }
            }
            if(selected == -1){
                currentTime++;
                continue;
            }
            Process sp = processes[selected];
            sp.ct = currentTime + sp.bt;
            sp.tat = sp.ct - sp.at;
            sp.wt = sp.tat - sp.bt;
            sp.completed = true;
            completedCount++;
            currentTime = sp.ct;
            totalCT += sp.ct;
            totalTAT += sp.tat;
            totalWT += sp.wt;
        }
        System.out.println("Total Completion Time: " + totalCT);
        System.out.println("Avg Turn Around Time: " + totalTAT / processes.length);
        System.out.println("Avg Wait Time: " + totalWT / processes.length);
    }
}
