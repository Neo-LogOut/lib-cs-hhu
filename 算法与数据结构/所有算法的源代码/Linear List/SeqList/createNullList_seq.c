PSeqList createNullList_seq(int m){
	PSeqList palist = (PSeqList)malloc(sizeof(struct SeqList));
	if(palist!=NULL){
		palist->element = (DataType*)malloc(sizeof(DataType)*m);
		if(palist->element){
			palist->MAXNUM = m;
			palist->n = 0;
			return palist;
		}
		else free(palist);
	}
	printf("Out of space!!\n");
	return NULL;
}
