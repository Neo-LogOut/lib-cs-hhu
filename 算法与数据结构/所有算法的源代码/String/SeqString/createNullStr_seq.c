PSeqString createNullStr_seq(int m){
	PSeqStirng pstr = (PSeqString)malloc(sizeof(struct SeqString));
	if(pstr!=NULL){
		pstr->c = (char*)malloc(sizeof(char)*m);
		if(pstr->c){
			pstr->n = 0;pstr->MAXNUM = m;
			return pstr;
		}
		else free(pstr);
	}
	printf("Out of space!!\n");
	return NULL;
}
