int insertPre_seq(PSeqList palist,int p,DataType x){
	int q;
	if(palist->n >= palist->MAXNUM){
		printf("Overflow!\n");
		return 0; 
	}
	if (p<0||p>palist->n){
		printf("Not exist!\n");
		return 0;
	}
	for(q=palist->n-1;q>=p;q--)
		palist->element[q+1] = palist->element[q];
	palist->element[q] = x;
	palist->n = palist->n+1;
	return 1;
}
