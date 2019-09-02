makeNext(PSeqString p,int *next){
	int i = 0,k = -1;
	next[0] = -1; /*初始化*/
	while(i< p->n -1){ /*计算next[i+1]*/
		while(k>=0 && p->c[i] != p->c[k]) k = next[k];
		i++;k++;
		next[i] = k; /*有待改进！！*/
	}
}

makeNext(PSeqString p,int *next){
	int i = 0, k = -1;
	next[0] = -1;
	while(i< p->n -1){
		while(k>=0 && p->c[i] != p->c[k]) k = next[k];
		i++;k++;
		if(p->c[i] == p->c[k]) next[i] = next[k]; 
		/*填写next[i]同时考虑改善*/
		else next[i] = k;
	}
}