#!/bin/bash
read -p "Input a number: " num r t
sum=0
for((t=num;num!=0;num=num/10))
	do
		r=$((num%10))
		sum=$((sum*10+r))
	done
	if((t==sum))
	then
		echo $t
	else
	echo "Is not Panlindrome: "$t
	fi
