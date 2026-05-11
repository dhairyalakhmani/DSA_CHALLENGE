import java.util.*;
class Process{
    int at, bt, ct, tat, wt, pid, rt;
    boolean firstTime;
    public Process(int pid, int at, int bt){
        this.pid = pid;
        this.at = at; 
        this.bt = bt;
        this.rt = bt;
    }
}
class Main {
    public static void main(String[] args) {
        Process[] processes = {
            new Process(1, 0, 5),
            new Process(2, 1, 4),
            new Process(3, 2, 2),
            new Process(4, 4, 1)
        };
        
        Arrays.sort(processes, (a, b) -> a.at - b.at);
        
        int timeSlice = 2;
        int currentTime = 0, n = processes.length, completedCount = 0;
        double totalTAT = 0, totalWT = 0;
        
        Queue<Process> readyQueue = new LinkedList<>();
        int processIndex = 0;
        
        while(processIndex < n && processes[processIndex].at <= currentTime){
            readyQueue.add(processes[processIndex]);
            processIndex++;
        }
        
        while(completedCount < n){
            if(readyQueue.isEmpty()){
                currentTime = processes[processIndex].at;
                while(processIndex < n && processes[processIndex].at <= currentTime){
                    readyQueue.add(processes[processIndex]);
                    processIndex++;
                }
                continue;
            }
            
            Process currentProcess = readyQueue.poll();
            
            int timeToRun = Math.min(timeSlice, currentProcess.rt);
            
            currentTime += timeToRun;
            currentProcess.rt -= timeToRun;
            
            while (processIndex < n && processes[processIndex].at <= currentTime) {
                readyQueue.add(processes[processIndex]);
                processIndex++;
            }
            
            if(currentProcess.rt > 0) readyQueue.add(currentProcess);
            else{
                currentProcess.ct = currentTime;
                currentProcess.tat = currentProcess.ct - currentProcess.at;
                currentProcess.wt = currentProcess.tat - currentProcess.bt;

                totalTAT += currentProcess.tat;
                totalWT += currentProcess.wt;
                completedCount++;
            }
        }
        System.out.println("Avg Turnaround Time: " + (totalTAT / n));
        System.out.println("Avg Waiting Time: " + (totalWT / n));
    }
}
