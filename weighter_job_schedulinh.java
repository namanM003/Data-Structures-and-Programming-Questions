/*

Weighted Job Scheduling

Given N jobs where every job is represented by following three elements of it.
1) Start Time
2) Finish Time.
3) Profit or Value Associated.
Find the maximum profit subset of jobs such that no two jobs in the subset overlap. */

void maximum_profit(Jobs j[]){
	sort(j[],finish_time);
	int max_profit[]=new int[j.length];
	max_profit[0]=j[0].profit;
	for(int i=1;i<j.length;i++){
		int profit=j[i].profit;
		int pre_max=0;
		for(int j=i-1;j>=0;j--){
			if(j[i].start>j[i].finish){
				pre_max=max_profit[j];
				break;
			}
			if(profit+pre_max>max_profit[i-1]){
				max_profit[i]=profit+pre_max;
			}
			else{
				max_profit[i]=max_profit[i-1];
			}
		}
	}
	System.out.println(max_profit[j.length-1]);
}