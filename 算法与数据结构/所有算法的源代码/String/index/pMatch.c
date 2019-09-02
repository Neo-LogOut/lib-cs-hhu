int pMatch(PSeqString t,PSeqString p,int *next){
/*求p所指的串在t所指的串中第一次出现时。*/
/*p所指串的第一个元素在t所指的串中的序号
/*变量next是数组next的第一个元素next[0]的地址*/
	int i,j;
	i = 0; j = 0; /*初始化*/
	while(i< p->n && j< t->n){ /*反复比较*/
		if(i==-1 || p->c[i] == t->c[j]){ /*考虑到next[i]为-1的情况*/
		i++; j++; /*继续匹配下一字符*/
		}
		else
			i = next[i]; /*j不变，i后退*/
	}
	if(i>=p->n) 
		return(j- p->n +1); /*匹配成功，返回p中第一个字符在t中的序号*/
	else
		return 0; /*匹配失败*/
}
