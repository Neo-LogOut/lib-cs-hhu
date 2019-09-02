DataType top_seq(PSeqStack pastack){
	if(pastack->t == -1)
		printf("It is empty!\n");
	else
		return(pastack->s[pastack->t]);
}
