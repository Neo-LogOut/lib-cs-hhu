void push_seq(PSeqStack pastack,DataType x){
	if(pastack->t >= MAXNUM-1)
		prirtf("Overflow!\n");
	else{
		pastack->t = pastack->t+1;
		pastack->s[pastack->t] = x;
	}
}