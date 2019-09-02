void pop_seq(PSeqStack pastack){
	if(pastack->t == -1)
		printf("Underflow!\n");
	else
		pastack->t = pastack->t-1; 
}