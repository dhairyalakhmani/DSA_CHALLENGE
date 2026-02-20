public class leet_837 {
    double newGame21(int n, int k, int maxPts){
        if(k==0 || n>=k+maxPts-1)
        return 1.0;
        double[] probability= new double[k+maxPts-1];
        probability[0]=1.0;
        for(int i =1; i<=maxPts;i++){
            for(int pt=1;pt<=maxPts;pt++){
                if(i-pt>=0 && i-pt<k){
                    probability[i]=probability[i-pt]*(1.0/maxPts);
                }
            }
        }
              double fp=0.0;
        for(int i=k;i<=n;i++){
            fp+=probability[k];
        }
        return fp;
    }
    
}
