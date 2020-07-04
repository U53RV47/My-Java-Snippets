//Numbers with same number of digit frequency are Stable Numbers and vice-versa
public static void stableUnstable(int[] arr){
	List<Integer> unstable=new ArrayList<Integer>();
	List<Integer> stable=new ArrayList<Integer>();
	boolean flag=true;
	int temp=0, i=0, j=0, freq=0;
	for(i=0;i<arr.size();i++){
		temp=arr[i];
		int[] f=new int[10];
		flag=true;
		while(temp>0){
			f[temp%10]++;
			temp=temp/10;
		}
		for(j=0;j<10;j++){
			if(f[j]!=0){
				freq=f[j];
				break;
			}
		}
		for(j=0;j<10;j++){
			if(f[j]!=0 && f[j]!=freq){
				flag=false;
				break;
			}
		}
		if(flag){
			stable.add(arr[i]);
		}
		else{
			unstable.add(arr[i]);
		}
	}
	System.out.println("Stable Numbers are: ");
	for(i=0;i<stable.size();i++){
		System.out.print(stable.get(i)+" ");
	}
	System.out.println();	
	System.out.println("Unstable Numbers are: ");
	for(i=0;i<stable.size();i++){
		System.out.print(unstable.get(i)+" ");
	}
}