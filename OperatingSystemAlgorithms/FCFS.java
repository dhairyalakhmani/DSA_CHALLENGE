import java.util.Arrays;
class Process{
    int pId, at, bt, ct, tat, wt;
    public Process(int pId, int at, int bt){
        this.pId = pId;
        this.at = at;
        this.bt = bt;
    }
}
class Main {
    public static void main(String[] args) {
        Process[] processes = {new Process(1, 0, 4), new Process(2, 3, 5), new Process(3, 1, 3)};
        Arrays.sort(processes, (a, b) -> a.at - b.at);
        int currentTime = 0;
        double totalCT = 0, totalTAT = 0, totalWT = 0;
        for(Process p : processes){
            if(currentTime < p.at) currentTime = p.at;
            p.ct = currentTime + p.bt;
            p.tat = p.ct - p.at;
            p.wt = p.tat - p.bt;
            
            currentTime = p.ct;
            totalCT += p.ct;
            totalTAT += p.tat;
            totalWT += p.wt;
        }
        System.out.println("Total Completion Time: " + totalCT);
        System.out.println("Avg Turn Around Time: " + totalTAT / processes.length);
        System.out.println("Avg Wait Time: " + totalWT / processes.length);
    }
}
