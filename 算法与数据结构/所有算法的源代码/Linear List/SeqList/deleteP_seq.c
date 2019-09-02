int deleteP_seq(PSeqList palist,int p){
	int q;
	if(p<0||p>palist->n-1){
		printf("Not exist!\n");
		return 0;
	}
	for(q=p;q<palist->n-1;q++)
		palist->element[q] = palist->element[q+1];
	palist->n = palist->n-1;
	return 1;
}