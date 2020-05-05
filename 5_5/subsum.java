//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0

import java.util.*;

class subsum{
    public static void main(String args[]){
        int t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while(t--!=0){	

        	int n,sum;

        	n = s.nextInt();	
			int a[] = new int[n];

        	sum = s.nextInt();

        	for(int j=0;j<n;j++){
        		a[j] = s.nextInt();
        	}

        	int j,tab=0,csum=0,flag=0;
        	for(j=0;j<n;j++){
        		csum+=a[j];
        		while(csum>sum){
        			csum-=a[tab];
        			tab++;
        		}
        		if(csum==sum){
        			flag=1;
        			break;
        		}
        	}

        	if(flag==1){
        		System.out.println(tab+" "+j);
        	}
        	else{
        		System.out.println("-1");
        	}

        }
    }
}    