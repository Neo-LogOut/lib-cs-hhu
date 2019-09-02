int locate_seq(PSeqList palist,DataType x){
	int q;
	for(q=0;q<palist->n;q++)
	if(palist->element[q] == x) return q;
	return -1;
}